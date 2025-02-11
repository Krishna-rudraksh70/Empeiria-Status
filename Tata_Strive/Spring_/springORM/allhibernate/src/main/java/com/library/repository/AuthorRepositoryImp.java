package com.library.repository;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Author;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AuthorRepositoryImp implements AuthorRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Author author) {
        sessionFactory.getCurrentSession().persist(author);
    }

    @Override
    public void update(Author author) {
        sessionFactory.getCurrentSession().merge(author);
    }

    @Override
    public void delete(int id) {
        Author author = getById(id);

        if (author != null) {
            sessionFactory.getCurrentSession().remove(author);
        } else {
            System.out.println("Author isn't paresent");
        }
    }

    @Override
    public Author getById(int id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }

    @Override
    public List<Author> getAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Author", Author.class).list();
    }

}
