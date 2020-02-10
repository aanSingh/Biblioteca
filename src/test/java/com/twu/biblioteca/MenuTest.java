package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    public void shouldAddAllMenuItemToMenu() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new checkOut();
        MenuItem menuItem3 = new returnBook();
        MenuItem menuItem4 = new Quit();

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        Menu menu = new Menu(menuItems);

        assertEquals(4, menu.itemSize());
    }
}