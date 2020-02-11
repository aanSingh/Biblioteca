package com.twu.biblioteca;

import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;

import java.util.List;

public class ViewBooks extends MenuItem {
    public ViewBooks(String description) {
        this.description = description;
    }

    @Override
    public void action(Library library, Bibliotecha bibloteca) {
        String bookList = "";
        List<Book> books = library.books();
        for (Book book : books) {
            bookList += book.display();
        }
        bibloteca.books(bookList);
    }
}
