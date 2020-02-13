package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.Options.CheckOutBook;
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
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        when(biblotecaApp.getBookTitle()).thenReturn("The Harry Potter series");

        checkoutBook.action(libraryMock, biblotecaApp);
        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");
    }
}