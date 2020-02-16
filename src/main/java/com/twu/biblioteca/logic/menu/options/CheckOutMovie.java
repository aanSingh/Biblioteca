package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.*;
import com.twu.biblioteca.logic.menu.MenuItem;

public class CheckOutMovie implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String movieTitle = bibloteca.getMovieTitle();
        User user;

        try {
            library.checkoutMovie(movieTitle);
            Movie movie = library.getCheckoutMovie(movieTitle);
            user = bibloteca.getUser();
            user.checkoutMovie(movie);
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
