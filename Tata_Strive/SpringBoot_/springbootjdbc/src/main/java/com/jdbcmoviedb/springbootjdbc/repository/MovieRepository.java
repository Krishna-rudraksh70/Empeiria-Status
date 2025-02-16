package com.jdbcmoviedb.springbootjdbc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdbcmoviedb.springbootjdbc.model.Movie;

@Repository
public interface MovieRepository {
    void createTable();

    int save(Movie movie);

    int delete(String imdbId);

    int update(Movie movie);

    Movie findById(String imdbId);

    List<Movie> findAll();
}