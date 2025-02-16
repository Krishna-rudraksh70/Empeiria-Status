package com.jdbcmoviedb.springbootjdbc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jdbcmoviedb.springbootjdbc.model.Movie;
import com.jdbcmoviedb.springbootjdbc.repository.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public void initialize() {
        movieRepository.createTable();
    }

    @Override
    public int addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public int deleteMovie(String imdbId) {
        return movieRepository.delete(imdbId);
    }

    @Override
    public int updateMovie(Movie movie) {
        return movieRepository.update(movie);
    }

    @Override
    public Movie getMovieById(String imdbId) {
        return movieRepository.findById(imdbId);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    
}
