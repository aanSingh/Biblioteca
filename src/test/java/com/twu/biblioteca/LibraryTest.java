package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void shouldReturnOneBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books);

        List<Book> actualBooks = library.displayBooks();

        assertEquals(actualBooks, books);
    }

    @Test
    public void shouldReturnAllBooks() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);

        List<Book> actualBooks = library.displayBooks();

        assertEquals(actualBooks, books);
    }

    @Test
    public void shouldLetCustomerCheckoutOneBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        String book = "The Harry Potter series";

        library.checkoutBook(book);

        assertTrue(library.containsCheckoutBook(book));

    }

    @Test
    public void shouldLetCustomerReturnOneBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        String book = "The Harry Potter series";
        library.checkoutBook(book);

        library.returnBook(book);

        assertFalse(library.containsCheckoutBook(book));
    }

}