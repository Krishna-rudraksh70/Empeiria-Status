package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowire.config.AppConfig;
import com.autowire.model.EngineeringCollege;
import com.autowire.model.MedicalCollege;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EngineeringCollege eng = context.getBean(EngineeringCollege.class);
        MedicalCollege med = context.getBean(MedicalCollege.class);

        eng.showStudents();
        med.showStudents();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
