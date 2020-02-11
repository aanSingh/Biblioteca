package com.twu.biblioteca;

import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

class ViewBooksTest {
    @Test
    public void shouldDisplayListOfBooks() {
        Book bookMock = mock(Book.class);
        List<Book> books = new ArrayList<>();
        books.add(bookMock);
        Library libraryMock = mock(Library.class);
        when(libraryMock.books()).thenReturn(books);
        MenuItem viewBook = new ViewBooks("View Book");
        Bibliotecha bibliotecha = mock(Bibliotecha.class);

//        viewBook.action(libraryMock, bibliotecha);

        verify(bookMock, times(1)).display();
    }

    @Test
    public void shouldCheckoutABook() {
        Book bookMock = mock(Book.class);

        List<Book> books = new ArrayList<>();
        books.add(bookMock);
        Library libraryMock = mock(Library.class);
        when(libraryMock.books()).thenReturn(books);
        MenuItem checkOut = new CheckOut("CheckOut Book");
        Bibliotecha bibliotecha = mock(Bibliotecha.class);
        when(bibliotecha.getBookName()).thenReturn("The Harry Potter series");

//        checkOut.action(libraryMock, bibliotecha);

        verify(bookMock, times(0)).display();
    }

}