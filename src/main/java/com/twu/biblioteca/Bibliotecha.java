package com.twu.biblioteca;

public class Bibliotecha {

    Bibliotecha() {
    }

    void welcomeMessage() {
        System.out.println(Message.getWelcomeMessage());
    }

    public static void main(String[] args) {
        Bibliotecha bibliotecha = new Bibliotecha();
        bibliotecha.welcomeMessage();

    }
}
