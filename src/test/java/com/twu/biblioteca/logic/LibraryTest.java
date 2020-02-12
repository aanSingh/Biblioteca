package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void shouldReturnListOfBooks() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books);

        List<Book> actualBookList = library.books();

        assertEquals(actualBookList, books);
    }

    @Test
    public void shouldNotThrowExceptionWhenBookCheckOutSuccessfully() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books);
        String book = "The Harry Potter series";

        assertDoesNotThrow(() -> library.checkoutBook(book));

    }

    @Test
    public void shouldThrowExceptionWhenCustomerWriteInvalidNameToCheckOutBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books);
        String book = "The Harry Potter seriesss";

        assertThrows(InvalidBookException.class, () -> library.checkoutBook(book));
    }

    @Test
    public void shouldNotThrowExceptionWhenCustomerReturnBookSuccessfully() throws InvalidBookException {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        String book = "The Harry Potter series";

        library.checkoutBook(book);

        assertDoesNotThrow(() -> library.returnBook(book));
    }

    @Test
    public void shouldThrowExceptionWhenCustomerWriteInvalidNameToReturnBook() throws InvalidBookException {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        String bookCheckOut = "The Harry Potter series";
        String bookReturn = "The Harry Potter seriess";

        library.checkoutBook(bookCheckOut);

        assertThrows(InvalidBookException.class, () -> library.returnBook(bookReturn));

    }

}