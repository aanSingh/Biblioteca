package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Bibliotecha {

    Bibliotecha() {
    }

    void welcomeMessage() {
        System.out.println(Message.getWelcomeMessage());
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
        String choice;

        System.out.println("Biblioteca");
        System.out.println("a) List of books");
        System.out.println("Enter choice : ");
        choice = scanner.next();

        if ("a".equals(choice)) {
            DisplayAllBooks();
        }

    }

    public static void main(String[] args) {
        Bibliotecha bibliotecha = new Bibliotecha();
        bibliotecha.welcomeMessage();
        bibliotecha.menu();
    }
}
