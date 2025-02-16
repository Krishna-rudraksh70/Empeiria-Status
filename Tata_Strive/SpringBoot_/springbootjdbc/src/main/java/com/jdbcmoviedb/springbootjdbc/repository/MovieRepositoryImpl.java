package com.jdbcmoviedb.springbootjdbc.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbcmoviedb.springbootjdbc.model.Movie;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class MovieRepositoryImpl implements MovieRepository {

    private final JdbcTemplate jdbcTemplate;
    private final ReviewRepository reviewRepository;

    private final RowMapper<Movie> movieRowMapper = (rs, _) -> new Movie(rs.getString(1), rs.getString(2),
            rs.getString(3), rs.getInt(4), null);

    @Override
    public void createTable() {
        jdbcTemplate.execute(
                "CREATE TABLE IF NOT EXISTS movies ( imdbId VARCHAR(10) PRIMARY KEY, title VARCHAR(30) NOT NULL, genre VARCHAR(15), releaseYear INT)");
    }

    @Override
    public int save(Movie movie) {
        return jdbcTemplate.update("INSERT INTO movies (imdbId, title, genre, releaseYear) VALUES (?, ?, ?, ?)",
                movie.getImdbId(), movie.getTitle(), movie.getGenre(), movie.getReleaseYear());
    }

    @Override
    public int delete(String imdbId) {
        return jdbcTemplate.update("DELETE FROM movies WHERE imdbId = ?", imdbId);
    }

    @Override
    public int update(Movie movie) {
        return jdbcTemplate.update("UPDATE movies SET title = ?, genre = ?, releaseYear = ? WHERE imdbId = ?",
        movie.getTitle(), movie.getGenre(), movie.getReleaseYear(), movie.getImdbId());
    }

    @Override
    public Movie findById(String imdbId) {
        Movie movie = jdbcTemplate.queryForObject("SELECT * FROM movies WHERE imdbId = ?", movieRowMapper, imdbId);

        if (movie != null) {
            movie.setReviews(reviewRepository.findAll(imdbId));
        }

        return movie;
    }

    @Override
    public List<Movie> findAll() {
        List<Movie> movies = jdbcTemplate.query("SELECT * FROM movies", movieRowMapper);

        movies.forEach(movie -> movie.setReviews(reviewRepository.findAll(movie.getImdbId())));

        return movies;
    }

}
