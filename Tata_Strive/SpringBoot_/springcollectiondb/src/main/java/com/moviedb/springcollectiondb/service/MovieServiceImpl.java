package com.moviedb.springcollectiondb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviedb.springcollectiondb.entity.Movie;
import com.moviedb.springcollectiondb.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{
    
    private final MovieRepository movieRepository;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(String imdbId) {
        movieRepository.deleteById(imdbId);
    }

    @Override
    public Optional<Movie> getMovieById(String imdbId) {
        return movieRepository.findById(imdbId);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getMoviesByRating(double rating) {
        return movieRepository.findByRating(rating);
    }

}
