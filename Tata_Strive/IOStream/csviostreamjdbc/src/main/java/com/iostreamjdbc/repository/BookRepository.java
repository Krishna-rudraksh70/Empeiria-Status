package com.iostreamjdbc.repository;

import java.util.List;

import com.iostreamjdbc.model.Book;

public interface BookRepository {
    void save(Book book);

    void update(Book book);

    void delete(int id);

    Book getById(int id);

    List<Book> getAll();
}