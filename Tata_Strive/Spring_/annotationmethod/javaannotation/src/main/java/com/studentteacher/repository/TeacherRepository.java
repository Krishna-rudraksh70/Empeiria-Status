package com.studentteacher.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository {

    public void save() {
        System.out.println("Saving teacher data to database...");
    }
}