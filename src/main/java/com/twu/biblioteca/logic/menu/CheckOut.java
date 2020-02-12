package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public class CheckOut implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String bookTitle = biblotecaApp.getBookTitle();

        try {
            library.checkoutBook(bookTitle);
            biblotecaApp.displayMessage(Message.SUCCESSFUL_CHECKOUT);

        } catch (InvalidBookException e) {
            biblotecaApp.displayMessage(Message.UNSUCCESSFUL_CHECKOUT);
        }

    }

    @Override
    public String description() {
        return "Checkout book";
    }
}
