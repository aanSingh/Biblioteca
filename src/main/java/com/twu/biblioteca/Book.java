package com.twu.biblioteca;

public class Book {
    private final String ISBN;
    private final String name;
    private final String author;

    public Book(String ISBN, String name, String author) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
    }
}
