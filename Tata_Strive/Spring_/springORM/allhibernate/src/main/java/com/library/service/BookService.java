package com.library.service;

import java.util.List;

import com.library.model.Book;

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBook(int id);

    List<Book> getAllBooks();
}