package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public class ReturnBook extends MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String bookTitle = biblotecaApp.getBookTitle();

        try {
            library.returnBook(bookTitle);
            biblotecaApp.displayMessage(Message.SUCCESSFUL_RETURN);

        } catch (InvalidBookException e) {
            biblotecaApp.displayMessage(Message.UNSUCCESSFUL_RETURN);
        }
    }

    @Override
    public String description() {
        return "Return book";
    }
}
