package com.library.repository;

import java.util.List;

import com.library.model.Author;

public interface AuthorRepository {
    void save(Author author);

    void update(Author author);

    void delete(int id);

    Author getById(int id);

    List<Author> getAll();
}
