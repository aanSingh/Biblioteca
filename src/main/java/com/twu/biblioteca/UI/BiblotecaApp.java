package com.twu.biblioteca.UI;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Movie;
import com.twu.biblioteca.logic.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiblotecaApp implements Bibloteca {
    Menu menu;
    Library library;

    BiblotecaApp() {
    }

    public static void main(String[] args) throws InvalidBookException {
        BiblotecaApp biblotecaApp = new BiblotecaApp();

        biblotecaApp.displayMessage(Message.WELCOME);
        biblotecaApp.init();
        biblotecaApp.menu();
    }

    private void init() {
        MenuItem viewBook = new ViewBooks();
        MenuItem checkOutBook = new CheckOutBook();
        MenuItem returnBook = new ReturnBook();
        MenuItem viewMovies = new ViewMovies();
        MenuItem quit = new Quit();

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(viewBook);
        menuItems.add(checkOutBook);
        menuItems.add(returnBook);
        menuItems.add(viewMovies);
        menuItems.add(quit);

        menu = new Menu(menuItems);

        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);

        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        library = new Library(books, movies);
    }

    private void getChoice() throws InvalidBookException {
        System.out.println(Message.ENTER_OPTION);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        execute(choice, library, this);
    }

    private void menu() throws InvalidBookException {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(menu.display());
            getChoice();
        }
    }

    @Override
    public void execute(int choice, Library library, BiblotecaApp biblotecaApp) throws InvalidBookException {
        menu.select(choice, library, biblotecaApp);
    }

    @Override
    public String getBookTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.ENTER_BOOK_TITLE);
        return scanner.nextLine();
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
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
        System.exit(0);
    }

    @Override
    public void displayMovieList(String movieList) {
        System.out.println(movieList);
    }
}
