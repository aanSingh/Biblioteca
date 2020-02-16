package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;

public class Logout implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        User user = bibloteca.getUser();
        user.logout();
        bibloteca.unsetUser();
    }

    @Override
    public String description() {
        return "Logout";
    }
}
