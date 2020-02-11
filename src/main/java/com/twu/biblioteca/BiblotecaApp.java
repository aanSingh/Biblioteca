package com.twu.biblioteca;

import java.util.Scanner;

public class BiblotecaApp {
    Bibliotecha bibliotecha;

    BiblotecaApp() {
        bibliotecha = new Bibliotecha();
    }

    public static void main(String[] args) {
        BiblotecaApp biblotecaApp = new BiblotecaApp();

        biblotecaApp.message();
        biblotecaApp.menu();
    }

    private void message() {
        System.out.println(bibliotecha.welcomeMessage());
    }

    private void getChoice() {
        System.out.println("Enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            bibliotecha.execute(choice);
            System.out.println(bibliotecha.getBooks());
        } else if (choice == 2 || choice == 3) {
            enterBookName();
            bibliotecha.execute(choice);
        } else if (choice == 4) {
            bibliotecha.quit();
        }

    }

    private void menu() {
        while (true) {
            String menu = bibliotecha.displayMenu();
            System.out.println(menu);

            getChoice();
        }
    }

    public void enterBookName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book name : ");
        String bookName = scanner.nextLine();

        bibliotecha.setBookName(bookName);

    }
}
