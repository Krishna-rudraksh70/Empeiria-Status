package com.library.repository;

import java.util.List;

import com.library.model.Book;

public interface BookRepository {
    void save(Book book);

    void update(Book book);

    void delete(int id);

    Book getById(int id);

    List<Book> getAll();
}