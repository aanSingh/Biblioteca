package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Movie movie;
    private List<Book> books;
    private List<Book> checkoutBooks;

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();
        this.books = books;
    }

    public Library(Movie movie) {
        this.movie = movie;
    }

    public List<Book> books() {
        return books;
    }

    public void checkoutBook(String bookName) throws InvalidBookException {
        Book book = findBookByTitle(bookName, books);
        books.remove(book);
        checkoutBooks.add(book);

    }

    public void returnBook(String bookName) throws InvalidBookException {
        Book book = findBookByTitle(bookName, checkoutBooks);
        checkoutBooks.remove(book);
        books.add(book);
    }

    private Book findBookByTitle(String bookName, List<Book> bookList) throws InvalidBookException {
        for (Book book : bookList) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        throw new InvalidBookException();
    }

    public Movie movies() {
        return movie;
    }
}
