package com.autowire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EngineeringCollege {

    private List<Student> students;

    @Autowired
    public EngineeringCollege(@Qualifier("eng") List<Student> students) {
        this.students = students;
    }

    public void showStudents() {
        System.out.println("Engineering Students:");
        students.forEach(s -> System.out.println(s.getId() + " - " + s.getName()));
    }
}
