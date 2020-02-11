package com.twu.biblioteca;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BibliotechaTest {
    @Test
    public void shouldReturnWelcomeMessageWhenCustomerEntersBibloteca() {
        Bibliotecha bibliotecha = new Bibliotecha();
        String expectedMessage = Message.WELCOME;

        String actualMessage = bibliotecha.welcomeMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void shouldDisplayMenu() {
        Bibliotecha bibliotecha = new Bibliotecha();
        String actualMenu = "Biblotecha Library\n1. View Books\n2. Checkout Book\n3. Return Book\n4. Quit\n";

        String expectedMenu = bibliotecha.displayMenu();

        assertTrue(actualMenu.equals(expectedMenu));
    }

    @Test
    public void shouldExecuteOptionOne() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = new Bibliotecha(library, menu);

        bibliotecha.execute(1);

        verify(menu, times(1)).select(1, library, bibliotecha);

    }

    @Test
    public void shouldExecuteOptionTwo() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = new Bibliotecha(library, menu);

        bibliotecha.execute(2);

        verify(menu, times(1)).select(2, library, bibliotecha);

    }

    @Test
    public void shouldReturnBookNameEnteredByUser() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Bibliotecha bibliotecha = new Bibliotecha(library, menu);
        bibliotecha.setBookName("The Harry Potter series");
        String expectedBookName = "The Harry Potter series";
        String actualBookName = bibliotecha.getBookName();

        assertEquals(expectedBookName, actualBookName);

    }

}