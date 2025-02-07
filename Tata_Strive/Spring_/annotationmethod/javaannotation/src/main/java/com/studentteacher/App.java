package com.studentteacher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.studentteacher.config.AppConfig;

import com.studentteacher.model.Student;
import com.studentteacher.model.Subject;
import com.studentteacher.model.Teacher;

import com.studentteacher.service.StudentService;
import com.studentteacher.service.TeacherService;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);
        TeacherService teacherService = context.getBean(TeacherService.class);

        Student student = new Student("Krishna", 22);
        Subject subject = new Subject("Mathematics");
        Teacher teacher = new Teacher("Mr. Rudraksh", subject);

        studentService.enrollStudent(student);
        teacherService.hireTeacher(teacher);

        context.close();
    }
}
