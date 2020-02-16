package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class LogoutTest {
    @Test
    public void shouldReturnDescriptionLogoutOption() {
        MenuItem menuItem = new Logout();
        String expectedQuitDescription = "Logout";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldReturnDescriptionLoginOption() {
        MenuItem logout = new Logout();
        User user = mock(User.class);
        Bibloteca biblioteca = mock(ConsoleUI.class);
        Library library = mock(Library.class);

        when(biblioteca.getUser()).thenReturn(user);
        logout.action(library, biblioteca);

        verify(user, times(1)).logout();

    }

}