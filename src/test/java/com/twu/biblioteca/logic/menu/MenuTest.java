package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MenuTest {
    @Test
    public void shouldReturnMenuItems() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new CheckOutBook();
        MenuItem menuItem3 = new ReturnBook();
        MenuItem menuItem4 = new ViewMovies();
        MenuItem menuItem5 = new Quit();
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
        menuItems.add(menuItem5);
        Menu menu = new Menu(menuItems);

        String actualMenu = menu.display();
        String expectedMenu = "\tBiblotecha Library\n" +
                "\t1. View Books\n" +
                "\t2. Checkout book\n" +
                "\t3. Return book\n" +
                "\t4. View Movies\n" +
                "\t5. Quit\n";
        assertEquals(expectedMenu, actualMenu);

    }

    @Test
    public void shouldViewListOfBooksWhenOptionOneIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBooks = mock(ViewBooks.class);
        menuItems.add(viewBooks);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        menu.select(1, library, biblotecaApp);

        verify(viewBooks, times(1)).action(library, biblotecaApp);

    }

    @Test
    public void shouldCheckOutBookWhenOptionTwoIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        menu.select(2, library, biblotecaApp);

        verify(checkOut, times(1)).action(library, biblotecaApp);

    }


    @Test
    public void shouldReturnBookWhenOptionThreeIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        menu.select(3, library, biblotecaApp);

        verify(checkOut, times(1)).action(library, biblotecaApp);

    }


    @Test
    public void shouldExitFromMenu() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem quit = mock(Quit.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        menuItems.add(quit);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);

        menu.select(4, library, biblotecaApp);

        verify(quit, times(1)).action(library, biblotecaApp);

    }

}