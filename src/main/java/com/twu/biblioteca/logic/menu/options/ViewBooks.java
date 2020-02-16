package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;

import java.util.List;

public class ViewBooks implements MenuItem {

    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String bookFormat = bibloteca.getFormat();

        StringBuilder bookList = new StringBuilder("\t\t\t" + Message.BOOK_LIST + "\n");
        List<Book> books = library.books();

        if (books.size() == 0) {
            bibloteca.displayMessage(Message.EMPTY_LIBRARY);
        }

        for (Book book : books) {
            bookList.append(book.display(bookFormat)).append("\n");
        }

        bibloteca.displayBookList(bookList.toString());
    }

    @Override
    public String description() {
        return "View Books";
    }
}
