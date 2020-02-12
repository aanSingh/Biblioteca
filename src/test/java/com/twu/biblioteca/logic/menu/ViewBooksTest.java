package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


import static org.mockito.Mockito.*;

class ViewBooksTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() throws InvalidBookException {
        MenuItem menuItem = new ViewBooks();
        String expectedQuitDescription = "View Books";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldViewAllBooks() throws InvalidBookException, IOException {
        Library libraryMock = mock(Library.class);
        MenuItem viewBooks = new ViewBooks();
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        viewBooks.action(libraryMock, biblotecaApp);

        verify(libraryMock, times(1)).books();

    }

}