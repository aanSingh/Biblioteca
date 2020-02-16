package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Book;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;

public class CheckOutBook implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String bookTitle = bibloteca.getBookTitle();
        User user;

        try {
            library.checkoutBook(bookTitle);
            user = bibloteca.getUser();

            Book book = library.getCheckoutBook(bookTitle);
            user.checkoutBook(book);

            bibloteca.displayMessage(Message.SUCCESSFUL_CHECKOUT);

        } catch (InvalidBookException e) {
            bibloteca.displayMessage(Message.UNSUCCESSFUL_CHECKOUT);
        }

    }

    @Override
    public String description() {
        return "Checkout book";
    }
}
