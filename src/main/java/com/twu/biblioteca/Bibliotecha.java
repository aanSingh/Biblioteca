package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Bibliotecha {

    Bibliotecha() {
    }

    void welcomeMessage() {
        System.out.println(Message.welcomeMessage());
    }

    void DisplayAllBooks() {
        Library library = new Library();
        List<Book> books = library.displayBooks();

        System.out.println("Name" + "         |           " + "Author" + "            |           " + "Publisher");
        for (Book book : books) {
            System.out.println(book.getName() + "           |           " + book.getAuthor() + "         |           " + book.getPublicationYear());
        }
    }

    void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("    Biblioteca");
            System.out.println("    a) List of books");
            System.out.println("    b) Checkout a book");
            System.out.println("    c) Return a book");
            System.out.println("    d) Exit");
            System.out.println("    Enter choice : ");

            switch (scanner.next()) {
                case "a":
                    DisplayAllBooks();
                    break;
                case "b":
                    checkout();
                    break;
                case "c":
                    returnBook();
                    break;
                case "d":
                    return;
                default:
                    System.out.println(Message.invalidMessage());

            }
        }
    }

    private void returnBook() {
        System.out.println("Book name : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Library library = new Library();
        library.returnBook(input);

        if (library.containsBook(input) && !library.containsCheckoutBook(input))
            System.out.println(Message.successfulReturn());
        else
            System.out.println(Message.unsuccessfulReturn());

    }

    void checkout() {
        System.out.println("Book name : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Library library = new Library();
        library.checkoutBook(input);

        if (library.containsCheckoutBook(input) && !library.containsBook(input))
            System.out.println(Message.successMessage());
        else
            System.out.println(Message.unsuccessfulCheckout());
    }

    public static void main(String[] args) {
        Bibliotecha bibliotecha = new Bibliotecha();
        bibliotecha.welcomeMessage();
        bibliotecha.menu();
    }
}
