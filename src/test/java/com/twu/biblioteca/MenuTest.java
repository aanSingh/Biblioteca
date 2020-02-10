package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    public void shouldAddOneMenuItemToMenu() {
        MenuItem menuItem = new ViewBooks();
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem);

        Menu menu = new Menu(menuItems);

        assertEquals(1, menu.itemSize());
    }

    @Test
    public void shouldAddTwoMenuItemToMenu() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new checkOut();
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);

        Menu menu = new Menu(menuItems);

        assertEquals(2, menu.itemSize());
    }


    @Test
    public void shouldAddThreeMenuItemToMenu() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new checkOut();
        MenuItem menuItem3 = new returnBook();

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);

        Menu menu = new Menu(menuItems);

        assertEquals(3, menu.itemSize());
    }


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