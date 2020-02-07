package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void shouldAddOneBookToTheLibrary() {
        Library library = new Library();
        Book book = new Book("ABC1234", "DemoBook", "RandomAuthor");

        library.addBook(book);

        assertTrue(library.hasBook(book));
    }

    @Test
    public void shouldAddTwoBooksToTheLibrary() {
        Library library = new Library();
        Book book1 = new Book("ABC1234", "DemoBook1", "RandomAuthor1");
        Book book2 = new Book("ABC12343", "DemoBook2", "RandomAuthor2");


        library.addBook(book1);
        library.addBook(book2);

        assertTrue(library.hasBook(book1));
        assertTrue(library.hasBook(book2));

    }



}