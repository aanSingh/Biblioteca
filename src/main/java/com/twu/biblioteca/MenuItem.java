package com.twu.biblioteca;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;

public abstract class MenuItem {
    public String description;

    public abstract void action(Library library, Bibliotecha bibloteca) throws InvalidBookException;
}
