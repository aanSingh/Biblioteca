package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;

import java.util.List;

public class ViewBooks extends MenuItem {

    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String bookFormat = biblotecaApp.getFormat();

        String bookList = Message.BOOK_LIST;
        List<Book> books = library.books();

        if (books.size() == 0) {
            biblotecaApp.displayMessage("Library is empty \n");
        }

        for (Book book : books) {
            bookList += book.display(bookFormat) + "\n";
        }

        biblotecaApp.displayBookList(bookList);
    }

    @Override
    public String description() {
        return "View Books";
    }
}
