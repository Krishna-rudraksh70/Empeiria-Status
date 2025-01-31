package com.arklibrary.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bId;

    @Column(length = 15)
    private String bName;

    @Column(nullable = false, unique = true, length = 20)
    private String bEmail;

    @Column(nullable = false)
    private String bPhoneNumber;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bid")
    private List<Book> borrowedBooks;
}