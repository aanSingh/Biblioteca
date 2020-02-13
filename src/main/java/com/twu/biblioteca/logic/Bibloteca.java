package com.twu.biblioteca.logic;

public interface Bibloteca {

    String getBookTitle();

    void displayMessage(String message);

    void displayBookList(String bookList);

    String getFormat();

    void quitApp();

    void displayMovieList(String movieList);

    String getMovieTitle();
}
