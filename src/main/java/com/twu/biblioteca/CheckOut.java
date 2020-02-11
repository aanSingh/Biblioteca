package com.twu.biblioteca;

public class CheckOut extends MenuItem {
    public CheckOut(String description) {
        this.description = description;
    }

    @Override
    public void action(Library library, Bibliotecha bibloteca) {
        String bookName = bibloteca.getBookName();
        library.checkoutBook(bookName);
        String books = "";

        for (Book book : library.books()) {
            books += book.display();
        }

        bibloteca.books(books);
    }
}
