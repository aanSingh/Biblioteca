package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
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
        Bibloteca bibloteca = mock(ConsoleUI.class);

        viewMovies.action(libraryMock, bibloteca);

        verify(libraryMock, times(1)).movies();

    }

}