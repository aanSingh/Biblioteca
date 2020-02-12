package com.twu.biblioteca.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldDisplayBookDetails() {
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        String expectedBookDetails = "       The Harry Potter series                  J.K. Rowling                          2000";

        String actualBookDetails = book1.display("%30s%30s%30s");

        assertEquals(expectedBookDetails, actualBookDetails);

    }
}