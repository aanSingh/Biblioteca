package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public class CheckOutMovie implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) throws InvalidBookException {

    }

    @Override
    public String description() {
        return "Checkout movie";
    }
}
