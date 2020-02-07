package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> checkoutBooks;

    Library() {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();

        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
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

    public Boolean containsCheckoutBook(String checkoutBook) {
        for (Book book : checkoutBooks) {
            if (book.getName().equals(checkoutBook))
                return true;
        }
        return false;
    }
}
