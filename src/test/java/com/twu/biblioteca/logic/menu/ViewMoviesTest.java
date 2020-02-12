package com.twu.biblioteca.logic.menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewMoviesTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ViewMovies();
        String expectedQuitDescription = "View Movies";

        String actualQuitDescription = menuItem.description();

        assertEquals(expectedQuitDescription, actualQuitDescription);
    }

}