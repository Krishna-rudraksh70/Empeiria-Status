package com.jdbcmoviedb.springbootjdbc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jdbcmoviedb.springbootjdbc.model.Review;
import com.jdbcmoviedb.springbootjdbc.repository.ReviewRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public void initialize() {
        reviewRepository.createTable();
    }

    @Override
    public int addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public int deleteReview(int id) {
        return reviewRepository.delete(id);
    }

    @Override
    public int updateReview(Review review) {
        return reviewRepository.update(review);
    }

    @Override
    public Review geReviewById(int id) {
        return reviewRepository.findById(id);
    }

    @Override
    public List<Review> getAllReviews(String imdbId) {
        return reviewRepository.findAll(imdbId);
    }

}
