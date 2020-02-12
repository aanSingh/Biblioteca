package com.twu.biblioteca.logic.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckOutMovieTest {
    @Test
    public void shouldReturnDescriptionForCheckoutOption() {
        MenuItem menuItem = new CheckOutMovie();
        String expectedQuitDescription = "Checkout movie";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }
}