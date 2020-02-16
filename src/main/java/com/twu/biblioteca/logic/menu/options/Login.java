package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;

import java.util.List;

public class Login implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        String libraryNumber = bibloteca.getLibraryNumber();
        String password = bibloteca.getPassword();
        List<User> users = library.getUsers();
        boolean loginSuccessful = false;

        for (User user1 : users) {
            if (user1.login(libraryNumber, password)) {
                loginSuccessful = true;
                bibloteca.setUser(user1);
                break;
            }
        }

        if (loginSuccessful) {
            bibloteca.displayMessage("Welcome to Bibloteca");
        } else
            bibloteca.displayMessage("Invalid credentials");

    }

    @Override
    public String description() {
        return "Login User";
    }
}
