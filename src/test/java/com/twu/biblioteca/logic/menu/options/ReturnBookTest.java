package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class ReturnBookTest {
    @Test
    public void shouldReturnDescriptionForReturnBookOption() {
        MenuItem menuItem = new ReturnBook();
        String expectedQuitDescription = "Return book";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldReturnABook() throws InvalidBookException {
        Library libraryMock = mock(Library.class);
        MenuItem returnBook = new ReturnBook();
        Bibloteca bibloteca = mock(ConsoleUI.class);

        when(bibloteca.getBookTitle()).thenReturn("The Harry Potter series");

        returnBook.action(libraryMock, bibloteca);
        verify(libraryMock, times(1)).returnBook("The Harry Potter series");

    }

}