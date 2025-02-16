package com.iostreamjdbc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISBN", nullable = false, unique = true)
    private int bId;

    @Column(length = 15, nullable = false)
    private String bTitle;

    @Column(nullable = false)
    private int publicationYear;

    @Column(nullable = false)
    private int copies;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author bAuthor;

    public Book(String title, int publicationYear, int copies, Author author) {
        this.bTitle = title;
        this.publicationYear = publicationYear;
        this.copies = copies;
        this.bAuthor = author;
    }

}