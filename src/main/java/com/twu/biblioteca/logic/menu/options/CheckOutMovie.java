package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;

public class CheckOutMovie implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String movieTitle = bibloteca.getMovieTitle();

        try {
            library.checkoutMovie(movieTitle);
            bibloteca.displayMessage(Message.SUCCESSFUL_CHECKOUT_MOVIE);

        } catch (InvalidMovieException e) {
            bibloteca.displayMessage(Message.UNSUCCESSFUL_CHECKOUT_MOVIE);
        }

    }

    @Override
    public String description() {
        return "Checkout Movie";
    }
}
