package com.twu.biblioteca;

import java.util.List;

public class Bibliotecha {

    Bibliotecha() {
    }

    void welcomeMessage() {
        System.out.println(Message.getWelcomeMessage());
    }

    void DisplayAllBooks() {
        Library library = new Library();
        List<Book> books = library.displayBooks();

        System.out.println("Name"+"         |           "+"Author"+"            |           "+"Publisher");
        for (Book book : books) {
            System.out.println(book.getName() + "           |           " + book.getAuthor() +"         |           "+ book.getPublicationYear());
        }
    }

    public static void main(String[] args) {
        Bibliotecha bibliotecha = new Bibliotecha();
        bibliotecha.welcomeMessage();
        bibliotecha.DisplayAllBooks();
    }
}
