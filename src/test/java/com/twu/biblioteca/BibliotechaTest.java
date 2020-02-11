package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

}