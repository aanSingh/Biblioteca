package com.twu.biblioteca.logic.menu.options;

import com.twu.biblioteca.UI.ConsoleUI;
import com.twu.biblioteca.logic.Bibloteca;
import com.twu.biblioteca.logic.Library;
import com.twu.biblioteca.logic.User;
import com.twu.biblioteca.logic.menu.MenuItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class ViewCheckoutDetailsTest {
    @Test
    public void shouldReturnDescriptionForCheckoutDetailsOption() {
        MenuItem menuItem = new ViewCheckoutDetails();
        String expectedQuitDescription = "View Checkout Details";

        String actualQuitDescription = menuItem.description();

        Assertions.assertEquals(expectedQuitDescription, actualQuitDescription);
    }

    @Test
    public void shouldReturnUsersWithCheckoutDescriptions() {
        MenuItem viewCheckoutDetails = new ViewCheckoutDetails();
        Library library = mock(Library.class);
        Bibloteca bibloteca = mock(ConsoleUI.class);
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        User user3 = mock(User.class);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);


        when(library.getUsers()).thenReturn(users);

        viewCheckoutDetails.action(library, bibloteca);
        verify(bibloteca, times(1)).displayUserDetails(user1);

    }

}