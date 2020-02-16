package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.options.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MenuTest {
    @Test
    public void shouldReturnMenuItems() {
        MenuItem menuItem1 = new Login();
        MenuItem menuItem2 = new ViewBooks();
        MenuItem menuItem3 = new ViewMovies();
        MenuItem menuItem4 = new Quit();
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        menuItemLibraries.add(menuItem1);
        menuItemLibraries.add(menuItem2);
        menuItemLibraries.add(menuItem3);
        menuItemLibraries.add(menuItem4);

        Menu menu = new Menu(menuItemLibraries);

        String actualMenu = menu.display();
        String expectedMenu = "\tBiblotecha Library\n" +
                "\t1. Login User\n" +
                "\t2. View Books\n" +
                "\t3. View Movies\n" +
                "\t4. Quit\n";
        assertEquals(expectedMenu, actualMenu);

    }

    @Test
    public void shouldViewLoginUserWhenOptionOneIsSelected() throws InvalidBookException {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem login = mock(Login.class);
        menuItemLibraries.add(login);
        Menu menu = new Menu(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(1, library, bibloteca);

        verify(login, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldViewListOfBooksWhenOptionTwoIsSelected() throws InvalidBookException {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem login = mock(Login.class);
        MenuItem viewBook = mock(ViewBooks.class);
        menuItemLibraries.add(login);
        menuItemLibraries.add(viewBook);
        Menu menu = new Menu(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(2, library, bibloteca);

        verify(viewBook, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldViewListOfMoviesWhenOptionFourIsSelected() throws InvalidBookException {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem login = mock(Login.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem viewMovie = mock(ViewBooks.class);
        menuItemLibraries.add(login);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(viewMovie);

        Menu menu = new Menu(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(3, library, bibloteca);

        verify(viewMovie, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldExitFromMenu() throws InvalidBookException {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem quit = mock(Quit.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        menuItemLibraries.add(quit);
        Menu menu = new Menu(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(4, library, bibloteca);

        verify(quit, times(1)).action(library, bibloteca);

    }
}