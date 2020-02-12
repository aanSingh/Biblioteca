package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MenuTest {
    @Test
    public void shouldReturnMenuItems() {
        MenuItem menuItem1 = new ViewBooks();
        MenuItem menuItem2 = new CheckOut();
        MenuItem menuItem3 = new ReturnBook();
        MenuItem menuItem4 = new Quit();
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
        Menu menu = new Menu(menuItems);

        String actualMenu = menu.display();
        System.out.println(actualMenu);
        String expectedMenu = "\tBiblotecha Library\n" +
                "\t1. View Books\n" +
                "\t2. Checkout book\n" +
                "\t3. Return book\n" +
                "\t4. Quit\n";
        assertEquals(expectedMenu, actualMenu);

    }

    @Test
    public void shouldViewListOfBooksWhenOptionOneIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBooks = mock(ViewBooks.class);
        menuItems.add(viewBooks);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);

        menu.select(1, library, bufferedReader, printWriter);

        verify(viewBooks, times(1)).action(library, bufferedReader, printWriter);

    }

    @Test
    public void shouldCheckOutBookWhenOptionTwoIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOut.class);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);

        menu.select(2, library, bufferedReader, printWriter);

        verify(checkOut, times(1)).action(library, bufferedReader, printWriter);

    }


    @Test
    public void shouldReturnBookWhenOptionThreeIsSelected() throws InvalidBookException, IOException {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem returnBook = mock(ReturnBook.class);
        MenuItem viewBook = mock(ViewBooks.class);
        MenuItem checkOut = mock(CheckOut.class);
        menuItems.add(returnBook);
        menuItems.add(viewBook);
        menuItems.add(checkOut);
        Menu menu = new Menu(menuItems);
        Library library = mock(Library.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);

        menu.select(3, library, bufferedReader, printWriter);

        verify(checkOut, times(1)).action(library, bufferedReader, printWriter);

    }


    @Test
    public void shouldExitFromMenu() throws InvalidBookException, IOException {
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
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintWriter printWriter = mock(PrintWriter.class);

        menu.select(4, library, bufferedReader, printWriter);

        verify(quit, times(1)).action(library, bufferedReader, printWriter);

    }

}