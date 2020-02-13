package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CheckOutBookTest {
    @Test
    public void shouldReturnDescriptionForCheckoutOption() {
        MenuItem menuItem = new CheckOutBook();
        String expectedQuitDescription = "Checkout book";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldCheckOutABook() throws InvalidBookException {
        Library libraryMock = mock(Library.class);
        MenuItem checkoutBook = new CheckOutBook();
        Bibloteca bibloteca = mock(ConsoleUI.class);

        when(bibloteca.getBookTitle()).thenReturn("The Harry Potter series");

        checkoutBook.action(libraryMock, bibloteca);
        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");
    }
}