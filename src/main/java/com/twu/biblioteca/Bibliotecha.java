package com.twu.biblioteca;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public class Bibliotecha {
    private Library library;
    private Menu menu;
    private String bookNameByUser;
    private String bookList = "";

    Bibliotecha() {
        library = new Library();
        menu = new Menu();
    }

    Bibliotecha(Library library, Menu menu){
        this.library = library;
        this.menu = menu;
    }

    public String welcomeMessage() {
        return Message.WELCOME;
    }

    public String displayMenu() {
        return menu.display();
    }

    public void execute(int choice) throws InvalidBookException {
        menu.select(choice, library, this);
    }

    public String getBookName() {
        return bookNameByUser;
    }

    public void setBookName(String bookName) {
        this.bookNameByUser = bookName;
    }

    public void books(String bookList) {
        this.bookList = bookList;
    }

    public String getBooks() {
        return this.bookList;
    }

    public void quit() {
        System.exit(0);
    }

    public String checkOutBook() {
        if (!library.containsBook(bookNameByUser) && library.containsCheckoutBook(bookNameByUser))
            return Message.SUCCESSFUL_CHECKOUT;
        else
            return Message.UNSUCCESSFUL_CHECKOUT;
    }
}
