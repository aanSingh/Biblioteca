package com.twu.biblioteca;

public class Bibliotecha {
    private Library library;
    private Menu menu;
    private String bookNameByUser;
    private String bookList = "";

    Bibliotecha() {
        library = new Library();
        menu = new Menu();
    }

    public String welcomeMessage() {
        return Message.WELCOME;
    }

    public String displayMenu() {
        return menu.display();
    }

    public void execute(int choice) {
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

    public String getBooks(){
        return this.bookList;
    }

    public void quit() {
        System.exit(0);
    }
}
