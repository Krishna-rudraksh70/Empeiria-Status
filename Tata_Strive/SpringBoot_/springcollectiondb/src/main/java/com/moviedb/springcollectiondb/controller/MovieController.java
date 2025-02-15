package com.moviedb.springcollectiondb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedb.springcollectiondb.entity.Movie;
import com.moviedb.springcollectiondb.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return ResponseEntity.ok("Movie added successfully!");
    }

    @DeleteMapping("/{imdbId}")
    public ResponseEntity<String> deleteMovie(@PathVariable String imdbId) {
        movieService.deleteMovie(imdbId);
        return ResponseEntity.ok("Movie deleted successfully!");
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String imdbId) {
        Optional<Movie> movie = movieService.getMovieById(imdbId);
        return movie.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/r/{rating}")
    public ResponseEntity<List<Movie>> getMovieByRating(@PathVariable double rating) {
        return ResponseEntity.ok(movieService.getMoviesByRating(rating));
    }
}