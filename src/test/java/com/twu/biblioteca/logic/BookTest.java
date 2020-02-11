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
}