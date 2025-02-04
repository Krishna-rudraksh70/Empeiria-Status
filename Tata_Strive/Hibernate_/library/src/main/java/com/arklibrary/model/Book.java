package com.arklibrary.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISBN", nullable = false, unique = true)
    private int bId;

    @Column(length = 15, nullable = false)
    private String bTitle;

    @Column(nullable = false)
    private double bPrice;

    @Column(nullable = false)
    private int publicationYear;

    @Column(nullable = false)
    private int copies;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "aid", nullable = false)
    private Author bAuthor;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "book_borrower",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "borrower_id")
    )
    private List<Borrower> borrower; 
 
}