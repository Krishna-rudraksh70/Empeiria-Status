package com.moviedb.springcollectiondb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String imdbId;
    private String name;
    private double imdbRating;
    private int duration;
    private int yearOfRelease;
}
