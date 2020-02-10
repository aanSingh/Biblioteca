package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotechaTest {
    @Test
    public void shouldReturnWelcomeMessageWhenCustomerEntersBibloteca() {
        Bibliotecha bibliotecha = new Bibliotecha();
        String actualMessage = bibliotecha.welcomeMessage();
        String expectedMessage = Message.WELCOME;

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void shouldReturnListOfBooks() {
        Bibliotecha bibliotecha = new Bibliotecha();
        List<Book> books = bibliotecha.getAllBooks();
    }

}