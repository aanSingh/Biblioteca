package com.twu.biblioteca;

public class ReturnBook extends MenuItem {
    public ReturnBook(String description) {
        this.description = description;
    }

    @Override
    public void action(Library library, Bibliotecha bibloteca) {
        String bookName = bibloteca.getBookName();
        library.returnBook(bookName);
        String books = "";

        for (Book book : library.books()) {
            books += book.display();
        }

        bibloteca.books(books);
    }
}
