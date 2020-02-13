package com.twu.biblioteca.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void shouldDisplayMovieDetails() {
        Movie movie = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        String expectedMovieDetails = "     A Nightmare on Elm Street                          1984                    Wes Craven";

        String actualMovieDetails = movie.display("%30s%30s%30s");


        assertEquals(expectedMovieDetails, actualMovieDetails);

    }
}