package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Movie> movies;
    private List<Book> books;
    private List<Book> checkoutBooks;

    public Library(List<Book> books, List<Movie> movies) {
        this.books = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();
        this.books = books;
        this.movies = movies;
    }

    public List<Book> books() {
        return books;
    }

    public List<Movie> movies() {
        return movies;
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

    public Movie findMovieByName(String movieName) {
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }
}
