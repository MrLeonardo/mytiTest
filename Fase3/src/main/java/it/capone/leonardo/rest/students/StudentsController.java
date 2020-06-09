package it.capone.leonardo.rest.students;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    static private List<Student> students = new LinkedList<>();

    @GetMapping("/students")
    List<Student> all() {
        return students;
    }

    @PostMapping("/employees")
    boolean newStudent(@RequestBody Student newStudent) {
        return students.add(newStudent);
    }




}
