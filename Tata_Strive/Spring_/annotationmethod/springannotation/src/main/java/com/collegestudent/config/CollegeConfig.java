package com.collegestudent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.collegestudent.model.Student;
import com.collegestudent.service.College;
import com.collegestudent.service.EngineeringCollege;
import com.collegestudent.service.MedicalCollege;

import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.collegestudent.model")
public class CollegeConfig {

    @Bean
    public List<Student> engineeringStudents() {
        return Arrays.asList(
                new Student("Krishna", 1),
                new Student("Rudraksh", 2),
                new Student("Aashif", 3)
        );
    }

    @Bean
    public List<Student> medicalStudents() {
        return Arrays.asList(
                new Student("Jermine", 4),
                new Student("Kendrick", 5),
                new Student("Vince", 6)
        );
    }

    @Bean
    public College engineeringCollege() {
        return new EngineeringCollege(engineeringStudents());
    }

    @Bean
    public College medicalCollege() {
        return new MedicalCollege(medicalStudents());
    }
}
