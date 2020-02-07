package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> checkoutBooks;

    Library() {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();

    }

    Library(List<Book> books) {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();
        this.books = books;
    }

    public List<Book> displayBooks() {
        return this.books;
    }

    public void checkoutBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                books.remove(book);
                checkoutBooks.add(book);
                break;
            }
        }
    }

    public Boolean containsCheckoutBook(String bookName) {
        for (Book book : checkoutBooks) {
            if (book.getName().equals(bookName))
                return true;
        }
        return false;
    }

    public void returnBook(String bookName) {
        for (Book book : checkoutBooks) {
            if (book.getName().equals(bookName)) {
                books.add(book);
                checkoutBooks.remove(book);
                break;
            }
        }
    }

    public boolean containsBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName))
                return true;
        }
        return false;
    }
}
