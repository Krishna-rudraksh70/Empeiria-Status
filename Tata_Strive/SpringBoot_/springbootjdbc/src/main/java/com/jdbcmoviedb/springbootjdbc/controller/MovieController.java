package com.jdbcmoviedb.springbootjdbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcmoviedb.springbootjdbc.model.Movie;
import com.jdbcmoviedb.springbootjdbc.service.MovieService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Movie movie) {
        if (movieService.addMovie(movie) > 0)
            return ResponseEntity.ok("Movie added successfully!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to add review.");
    }

    @DeleteMapping("/{imdbId}")
    public ResponseEntity<String> delete(@PathVariable String imdbId) {
        if (movieService.deleteMovie(imdbId) > 0)
            return ResponseEntity.ok("Movie deleted successfully!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to delete review.");
    }

    @PutMapping("/{imdbId}")
    public ResponseEntity<String> update(@PathVariable String imdbId, @RequestBody Movie movie) {
        movie.setImdbId(imdbId);
        if (movieService.updateMovie(movie) > 0)
            return ResponseEntity.ok("Movie updated successfully!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update review.");
    }

    @GetMapping("/{imdbId}")
    public Movie getById(@PathVariable String imdbId) {
        return movieService.getMovieById(imdbId);
    }

    @GetMapping("/")
    public List<Movie> getAll() {
        return movieService.getAllMovies();
    }   
    
}