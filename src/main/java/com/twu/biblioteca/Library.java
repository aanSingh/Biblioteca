package com.twu.biblioteca;

public class Library {
    private Book book;

    Library(Book book) {
        this.book = book;
    }

    public Book displayBooks() {
        return book;
    }
}
