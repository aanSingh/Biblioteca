package com.twu.biblioteca.logic;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;

public interface Bibloteca {
    void execute(int choice, Library library, BiblotecaApp biblotecaApp) throws InvalidBookException;

    String getBookTitle();

    void displayMessage(String message);

    void displayBookList(String bookList);
}
