package com.jdbcmoviedb.springbootjdbc.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String imdbId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Review> reviews;
}