package com.twu.biblioteca.logic;

public class Book {
    private final String name;
    private final String author;
    private final int publicationYear;

    public Book(String name, String author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public String display(String format) {
        return String.format(format, name, author, publicationYear);
    }
}
