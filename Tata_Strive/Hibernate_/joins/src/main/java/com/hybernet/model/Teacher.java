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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;

    @Column(length = 20)
    private String tname;

    @Column(length = 20)
    private String tcourse;

    @Column(length = 20)
    private String tdept;

    @ManyToOne
    @JoinColumn(name = "addId")
    private Address address;

    public Teacher(String tname, String tcourse, String tdept, Address address) {
        this.tname = tname;
        this.tcourse = tcourse;
        this.tdept = tdept;
        this.address = address;
    }
    
}