package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CheckOutTest {
    @Test
    public void shouldReturnDescriptionForCheckoutOption() throws InvalidBookException {
        MenuItem menuItem = new CheckOut();
        String expectedQuitDescription = "Checkout book";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldCheckOutABook() throws InvalidBookException {
        Library libraryMock = mock(Library.class);
        MenuItem checkoutBook = new CheckOut();
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        when(biblotecaApp.getBookTitle()).thenReturn("The Harry Potter series");

        checkoutBook.action(libraryMock, biblotecaApp);
        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");

    }


}