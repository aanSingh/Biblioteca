package com.twu.biblioteca.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldReturnTrueWhenTwoBooksAreSame() {
        Book book1 = new Book("abc", "huhu", 1234);
        Book book2 = new Book("abc", "huhu", 1234);

        assertEquals(book1, book2);
    }

    @Test
    void shouldReturnFalseWhenTwoBooksAreNotSame() {
        Book book1 = new Book("abc", "huhu1", 1234);
        Book book2 = new Book("abc", "huhu", 1234);

        assertNotEquals(book1, book2);
    }

    @Test
    void shouldDisplayBookDetails() {
        Book book1 = new Book("abc", "huhu1", 1234);
        String expectedBookDetails = "abc\t\thuhu1\t\t1234\n";
        String actualBookDetails = book1.display();

        assertEquals(expectedBookDetails, actualBookDetails);

    }
}