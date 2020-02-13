package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;

public class Quit implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        bibloteca.quitApp();
    }

    @Override
    public String description() {
        return "Quit";
    }
}
