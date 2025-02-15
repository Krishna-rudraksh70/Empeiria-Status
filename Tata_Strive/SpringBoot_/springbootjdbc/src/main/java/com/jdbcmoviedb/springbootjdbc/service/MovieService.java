package com.jdbcmoviedb.springbootjdbc.service;

import java.util.List;

import com.jdbcmoviedb.springbootjdbc.model.Movie;

public interface MovieService {
    void initialize();

    int addMovie(Movie movie);

    int deleteMovie(String imdbId);

    int updateMovie(Movie movie);

    Movie getMovieById(String imdbId);

    List<Movie> getAllMovies();
}