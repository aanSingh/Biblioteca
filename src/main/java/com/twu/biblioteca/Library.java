package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    Library(List<Book> books) {
        this.books = new ArrayList<>();
        this.books = books;
    }

    public List<Book> displayBooks() {
        return this.books;
    }
}
