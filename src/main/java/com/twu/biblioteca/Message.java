package com.twu.biblioteca;

public class Message {
    private static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
    private static final String INVALID_OPTION = "Please select a valid option!";
    private static final String SUCCESSFUL_CHECKOUT = "Thank you! Enjoy the book";
    private static final String UNSUCCESSFUL_CHECKOUT = "Sorry, that book is not available";
    private static final String SUCCESSFUL_RETURN = "Thank you for returning the book";
    private static final String UNSUCCESSFUL_RETURN = "That is not a valid book to return.";


    static String welcomeMessage() {
        return WELCOME;
    }

    static String invalidMessage() {
        return INVALID_OPTION;
    }

    static String successMessage() {
        return SUCCESSFUL_CHECKOUT;
    }

    static String unsuccessfulCheckout() {
        return UNSUCCESSFUL_CHECKOUT;
    }

    static String successfulReturn() {
        return SUCCESSFUL_RETURN;
    }

    static String unsuccessfulReturn() {
        return UNSUCCESSFUL_RETURN;
    }
}
