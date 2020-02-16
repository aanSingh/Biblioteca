package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;

import java.util.List;

public class ViewCheckoutDetails implements MenuItem {
    @Override
    public void action(Library library, Bibloteca bibloteca) {
        List<User> users = library.getUsers();

        if (users.size() == 0) {
            bibloteca.displayMessage("No Users");
        }

        for (User user : users) {
            bibloteca.displayUserDetails(user);
        }
    }

    @Override
    public String description() {
        return "View Checkout Details";
    }
}
