package com.hybernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// import lombok.RequiredArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
@Data // @Getter + @Setter + @ToString + RequireArgsConstructor
//@RequiredArgsConstructor // runtime dependent construction according to args // but this MF don't work
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "u_id")
    private int Id;

    @Column(length = 20)
    private String name;

    @Column(length = 12)
    private String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

}