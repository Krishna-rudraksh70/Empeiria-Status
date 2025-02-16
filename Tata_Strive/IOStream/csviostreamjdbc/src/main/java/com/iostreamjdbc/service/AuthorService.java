package com.iostreamjdbc.service;

import java.util.List;

import com.iostreamjdbc.model.Author;

public interface AuthorService {
    void addAuthor(Author author);

    void updateAuthor(Author author);
    
    void removeAuthor(int id);

    Author getAuthor(int id);

    List<Author> getAllAuthors();
}
