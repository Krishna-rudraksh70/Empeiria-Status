package com.studentteacher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentteacher.model.Teacher;
import com.studentteacher.repository.TeacherRepository;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void hireTeacher(Teacher teacher) {
        System.out.println("Hiring teacher: " + teacher);
        this.teacherRepository.save();
    }
}