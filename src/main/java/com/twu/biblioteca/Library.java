package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean hasBook(Book book1) {
        for (Book book : books) {
            if (book.equals(book1))
                return true;
        }
        return false;
    }

}
