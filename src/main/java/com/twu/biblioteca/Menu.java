package com.twu.biblioteca;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItem;

    public Menu(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

//    public Menu() {
//        menuItem.add(new ViewBooks());
//        menuItem.add(new ReturnBook());
//        menuItem.add(new CheckOut());
//        menuItem.add(new Quit());
//    }

    public int itemSize() {
        return menuItem.size();
    }

    public String display() {
        StringBuilder menu = new StringBuilder("Biblotecha Library\n");

        for (int index = 0; index < menuItem.size(); index++)
            menu.append(index + 1).append(". ").append(menuItem.get(index).description).append("\n");

        return menu.toString();
    }

}
