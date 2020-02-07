package com.twu.biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibraryTest {

    @Test
    public void shouldReturnOneBook() {
        Book book = new Book("The Harry Potter series");
        Library library = new Library(book);

        Book actualBook = library.displayBooks();

        Assertions.assertTrue(book.equals(actualBook));
    }

}