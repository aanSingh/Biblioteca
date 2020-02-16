package com.twu.biblioteca.logic;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected final String libraryNumber;
    protected final String password;
    protected boolean isLoggedIn;
    protected int role;
    protected List<Book> books;
    protected List<Movie> movies;

    public User(String libraryNumber, String password, int role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.isLoggedIn = false;
        this.role = role;
        books = new ArrayList<>();
        movies = new ArrayList<>();
    }

    public boolean login(String libraryNumber, String password) {
        if (libraryNumber.equals(this.libraryNumber) && password.equals(this.password)) {
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        if (this.isLoggedIn)
            this.isLoggedIn = false;
    }

    public int getRole() {
        return role;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void checkoutBook(Book book) {
        books.add(book);
    }

    public List<Book> getCheckoutBooks() {
        return books;
    }

    public void checkoutMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getCheckoutMovies() {
        return movies;
    }

}
