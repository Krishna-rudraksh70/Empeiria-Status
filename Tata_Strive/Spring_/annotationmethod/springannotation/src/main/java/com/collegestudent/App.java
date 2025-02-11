package com.collegestudent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collegestudent.config.CollegeConfig;
import com.collegestudent.service.College;
import com.collegestudent.service.EngineeringCollege;
import com.collegestudent.service.MedicalCollege;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class)) {
            College engineeringCollege = context.getBean(EngineeringCollege.class);
            College medicalCollege = context.getBean(MedicalCollege.class);

            engineeringCollege.showStudents();
            medicalCollege.showStudents();
        }
    }
}
