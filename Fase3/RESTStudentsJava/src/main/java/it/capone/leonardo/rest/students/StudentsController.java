package it.capone.leonardo.rest.students;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    static private HashSet<Student> students = new HashSet<>();

    @GetMapping("/students")
    HashMap<String, Object> all() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("students", students);
        return map;
    }

    @PostMapping("/students")
    boolean newStudent(@RequestBody Map<String, String> body) {
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String birthdate = body.get("birthdate");
        String grades = body.get("grades");

        if(firstname != null &&
            lastname != null &&
            birthdate != null &&
            grades != null)
            return this.students.add(new Student(firstname, lastname, birthdate, grades));
        else
            return false;
    }







}
