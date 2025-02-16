package com.jdbcmoviedb.springbootjdbc.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbcmoviedb.springbootjdbc.model.Review;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository {

    private final JdbcTemplate jdbcTemplate;

    private final RowMapper<Review> reviewRowMapper = (rs, _) -> new Review(rs.getInt(1), rs.getString(2),
            rs.getString(3), rs.getString(4), rs.getInt(5));

    @Override
    public void createTable() {
        jdbcTemplate.execute(
                "CREATE TABLE IF NOT EXISTS reviews ( id INT AUTO_INCREMENT PRIMARY KEY, movieId VARCHAR(20), reviewer VARCHAR(15), comment TEXT, rating DOUBLE, FOREIGN KEY (movieId) REFERENCES movies(imdbId) ON DELETE CASCADE )");
    }

    @Override
    public int save(Review review) {
        return jdbcTemplate.update("INSERT INTO reviews (movieId, reviewer, comment, rating) VALUES (?, ?, ?, ?)",
                review.getMovieId(), review.getReviewer(), review.getComment(), review.getRating());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM reviews WHERE id = ?", id);
    }

    @Override
    public int update(Review review) {
        return jdbcTemplate.update("UPDATE reviews SET movieId = ?, reviewer = ?, comment = ?, rating = ? WHERE id = ?",
                review.getMovieId(), review.getReviewer(), review.getComment(), review.getRating(), review.getId());
    }

    @Override
    public Review findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM reviews WHERE id = ?", reviewRowMapper, id);
    }

    @Override
    public List<Review> findAll(String imdbId) {
        return jdbcTemplate.query("SELECT * FROM reviews WHERE movieId = ?", reviewRowMapper, imdbId);
    }

}