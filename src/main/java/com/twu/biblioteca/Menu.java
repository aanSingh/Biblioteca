package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItem;

    public Menu(List<MenuItem> menuItem) {
        this.menuItem = new ArrayList<>();
        this.menuItem = menuItem;
    }

    public Menu() {
        this.menuItem = new ArrayList<>();
        menuItem.add(new ViewBooks("View Books"));
        menuItem.add(new CheckOut("Checkout Book"));
        menuItem.add(new ReturnBook("Return Book"));
        menuItem.add(new Quit("Quit"));
    }

    public int itemSize() {
        return menuItem.size();
    }

    public String display() {
        StringBuilder menu = new StringBuilder("Biblotecha Library\n");

        for (int index = 0; index < menuItem.size(); index++)
            menu.append(index + 1).append(". ").append(menuItem.get(index).description).append("\n");

        return menu.toString();
    }

    public void select(int i, Library library, Bibliotecha bibliotecha) {
        menuItem.get(i - 1).action(library, bibliotecha);
    }
}
