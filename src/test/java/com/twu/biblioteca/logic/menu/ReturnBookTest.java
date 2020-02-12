package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class ReturnBookTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() throws InvalidBookException {
        MenuItem menuItem = new ReturnBook();
        String expectedQuitDescription = "Return book";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldReturnABook() throws InvalidBookException, IOException {
        Library libraryMock = mock(Library.class);
        MenuItem returnBook = new ReturnBook();
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        when(biblotecaApp.getBookTitle()).thenReturn("The Harry Potter series");

        returnBook.action(libraryMock, biblotecaApp);
        verify(libraryMock, times(1)).returnBook("The Harry Potter series");

    }

}