package com.moviedb.springcollectiondb.repository;

import java.util.List;
import java.util.Optional;

import com.moviedb.springcollectiondb.entity.Movie;

public interface MovieRepository {
    void save(Movie movie);
    void deleteById(String imdbId);
    Optional<Movie> findById(String imdbId);
    List<Movie> findAll();
    List<Movie> findByRating(double rating);
}
