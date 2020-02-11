package com.twu.biblioteca;

import com.twu.biblioteca.logic.Library;

public class Quit extends MenuItem {
    public Quit(String description) {
        this.description = description;
    }

    @Override
    public void action(Library library, Bibliotecha bibliotecha) {
        bibliotecha.quit();
    }
}
