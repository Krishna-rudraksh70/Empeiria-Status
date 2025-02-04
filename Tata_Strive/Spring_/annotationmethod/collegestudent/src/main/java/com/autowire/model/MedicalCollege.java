package com.autowire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicalCollege {

    private List<Student> students;

    @Autowired
    public MedicalCollege(@Qualifier("med") List<Student> students) {
        this.students = students;
    }

    public void showStudents() {
        System.out.println("Medical Students:");
        students.forEach(s -> System.out.println(s.getId() + " - " + s.getName()));
    }
}
