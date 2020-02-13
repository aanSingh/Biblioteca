package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import com.twu.biblioteca.logic.Library;

public class ReturnMovie implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        String movieTitle = biblotecaApp.getMovieTitle();

        try {
            library.returnMovie(movieTitle);
            biblotecaApp.displayMessage(Message.SUCCESSFUL_RETURN_MOVIE);

        } catch (InvalidMovieException e) {
            biblotecaApp.displayMessage(Message.UNSUCCESSFUL_RETURN_MOVIE);
        }
    }

    @Override
    public String description() {
        return "Return Movie";
    }
}
