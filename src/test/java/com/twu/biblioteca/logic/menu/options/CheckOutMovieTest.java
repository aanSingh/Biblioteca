package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.Options.CheckOutMovie;
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
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        when(biblotecaApp.getMovieTitle()).thenReturn("A Nightmare on Elm Street");

        checkoutMovie.action(libraryMock, biblotecaApp);
        verify(libraryMock, times(1)).checkoutMovie("A Nightmare on Elm Street");
    }
}