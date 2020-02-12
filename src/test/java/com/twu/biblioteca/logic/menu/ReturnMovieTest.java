package com.twu.biblioteca.logic.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReturnMovieTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ReturnMovie();
        String expectedQuitDescription = "Return Movie";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }
}