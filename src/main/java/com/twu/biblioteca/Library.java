package com.twu.biblioteca;

public class Library {
    private Book book;

    public void addBook(Book book) {
        this.book = book;
    }

    public boolean hasBook(Book book) {
        if (this.book.equals(book))
            return true;
        return false;
    }

}
