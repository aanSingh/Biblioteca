package com.twu.biblioteca.UI;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Bibloteca;

import java.util.Scanner;

public class ConsoleUI implements Bibloteca {
    @Override
    public String getBookTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.ENTER_BOOK_TITLE);
        return scanner.nextLine();
    }

    @Override
    public void displayMessage(String message) {
        System.out.println("\n" + message + "\n");
    }

    @Override
    public void displayBookList(String bookList) {
        System.out.println(bookList);
    }

    @Override
    public String getFormat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.ENTER_DISPLAY_FORMAT);
        return scanner.nextLine();
    }

    @Override
    public void quitApp() {
        System.out.println(Message.Exit);
        System.exit(0);
    }

    @Override
    public void displayMovieList(String movieList) {
        System.out.println(movieList);
    }

    @Override
    public String getMovieTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.ENTER_MOVIE_TITLE);
        return scanner.nextLine();
    }

//    @Override
//    public void login() {
//        String libraryNumber;
//        String password;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter library number : ");
//        libraryNumber = scanner.nextLine();
//
//        System.out.println("Enter library number : ");
//        password = scanner.nextLine();
//
//        validate(libraryNumber, password);
//    }

}
