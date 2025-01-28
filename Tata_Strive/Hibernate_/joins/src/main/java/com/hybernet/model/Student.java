package com.hybernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    // @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "st_id")
    private int stRollNo;

    @Column(name = "st_name", length = 20)
    private String stName;

    @Column(name = "st_course", length = 20)
    private String stCourse;

}