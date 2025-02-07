package com.studentteacher.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save() {
        System.out.println("Saving student data to database...");
    }
    
}