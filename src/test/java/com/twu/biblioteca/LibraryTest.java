package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void shouldAddOneBookToTheLibrary() {
        Library library = new Library();
        Book book1 = new Book("ABC1234", "DemoBook", "RandomAuthor");

        library.addBook(book1);

        assertTrue(library.hasBook(book1));
    }

}