package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> checkoutBooks;

    public Library() {
//        this.books = new ArrayList<>();
//        this.checkoutBooks = new ArrayList<>();
//        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
//        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
//        books.add(book1);
//        books.add(book2);
    }

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();
        this.books = books;
    }

    public List<Book> books() {
        return books;
    }

    public void checkoutBook(String bookName) throws InvalidBookException {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                books.remove(book);
                checkoutBooks.add(book);
                return;
            }
        }
        throw new InvalidBookException();
    }

    public Boolean containsCheckoutBook(String bookName) {
        for (Book book : checkoutBooks) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void returnBook(String bookName) {
        for (Book book : checkoutBooks) {
            if (book.getName().equals(bookName)) {
                checkoutBooks.remove(book);
                books.add(book);
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
