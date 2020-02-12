package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ViewMoviesTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ViewMovies();
        String expectedQuitDescription = "View Movies";

        String actualQuitDescription = menuItem.description();

        assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldViewAllMovies() throws InvalidBookException {
        Library libraryMock = mock(Library.class);
        MenuItem viewMovies = new ViewMovies();
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        viewMovies.action(libraryMock, biblotecaApp);

        verify(libraryMock, times(1)).movies();

    }

}