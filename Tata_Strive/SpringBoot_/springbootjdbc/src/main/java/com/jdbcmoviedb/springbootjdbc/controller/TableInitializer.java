package com.jdbcmoviedb.springbootjdbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcmoviedb.springbootjdbc.service.MovieService;
import com.jdbcmoviedb.springbootjdbc.service.ReviewService;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TableInitializer {
    private final MovieService movieService;
    private final ReviewService reviewService;

    @PostMapping    
    public ResponseEntity<String> Start() {
        movieService.initialize();
        reviewService.initialize();
        return ResponseEntity.ok("Movies and Reviews Table Created");
    }
    
}
