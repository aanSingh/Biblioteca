package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Library;

public class CheckOutMovie implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String movieTitle = biblotecaApp.getMovieTitle();

        try {
            library.checkoutMovie(movieTitle);
            biblotecaApp.displayMessage(Message.SUCCESSFUL_CHECKOUT_MOVIE);

        } catch (InvalidMovieException e) {
            biblotecaApp.displayMessage(Message.UNSUCCESSFUL_CHECKOUT_MOVIE);
        }

    }

    @Override
    public String description() {
        return "Checkout movie";
    }
}
