package com.jdbcmoviedb.springbootjdbc.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcmoviedb.springbootjdbc.model.Review;
import com.jdbcmoviedb.springbootjdbc.service.ReviewService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/reviews")
@AllArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Review review) {
            if (reviewService.addReview(review) > 0)
                return ResponseEntity.ok("Review added successfully!");
            else
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to add review.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        if (reviewService.deleteReview(id) > 0)
            return ResponseEntity.ok("Review deleted successfully!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to delete review.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Review review) {
        review.setId(id);
        if (reviewService.updateReview(review) > 0)    
            return ResponseEntity.ok("Review updated successfully!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update review.");
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable int id) {
        return reviewService.geReviewById(id);
    }

    @GetMapping("/r/{imdbId}")
    public List<Review> getAll(@PathVariable String imdbId) {
        return reviewService.getAllReviews(imdbId);
    }
}