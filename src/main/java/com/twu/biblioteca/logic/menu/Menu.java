package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.constants.Message;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItem;

    public Menu(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public String display() {
        StringBuilder menu = new StringBuilder("\t"+Message.LIBRARY_NAME+"\n");

        for (int index = 0; index < menuItem.size(); index++)
            menu.append("\t").append(index + 1).append(". ").append(menuItem.get(index).description()).append("\n");

        return menu.toString();
    }

    public void select(int i, Library library, Bibloteca bibloteca) throws InvalidBookException {
        menuItem.get(i - 1).action(library, bibloteca);
    }
}
