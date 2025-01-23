package com.hybernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int Id;

    @Column(length = 20)
    private String name;

    @Column(length = 12)
    private String password;

    public User(int id, String name, String password) {
        Id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}