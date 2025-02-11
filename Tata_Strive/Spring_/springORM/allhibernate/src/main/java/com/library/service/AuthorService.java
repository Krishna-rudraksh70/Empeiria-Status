package com.library.service;

import java.util.List;

import com.library.model.Author;

public interface AuthorService {
    void addAuthor(Author author);

    void updateAuthor(Author author);
    
    void removeAuthor(int id);

    Author getAuthor(int id);

    List<Author> getAllAuthors();
}
