package com.test.testspringboot.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.testspringboot.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentJSON {
    @GetMapping("/student/{name}")
    public Student getStudent(@PathVariable String name) {
        return new Student(36790, name, 12, 'A');
    }

    @PostMapping("/Student")
    public Student postStudent(@RequestBody Student student) {
        return student;
    }
    
}