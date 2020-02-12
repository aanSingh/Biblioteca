package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.logic.Library;

public interface MenuItem {

    void action(Library library, BiblotecaApp biblotecaApp);

    String description();
}
