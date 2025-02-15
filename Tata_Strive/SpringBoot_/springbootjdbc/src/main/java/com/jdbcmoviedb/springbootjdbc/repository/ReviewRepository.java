package com.jdbcmoviedb.springbootjdbc.repository;

import java.util.List;

import com.jdbcmoviedb.springbootjdbc.model.Review;

public interface ReviewRepository {
    void createTable();

    int save(Review review);

    int delete(int id);

    int update(Review review);

    Review findById(int id);

    List<Review> findAll(String imdbId);
}