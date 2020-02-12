package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.exceptions.InvalidBookException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class QuitTest {
    @Test
    public void shouldReturnDescriptionForQuitOption() throws InvalidBookException {
        MenuItem menuItem = new Quit();
        String expectedQuitDescription = "Quit";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

}