package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;

public class ReturnBook implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String bookTitle = bibloteca.getBookTitle();

        try {
            library.returnBook(bookTitle);
            bibloteca.displayMessage(Message.SUCCESSFUL_RETURN);

        } catch (InvalidBookException e) {
            bibloteca.displayMessage(Message.UNSUCCESSFUL_RETURN);
        }
    }

    @Override
    public String description() {
        return "Return book";
    }
}
