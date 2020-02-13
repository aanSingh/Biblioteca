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
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new CheckOutBook();
        MenuItem menuItem3 = new ReturnBook();
        MenuItem menuItem4 = new ViewMovies();
        MenuItem menuItem5 = new CheckOutMovie();
        MenuItem menuItem6 = new ReturnMovie();
        MenuItem menuItem7 = new Quit();
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
        menuItems.add(menuItem5);
        menuItems.add(menuItem6);
        menuItems.add(menuItem7);

        Menu menu = new Menu(menuItems);

        String actualMenu = menu.display();
        String expectedMenu = "\tBiblotecha Library\n" +
                "\t1. View Books\n" +
                "\t2. Checkout book\n" +
                "\t3. Return book\n" +
                "\t4. View Movies\n" +
                "\t5. Checkout Movie\n" +
                "\t6. Return Movie\n" +
                "\t7. Quit\n";
        assertEquals(expectedMenu, actualMenu);

    }

    @Test
    public void shouldViewListOfBooksWhenOptionOneIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBooks = mock(ViewBooks.class);
        menuItems.add(viewBooks);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(1, library, bibloteca);

        verify(viewBooks, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldCheckOutBookWhenOptionTwoIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(2, library, bibloteca);

        verify(checkOut, times(1)).action(library, bibloteca);

    }


    @Test
    public void shouldReturnBookWhenOptionThreeIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(3, library, bibloteca);

        verify(checkOut, times(1)).action(library, bibloteca);

    }


    @Test
    public void shouldExitFromMenu() throws InvalidBookException {
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
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(4, library, bibloteca);

        verify(quit, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldViewListOfMoviesWhenOptionFourIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        menuItems.add(viewMovies);
        menuItems.add(quit);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(4, library, bibloteca);

        verify(viewMovies, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldCheckoutMovieWhenOptionFiveIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem checkoutMovie = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        menuItems.add(viewMovies);
        menuItems.add(checkoutMovie);
        menuItems.add(quit);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(5, library, bibloteca);

        verify(checkoutMovie, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldReturnMovieWhenOptionSixIsSelected() throws InvalidBookException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem checkoutMovie = mock(ViewMovies.class);
        MenuItem returnMovie = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        menuItems.add(viewMovies);
        menuItems.add(checkoutMovie);
        menuItems.add(returnMovie);
        menuItems.add(quit);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(6, library, bibloteca);

        verify(returnMovie, times(1)).action(library, bibloteca);

    }
}