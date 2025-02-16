package com.iostreamjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iostreamjdbc.model.Book;
import com.iostreamjdbc.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookServiceImp implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.update(book);
    }

    @Override
    public void removeBook(int id) {
        bookRepository.delete(id);
    }

    @Override
    public Book getBook(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAll();
    }

}
