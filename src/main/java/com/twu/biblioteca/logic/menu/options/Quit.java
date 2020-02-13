package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.logic.Library;

public class Quit implements MenuItem {
    @Override
    public void action(Library library, BiblotecaApp biblotecaApp) {
        biblotecaApp.quitApp();
    }

    @Override
    public String description() {
        return "Quit";
    }
}
