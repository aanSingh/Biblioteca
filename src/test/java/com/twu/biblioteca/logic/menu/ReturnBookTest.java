package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import com.twu.biblioteca.logic.menu.ReturnBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

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
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);
        when(bufferedReader.readLine()).thenReturn("The Harry Potter series");

        returnBook.action(libraryMock, bufferedReader, printWriter);

        verify(libraryMock, times(1)).returnBook("The Harry Potter series");

    }

}