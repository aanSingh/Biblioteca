package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.options.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MenuCustomerTest {
    @Test
    public void shouldReturnMenuItems() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new CheckOutBook();
        MenuItem menuItem3 = new ReturnBook();
        MenuItem menuItem4 = new ViewMovies();
        MenuItem menuItem5 = new CheckOutMovie();
        MenuItem menuItem6 = new ReturnMovie();
        MenuItem menuItem7 = new Quit();
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        menuItemLibraries.add(menuItem1);
        menuItemLibraries.add(menuItem2);
        menuItemLibraries.add(menuItem3);
        menuItemLibraries.add(menuItem4);
        menuItemLibraries.add(menuItem5);
        menuItemLibraries.add(menuItem6);
        menuItemLibraries.add(menuItem7);

        MenuCustomer menu = new MenuCustomer(menuItemLibraries);

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
    public void shouldViewListOfBooksWhenOptionOneIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem viewBooks = mock(ViewBooks.class);
        menuItemLibraries.add(viewBooks);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(1, library, bibloteca);

        verify(viewBooks, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldCheckOutBookWhenOptionTwoIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(2, library, bibloteca);

        verify(checkOut, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldReturnBookWhenOptionThreeIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(3, library, bibloteca);

        verify(checkOut, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldExitFromMenu() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem quit = mock(Quit.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        menuItemLibraries.add(quit);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(4, library, bibloteca);

        verify(quit, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldViewListOfMoviesWhenOptionFourIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        menuItemLibraries.add(viewMovies);
        menuItemLibraries.add(quit);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(4, library, bibloteca);

        verify(viewMovies, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldCheckoutMovieWhenOptionFiveIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem checkoutMovie = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        menuItemLibraries.add(viewMovies);
        menuItemLibraries.add(checkoutMovie);
        menuItemLibraries.add(quit);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(5, library, bibloteca);

        verify(checkoutMovie, times(1)).action(library, bibloteca);

    }

    @Test
    public void shouldReturnMovieWhenOptionSixIsSelected() {
        List<MenuItem> menuItemLibraries = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOutBook.class);
        MenuItem viewMovies = mock(ViewMovies.class);
        MenuItem checkoutMovie = mock(ViewMovies.class);
        MenuItem returnMovie = mock(ViewMovies.class);
        MenuItem quit = mock(Quit.class);
        menuItemLibraries.add(returnBook);
        menuItemLibraries.add(viewBook);
        menuItemLibraries.add(checkOut);
        menuItemLibraries.add(viewMovies);
        menuItemLibraries.add(checkoutMovie);
        menuItemLibraries.add(returnMovie);
        menuItemLibraries.add(quit);
        MenuCustomer menu = new MenuCustomer(menuItemLibraries);
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);

        menu.select(6, library, bibloteca);

        verify(returnMovie, times(1)).action(library, bibloteca);

    }
}