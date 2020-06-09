package it.capone.leonardo.rest.students;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    static private HashSet<Student> students = new HashSet<>();

    @GetMapping("/students")
    HashSet<Student> all() {
        return students;
    }

    @PostMapping("/students")
    boolean newStudent(@RequestBody Map<String, String> body) {
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String birthdate = body.get("birthdate");
        String grades = body.get("grades");
        return this.students.add(new Student(firstname, lastname, birthdate, grades));
    }







}
