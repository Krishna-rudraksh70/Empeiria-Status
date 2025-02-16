package com.moviedb.springcollectiondb.service;

import java.util.List;
import java.util.Optional;

import com.moviedb.springcollectiondb.entity.Movie;

public interface MovieService {
    void addMovie(Movie movieDto);
    void deleteMovie(String imdbId);
    Optional<Movie> getMovieById(String imdbId);
    List<Movie> getAllMovies();
    List<Movie> getMoviesByRating(double rating);  
}