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

class ReturnMovieTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ReturnMovie();
        String expectedQuitDescription = "Return Movie";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldReturnAMovie() throws InvalidMovieException {
        Library libraryMock = mock(Library.class);
        MenuItem returnMovie = new ReturnMovie();
        Bibloteca bibloteca = mock(ConsoleUI.class);

        when(bibloteca.getMovieTitle()).thenReturn("A Nightmare on Elm Street");

        returnMovie.action(libraryMock, bibloteca);
        verify(libraryMock, times(1)).returnMovie("A Nightmare on Elm Street");

    }
}