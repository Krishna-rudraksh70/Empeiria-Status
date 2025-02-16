package com.iostreamjdbc.repository;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iostreamjdbc.model.Book;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BookRepositoryImp implements BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Book book) {
        sessionFactory.getCurrentSession().persist(book);
    }

    @Override
    public void update(Book book) {
        sessionFactory.getCurrentSession().merge(book);
    }

    @Override
    public void delete(int id) {
        Book book = getById(id);

        if (book != null) {
            sessionFactory.getCurrentSession().remove(book);
        } else {
            System.out.println("Book isn't paresent");
        }
    }

    @Override
    public Book getById(int id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> getAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Book", Book.class).list();
    }

}
