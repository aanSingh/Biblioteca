package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.logic.Library;

public class Quit extends MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        System.exit(0);
    }

    @Override
    public String description() {
        return "Quit";
    }
}
