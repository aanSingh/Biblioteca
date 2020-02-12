package com.twu.biblioteca.logic;

public class Movie {
    private final String name;
    private final int year;
    private final String director;
    private final int rating;

    public Movie(String name, int year, String director, int rating) {

        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
}
