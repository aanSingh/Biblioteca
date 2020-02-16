package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LoginTest {

    @Test
    public void shouldReturnDescriptionForLoginOption() {
        MenuItem menuItem = new Login();
        String expectedQuitDescription = "Login User";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldLoginWhenCredentialsAreCorrect() {

    }

}