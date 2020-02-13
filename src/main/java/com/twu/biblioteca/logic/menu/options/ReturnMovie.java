package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;

public class ReturnMovie implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String movieTitle = bibloteca.getMovieTitle();

        try {
            library.returnMovie(movieTitle);
            bibloteca.displayMessage(Message.SUCCESSFUL_RETURN_MOVIE);

        } catch (InvalidMovieException e) {
            bibloteca.displayMessage(Message.UNSUCCESSFUL_RETURN_MOVIE);
        }
    }

    @Override
    public String description() {
        return "Return Movie";
    }
}
