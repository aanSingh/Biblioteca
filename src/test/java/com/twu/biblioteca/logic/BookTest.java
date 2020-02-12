package com.twu.biblioteca.logic;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldReturnTrueWhenTwoBooksAreSame() {
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Harry Potter series", "J.K. Rowling", 2000);

        assertEquals(book1, book2);
    }

    @Test
    void shouldReturnFalseWhenTwoBooksAreNotSame() {
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Harry Potter", "J.K. Rowling", 2000);

        assertNotEquals(book1, book2);
    }

    @Test
    void shouldDisplayBookDetails() {
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        String expectedBookDetails = "       The Harry Potter series                  J.K. Rowling                          2000";

        String actualBookDetails = book1.display("%30s%30s%30s");

        assertEquals(expectedBookDetails, actualBookDetails);

    }

    @Test
    void shouldEquateHashcodeOfSameBooks() {
        Book book = new Book("The Harry Potter series", "J.K. Rowling", 2000);

        int expectedHashCode = Objects.hash("The Harry Potter series", "J.K. Rowling", 2000);
        int actualHashCode = book.hashCode();

        assertEquals(expectedHashCode, actualHashCode);

    }
}