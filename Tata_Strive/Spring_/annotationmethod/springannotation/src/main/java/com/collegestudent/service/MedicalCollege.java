package com.collegestudent.service;

import org.springframework.stereotype.Component;

import com.collegestudent.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalCollege implements College{

    private List<Student> students;

    @Override
    public void showStudents() {
        System.out.println("Medical College Students:");
        students.forEach(s -> System.out.println(s));
    }
}
