package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.CheckOut;
import com.twu.biblioteca.logic.menu.MenuItem;
import com.twu.biblioteca.logic.menu.ViewBooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);

        viewBooks.action(libraryMock, bufferedReader, printWriter);

        verify(libraryMock, times(1)).books();

    }

}