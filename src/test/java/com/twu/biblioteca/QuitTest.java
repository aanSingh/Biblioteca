package com.twu.biblioteca;

import com.twu.biblioteca.logic.Library;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class QuitTest {
    @Test
    public void shouldExitTheApplication() {
        Bibliotecha bibliotecha = mock(Bibliotecha.class);
        Library library = mock(Library.class);
        MenuItem quit = new Quit("Quit");

        quit.action(library, bibliotecha);

        verify(bibliotecha,times(1)).quit();
    }

}