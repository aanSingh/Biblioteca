package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.logic.Library;

public class ReturnMovie implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {

    }

    @Override
    public String description() {
        return "Return Movie";
    }
}
