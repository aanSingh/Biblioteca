package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;

public interface MenuItem {

    void action(Library library, Bibloteca bibloteca);

    String description();
}
