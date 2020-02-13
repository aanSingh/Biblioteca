package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class QuitTest {
    @Test
    public void shouldReturnDescriptionForQuitOption() {
        MenuItem menuItem = new Quit();
        String expectedQuitDescription = "Quit";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldQuitApplication() throws InvalidBookException {
        MenuItem menuItem = new Quit();
        Bibloteca bibloteca = mock(ConsoleUI.class);
        Library library = mock(Library.class);

        menuItem.action(library, bibloteca);

        verify(bibloteca, times(1)).quitApp();
    }

}