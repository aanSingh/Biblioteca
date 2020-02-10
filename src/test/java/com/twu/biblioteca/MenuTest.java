package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    public void shouldAddOneMenuItemToMenu() {
        MenuItem menuItem = new ViewBooks();
        Menu menu = new Menu(menuItem);

        assertEquals(1, menu.itemSize());

    }
}