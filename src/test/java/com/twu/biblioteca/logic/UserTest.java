package com.twu.biblioteca.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void shouldReturnTrueWhenLibraryNumberAndPasswordAreCorrect() {
        User user = new User("abc-1234", "abc-1234", 1);
        boolean expectedResult = true;

        boolean actualResult = user.login("abc-1234", "abc-1234");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnFalseWhenLibraryNumberOrPasswordAreInCorrect() {
        User user = new User("abc-1234", "abc-1234", 1);
        boolean expectedResult = false;

        boolean actualResult = user.login("abc-1235", "abc-1234");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnIsLoggedOutFalseWhenUserLogsOut() {
        User user = new User("abc-1234", "abc-1234", 1);
        user.login("abc-1235", "abc-1234");
        user.logout();
        boolean expectedResult = false;

        boolean actualResult = user.isLoggedIn;

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldReturnRoleOneWhenCustomerLogsIn() {
        User user = new User("abc-1234", "abc-1234", 1);
        user.login("abc-1235", "abc-1234");
        int expectedResult = 1;
        int actualResult = user.getRole();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldEquateLibraryNumberWithUsersLibraryNumebr() {
        User user = new User("abc-1234", "abc-1234", 1);
        user.login("abc-1235", "abc-1234");
        String expectedResult = "abc-1234";

        String actualResult = user.libraryNumber;

        assertEquals(expectedResult, actualResult);

    }

}