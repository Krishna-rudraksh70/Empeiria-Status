package com.jdbcmoviedb.springbootjdbc.service;

import java.util.List;

import com.jdbcmoviedb.springbootjdbc.model.Review;

public interface ReviewService {
    void initialize();

    int addReview(Review review);

    int deleteReview(int id);

    int updateReview(Review review);

    Review geReviewById(int id);

    List<Review> getAllReviews(String imdbId); 
}