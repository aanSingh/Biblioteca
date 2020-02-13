package com.twu.biblioteca.UI;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.*;
import com.twu.biblioteca.logic.menu.*;
import com.twu.biblioteca.logic.menu.options.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiblotecaApp {
    Menu menu;
    Library library;

    BiblotecaApp() {
    }

    public static void main(String[] args) throws InvalidBookException {
        BiblotecaApp biblotecaApp = new BiblotecaApp();
        Bibloteca bibloteca = new ConsoleUI();

        bibloteca.displayMessage(Message.WELCOME);
        biblotecaApp.init();
        biblotecaApp.menu(bibloteca);
    }

    private void init() {
        MenuItem viewBook = new ViewBooks();
        MenuItem checkOutBook = new CheckOutBook();
        MenuItem returnBook = new ReturnBook();
        MenuItem viewMovies = new ViewMovies();
        MenuItem checkOutMovie = new CheckOutMovie();
        MenuItem returnMovie = new ReturnMovie();
        MenuItem quit = new Quit();

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(viewBook);
        menuItems.add(checkOutBook);
        menuItems.add(returnBook);
        menuItems.add(viewMovies);
        menuItems.add(checkOutMovie);
        menuItems.add(returnMovie);
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

    private void getChoice(Bibloteca bibloteca) throws InvalidBookException {
        System.out.println(Message.ENTER_OPTION);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        execute(choice, library, bibloteca);
    }

    private void menu(Bibloteca bibloteca) throws InvalidBookException {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(menu.display());
            getChoice(bibloteca);
        }
    }

    public void execute(int choice, Library library, Bibloteca bibloteca) throws InvalidBookException {
        menu.select(choice, library, bibloteca);
    }
}
