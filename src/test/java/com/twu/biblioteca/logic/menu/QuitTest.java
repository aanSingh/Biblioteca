package com.twu.biblioteca.logic.menu;

import com.twu.biblioteca.UI.BiblotecaApp;
import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.logic.Library;
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
        BiblotecaApp biblotecaApp = mock(BiblotecaApp.class);
        Library library = mock(Library.class);

        menuItem.action(library, biblotecaApp);

        verify(biblotecaApp, times(1)).quitApp();
    }

}