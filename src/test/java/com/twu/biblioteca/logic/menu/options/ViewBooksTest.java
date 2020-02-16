package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;

class ViewBooksTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ViewBooks();
        String expectedQuitDescription = "View Books";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldViewAllBooks() {
        Library libraryMock = mock(Library.class);
        MenuItem viewBooks = new ViewBooks();
        Bibloteca bibloteca = mock(ConsoleUI.class);

        viewBooks.action(libraryMock, bibloteca);

        verify(libraryMock, times(1)).books();

    }

}