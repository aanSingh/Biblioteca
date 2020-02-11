package com.twu.biblioteca;

import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MenuTest {
    @Test
    public void shouldAddAllMenuItemToMenu() {
        MenuItem menuItem1 = new ViewBooks("View Book");
        MenuItem menuItem2 = new CheckOut("Check Out");
        MenuItem menuItem3 = new ReturnBook("Return Book");
        MenuItem menuItem4 = new Quit("Quit");
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        Menu menu = new Menu(menuItems);

        assertEquals(4, menu.itemSize());
    }

    @Test
    public void shouldReturnMenuItems() {
        MenuItem menuItem1 = new ViewBooks("View Books");
        MenuItem menuItem2 = new CheckOut("Check Out");
        MenuItem menuItem3 = new ReturnBook("Return Book");
        MenuItem menuItem4 = new Quit("Quit");
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
        Menu menu = new Menu(menuItems);

        String actualMenu = menu.display();
        String expectedMenu = "Biblotecha Library\n1. View Books\n2. Check Out\n3. Return Book\n4. Quit\n";

        assertEquals(expectedMenu, actualMenu);

    }

    @Test
    public void shouldViewListOfBooksWhenOptionOneIsSelected() {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBooks = mock(ViewBooks.class);
        menuItems.add(viewBooks);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = mock(Bibliotecha.class);

        menu.select(1, library, bibliotecha);

        verify(viewBooks, times(1)).action(library, bibliotecha);

    }

    @Test
    public void shouldCheckOutBookWhenOptionTwoIsSelected() {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOut.class);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = mock(Bibliotecha.class);

        menu.select(2, library, bibliotecha);

        verify(checkOut, times(1)).action(library, bibliotecha);

    }


    @Test
    public void shouldReturnBookWhenOptionThreeIsSelected() {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOut.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = mock(Bibliotecha.class);

        menu.select(3, library, bibliotecha);

        verify(checkOut, times(1)).action(library, bibliotecha);

    }


    @Test
    public void shouldExitFromMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOut.class);
        MenuItem quit = mock(Quit.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        menuItems.add(quit);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = mock(Bibliotecha.class);

        menu.select(4, library, bibliotecha);

        verify(quit, times(1)).action(library, bibliotecha);

    }

}