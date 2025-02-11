package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Author;
import com.library.repository.AuthorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthorServiceImp implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void updateAuthor(Author author) {
        authorRepository.update(author);
    }

    @Override
    public void removeAuthor(int id) {
        authorRepository.delete(id);
    }

    @Override
    public Author getAuthor(int id) {
        return authorRepository.getById(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.getAll();
    }
    
}
