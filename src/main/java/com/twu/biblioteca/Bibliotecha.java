package com.twu.biblioteca;

import java.util.List;

public class Bibliotecha {

    public String welcomeMessage() {
        return Message.WELCOME;
    }

    public List<Book> getAllBooks() {
        Library library = new Library();
        return library.displayBooks();
    }
}
