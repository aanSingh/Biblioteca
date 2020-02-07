package com.twu.biblioteca;

public class Message {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
    private static final String INVALID_MESSAGE = "Please select a valid option!";

    static String welcomeMessage() {
        return WELCOME_MESSAGE;
    }

    static String invalidMessage() {
        return INVALID_MESSAGE;
    }

}
