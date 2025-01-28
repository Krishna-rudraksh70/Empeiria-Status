package com.hybernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stRollNo;

    @Column(length = 20)
    private String stName;

    @Column(length = 20)
    private String stCourse;

    private int stAge;

    @ManyToOne
    @JoinColumn(name = "tid")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "addId")
    private Address address;

    public Student(String stName, String stCourse, int stAge, Teacher teacher, Address address) {
        this.stName = stName;
        this.stCourse = stCourse;
        this.stAge = stAge;
        this.teacher = teacher;
        this.address = address;
    }

}