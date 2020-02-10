package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void test(){
        Book book = new Book("abc", "huhu", 1234);
        book.display();
    }

}