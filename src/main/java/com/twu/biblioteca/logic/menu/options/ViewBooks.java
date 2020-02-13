package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;

import java.util.List;

public class ViewBooks implements MenuItem {

    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String bookFormat = biblotecaApp.getFormat();

        StringBuilder bookList = new StringBuilder("\t\t\t"+Message.BOOK_LIST+"\n");
        List<Book> books = library.books();

        if (books.size() == 0) {
            biblotecaApp.displayMessage(Message.EMPTY_LIBRARY);
        }

        for (Book book : books) {
            bookList.append(book.display(bookFormat)).append("\n");
        }

        biblotecaApp.displayBookList(bookList.toString());
    }

    @Override
    public String description() {
        return "View Books";
    }
}
