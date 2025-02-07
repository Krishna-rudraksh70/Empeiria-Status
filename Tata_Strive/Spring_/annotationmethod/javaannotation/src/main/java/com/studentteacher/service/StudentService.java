package com.studentteacher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentteacher.model.Student;
import com.studentteacher.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void enrollStudent(Student student) {
        System.out.println("Enrolling student: " + student);
        this.studentRepository.save();
    }
}