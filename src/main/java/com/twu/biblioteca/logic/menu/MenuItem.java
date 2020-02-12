package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public interface MenuItem {

    public abstract void action(Library library, BiblotecaApp biblotecaApp) throws InvalidBookException;

    public abstract String description();
}
