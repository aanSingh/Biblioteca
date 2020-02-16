package com.twu.biblioteca.logic;

import java.util.List;

public interface Bibloteca {

    String getBookTitle();

    void displayMessage(String message);

    void displayBookList(String bookList);

    String getFormat();

    void quitApp();

    void displayMovieList(String movieList);

    String getMovieTitle();

    String getLibraryNumber();

    String getPassword();

    void setUser(User user1);

    User getUser();

    void unsetUser();

    void displayCheckoutBookDetails(List<Book> checkoutBooks, User user);

    void displayUserDetails(User user);

//    void login();
}
