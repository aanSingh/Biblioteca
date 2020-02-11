package com.twu.biblioteca;

import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class ReturnBookTest {
    @Test
    public void shouldReturnABook() {
        Library libraryMock = mock(Library.class);

        MenuItem returnBook = new ReturnBook("Return Book");
        Bibliotecha bibliotecha = mock(Bibliotecha.class);
        when(bibliotecha.getBookName()).thenReturn("The Harry Potter series");
        returnBook.action(libraryMock, bibliotecha);

        verify(libraryMock, times(1)).returnBook("The Harry Potter series");

    }

}