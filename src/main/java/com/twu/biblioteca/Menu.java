package com.twu.biblioteca;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItem;

    public Menu(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public int itemSize() {
        return menuItem.size();
    }
}
