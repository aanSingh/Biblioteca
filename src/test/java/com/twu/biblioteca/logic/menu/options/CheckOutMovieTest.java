package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class CheckOutMovieTest {
    @Test
    public void shouldReturnDescriptionForCheckoutOption() {
        MenuItem menuItem = new CheckOutMovie();
        String expectedQuitDescription = "Checkout Movie";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldCheckOutAMovie() throws InvalidMovieException {
        Library libraryMock = mock(Library.class);
        MenuItem checkoutMovie = new CheckOutMovie();
        Bibloteca bibloteca = mock(ConsoleUI.class);

        when(bibloteca.getMovieTitle()).thenReturn("A Nightmare on Elm Street");

        checkoutMovie.action(libraryMock, bibloteca);
        verify(libraryMock, times(1)).checkoutMovie("A Nightmare on Elm Street");
    }
}