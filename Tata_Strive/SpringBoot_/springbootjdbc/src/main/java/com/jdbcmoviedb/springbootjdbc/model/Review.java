package com.jdbcmoviedb.springbootjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private int id;
    private String movieId;
    private String reviewer;
    private String comment;
    private double rating;
}
