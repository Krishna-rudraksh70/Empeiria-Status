package com.moviedb.springcollectiondb.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.moviedb.springcollectiondb.entity.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private final List<Movie> movies = new LinkedList<>();

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void deleteById(String imdbId) {
        movies.removeIf(movie -> movie.getImdbId().equals(imdbId));
    }

    @Override
    public Optional<Movie> findById(String imdbId) {
        return movies.stream().filter(movie -> movie.getImdbId().equals(imdbId)).findFirst();
    }

    @Override
    public List<Movie> findAll() {
        return new LinkedList<>(movies);
    }

    @Override
    public List<Movie> findByRating(double rating) {
        return movies.stream()
                .filter(movie -> movie.getImdbRating() >= rating)
                .collect(Collectors.toList());
    }
    
}
