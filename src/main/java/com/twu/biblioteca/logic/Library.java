package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.exceptions.InvalidMovieException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Movie> movies;
    private List<Book> books;
    private List<Book> checkoutBooks;
    private List<Movie> checkoutMovies;

    public Library(List<Book> books, List<Movie> movies) {
        this.books = new ArrayList<>();
        this.checkoutBooks = new ArrayList<>();
        this.books = books;

        this.movies = new ArrayList<>();
        this.checkoutMovies = new ArrayList<>();
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


    public void checkoutMovie(String movieName) throws InvalidMovieException {
        Movie movie = findMovieByName(movieName, movies);
        movies.remove(movie);
        checkoutMovies.add(movie);
    }

    public void returnMovie(String movieName) throws InvalidMovieException {
        Movie movie = findMovieByName(movieName, checkoutMovies);
        checkoutMovies.remove(movie);
        movies.add(movie);
    }

    private Book findBookByTitle(String bookName, List<Book> bookList) throws InvalidBookException {
        for (Book book : bookList) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        throw new InvalidBookException();
    }

    private Movie findMovieByName(String movieName, List<Movie> movieList) throws InvalidMovieException {
        for (Movie movie : movieList) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        throw new InvalidMovieException();
    }
}
