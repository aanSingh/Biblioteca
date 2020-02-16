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
    MenuCustomer menuCustomer;
    MenuLibrarian menuLibrarian;
    Library library;

    BiblotecaApp() {
    }

    public static void main(String[] args) throws InvalidBookException {
        BiblotecaApp biblotecaApp = new BiblotecaApp();
        Bibloteca bibloteca = new ConsoleUI();

        bibloteca.displayMessage(Message.WELCOME);
        biblotecaApp.init();
        biblotecaApp.userMenu(bibloteca);
    }


    private void init() {
        MenuItem login = new Login();
        MenuItem viewBook = new ViewBooks();
        MenuItem checkOutBook = new CheckOutBook();
        MenuItem returnBook = new ReturnBook();
        MenuItem viewMovies = new ViewMovies();
        MenuItem checkOutMovie = new CheckOutMovie();
        MenuItem returnMovie = new ReturnMovie();
        MenuItem logout = new Logout();
        MenuItem quit = new Quit();
        MenuItem viewCheckoutBooks = new ViewCheckoutDetails();

        List<MenuItem> menuItemLibraries = new ArrayList<>();
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOutBook);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewMovies);
        menuItemLibraries.add(checkOutMovie);
        menuItemLibraries.add(returnMovie);
        menuItemLibraries.add(logout);
        menuItemLibraries.add(quit);
        menu = new Menu(menuItemLibraries);

        List<MenuItem> menuItemDefault = new ArrayList<>();
        menuItemDefault.add(login);
        menuItemDefault.add(viewBook);
        menuItemDefault.add(viewMovies);
        menuItemDefault.add(quit);
        menuCustomer = new MenuCustomer(menuItemDefault);

        List<MenuItem> menuItemLibrarian = new ArrayList<>();
        menuItemLibrarian.add(viewBook);
        menuItemLibrarian.add(checkOutBook);
        menuItemLibrarian.add(returnBook);
        menuItemLibrarian.add(viewMovies);
        menuItemLibrarian.add(checkOutMovie);
        menuItemLibrarian.add(returnMovie);
        menuItemLibrarian.add(viewCheckoutBooks);
        menuItemLibrarian.add(logout);
        menuItemLibrarian.add(quit);
        menuLibrarian = new MenuLibrarian(menuItemLibrarian);

        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);

        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        List<User> users = new ArrayList<>();
        User user1 = new User("abc-1234", "12345", 1);
        User user2 = new User("abd-1235", "123456", 1);
        User user3 = new User("abe-1236", "1234567", 2);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        library = new Library(books, movies, users);
    }


    private void userMenu(Bibloteca bibloteca) throws InvalidBookException {
        //noinspection InfiniteLoopStatement
        while (true) {
            User user = bibloteca.getUser();
            if (user == null) {
                System.out.println(menuCustomer.display());
                getChoiceUser(bibloteca);
            } else {
                if (user.getRole() == 1) {
                    System.out.println(menu.display());
                    getChoice(bibloteca);
                } else {
                    System.out.println(menuLibrarian.display());
                    getChoiceLibrarian(bibloteca);
                }
            }
        }

    }

    private void getChoiceLibrarian(Bibloteca bibloteca) throws InvalidBookException {
        System.out.println(Message.ENTER_OPTION);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        executeLibraian(choice, library, bibloteca);
    }

    private void getChoice(Bibloteca bibloteca) throws InvalidBookException {
        System.out.println(Message.ENTER_OPTION);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        execute(choice, library, bibloteca);
    }

    private void getChoiceUser(Bibloteca bibloteca) {
        System.out.println(Message.ENTER_OPTION);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        executeUser(choice, library, bibloteca);
    }

    public void execute(int choice, Library library, Bibloteca bibloteca) throws InvalidBookException {
        menu.select(choice, library, bibloteca);
    }

    public void executeUser(int choice, Library library, Bibloteca bibloteca) {
        menuCustomer.select(choice, library, bibloteca);
    }

    public void executeLibraian(int choice, Library library, Bibloteca bibloteca) throws InvalidBookException {
        menuLibrarian.select(choice, library, bibloteca);
    }


}
