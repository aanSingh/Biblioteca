package com.twu.biblioteca.UI;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Movie;
import com.twu.biblioteca.logic.User;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements Bibloteca {
    User loggedInUser;

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

    @Override
    public String getLibraryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter library number : ");
        return scanner.nextLine();
    }

    @Override
    public String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password : ");
        return scanner.nextLine();
    }

    @Override
    public void setUser(User user1) {
        loggedInUser = user1;
    }

    @Override
    public User getUser() {
        return loggedInUser;
    }

    @Override
    public void unsetUser() {
        loggedInUser = null;
    }

    @Override
    public void displayCheckoutBookDetails(List<Book> checkoutBooks, User user) {
        System.out.println(user.getLibraryNumber());

        for (Book book : checkoutBooks) {
            System.out.println(book.getName());
        }
    }

    @Override
    public void displayUserDetails(User user) {
        List<Book> books = user.getCheckoutBooks();
        List<Movie> movies = user.getCheckoutMovies();

        if (books.size() > 0 || movies.size() > 0) {
            System.out.println("Library number : " + user.getLibraryNumber() + "\n");

            if (books.size() > 0) {
                System.out.println("Checkout books : ");
                for (Book book : books) {
                    System.out.println("\t\t" + book.getName());
                }
            }

            if (movies.size() > 0) {
                System.out.println("Checkout movies : ");
                for (Movie movie : movies) {
                    System.out.println("\t\t" + movie.getName());
                }
            }

        }
    }
}
