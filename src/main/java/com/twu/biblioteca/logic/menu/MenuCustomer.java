package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;

import java.util.List;

public class MenuCustomer {
    List<MenuItem> menuItems;

    public MenuCustomer(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String display() {
        StringBuilder menu = new StringBuilder("\t" + Message.LIBRARY_NAME + "\n");

        for (int index = 0; index < menuItems.size(); index++)
            menu.append("\t").append(index + 1).append(". ").append(menuItems.get(index).description()).append("\n");

        return menu.toString();
    }

    public void select(int i, Library library, Bibloteca bibloteca) {
        menuItems.get(i - 1).action(library, bibloteca);
    }

}
