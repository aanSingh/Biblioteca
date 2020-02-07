package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {

    @Test
    public void shouldReturnOneBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series");
        books.add(book1);
        Library library = new Library(books);

        List<Book> actualBooks = library.displayBooks();

        assertTrue(actualBooks.equals(books));
    }

    @Test
    public void shouldReturnTwoBooks() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series");
        Book book2 = new Book("The Lord of the Rings Trilogy");
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);

        List<Book> actualBooks = library.displayBooks();

        assertTrue(actualBooks.equals(books));
    }

}