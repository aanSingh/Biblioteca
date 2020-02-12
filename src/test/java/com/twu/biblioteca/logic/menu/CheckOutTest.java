package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.CheckOut;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

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
    public void shouldCheckOutABook() throws InvalidBookException, IOException {
        Library libraryMock = mock(Library.class);
        MenuItem checkOut = new CheckOut();
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);
        when(bufferedReader.readLine()).thenReturn("The Harry Potter series");

        checkOut.action(libraryMock, bufferedReader, printWriter);

        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");

    }

//    @Test
//    public void shouldThrowExceptionWhenCustomerWriteInvalidName() throws IOException {
//        Library libraryMock = mock(Library.class);
//        MenuItem checkOut = new CheckOut();
//        BufferedReader bufferedReader = mock(BufferedReader.class);
//        PrintWriter printWriter = mock(PrintWriter.class);
//        when(bufferedReader.readLine()).thenReturn("The Harry Potter seriess");
////        when(libraryMock.checkoutBook("The Harry Potter series")).thenThrow(InvalidBookException.class);
//
//        Assertions.assertThrows(InvalidBookException.class, ()->checkOut.action(libraryMock, bufferedReader, printWriter));
//
////        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");
//
//    }

}