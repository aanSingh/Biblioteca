package com.twu.biblioteca;

import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CheckOutTest {
    @Test
    public void shouldCheckOutABook() {
        Library libraryMock = mock(Library.class);

        MenuItem checkOut = new CheckOut("Check Out");
        Bibliotecha bibliotecha = mock(Bibliotecha.class);
        when(bibliotecha.getBookName()).thenReturn("The Harry Potter series");
        checkOut.action(libraryMock, bibliotecha);

        verify(libraryMock, times(1)).checkoutBook("The Harry Potter series");

    }

}