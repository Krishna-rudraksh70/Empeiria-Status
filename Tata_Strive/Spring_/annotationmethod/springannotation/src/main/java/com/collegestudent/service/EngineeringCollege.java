package com.collegestudent.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.collegestudent.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineeringCollege implements College {

    private List<Student> students;

    @Override
    public void showStudents() {
        System.out.println("Engineering College Students:");
        students.forEach(s -> System.out.println(s));
    }
}