package com.twu.biblioteca.logic;

import com.twu.biblioteca.exceptions.InvalidBookException;
import com.twu.biblioteca.exceptions.InvalidMovieException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void shouldReturnListOfBooks() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books, null);

        List<Book> actualBookList = library.books();

        assertEquals(actualBookList, books);
    }

    @Test
    public void shouldNotThrowExceptionWhenBookCheckOutSuccessfully() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books, null);
        String book = "The Harry Potter series";

        assertDoesNotThrow(() -> library.checkoutBook(book));

    }

    @Test
    public void shouldThrowExceptionWhenCustomerWriteInvalidNameToCheckOutBook() {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        books.add(book1);
        Library library = new Library(books, null);
        String book = "The Harry Potter seriesss";

        assertThrows(InvalidBookException.class, () -> library.checkoutBook(book));
    }

    @Test
    public void shouldNotThrowExceptionWhenCustomerReturnBookSuccessfully() throws InvalidBookException {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books, null);
        String book = "The Harry Potter series";

        library.checkoutBook(book);

        assertDoesNotThrow(() -> library.returnBook(book));
    }

    @Test
    public void shouldThrowExceptionWhenCustomerWriteInvalidNameToReturnBook() throws InvalidBookException {
        List<Book> books;
        books = new ArrayList<>();
        Book book1 = new Book("The Harry Potter series", "J.K. Rowling", 2000);
        Book book2 = new Book("The Lord of the Rings Trilogy", "J.R.R. Tolkien", 1996);
        books.add(book1);
        books.add(book2);
        Library library = new Library(books, null);
        String bookCheckOut = "The Harry Potter series";
        String bookReturn = "The Harry Potter seriess";

        library.checkoutBook(bookCheckOut);

        assertThrows(InvalidBookException.class, () -> library.returnBook(bookReturn));
    }

    @Test
    public void shouldDisplayOneMovie() {
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        Library library = new Library(null, movies);

        List<Movie> actualMovie = library.movies();

        assertEquals(movies, actualMovie);
    }

    @Test
    public void shouldDisplayListOfMovies() {
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        Library library = new Library(null, movies);

        List<Movie> actualMovie = library.movies();

        assertEquals(movies, actualMovie);
    }
//
//    @Test
//    public void shouldReturnMovieWhenMovieNameMatchesAnyMovieNameInMovieList() throws InvalidMovieException {
//        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
//        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
//        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
//        List<Movie> movies = new ArrayList<>();
//        movies.add(movie1);
//        movies.add(movie2);
//        movies.add(movie3);
//        Library library = new Library(null, movies);
//        String movieName = "A Nightmare on Elm Street";
//
//        Movie actualMovie = library.findMovieByName(movieName, movies);
//
//        assertEquals(movie1, actualMovie);
//    }
//
//    @Test
//    public void shouldThrowExceptionWhenMovieNameDoesNotMatchesAnyMovieNameInMovieList() {
//        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
//        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
//        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
//        List<Movie> movies = new ArrayList<>();
//        movies.add(movie1);
//        movies.add(movie2);
//        movies.add(movie3);
//        Library library = new Library(null, movies);
//        String movieName = "A Nightmare on Elm";
//
//        assertThrows(InvalidMovieException.class, () -> library.findMovieByName(movieName, movies));
//    }
//
//    @Test
//    public void shouldNotThrowExceptionWhenMovieNameDoesMatchesAnyMovieNameInMovieList() {
//        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
//        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
//        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
//        List<Movie> movies = new ArrayList<>();
//        movies.add(movie1);
//        movies.add(movie2);
//        movies.add(movie3);
//        Library library = new Library(null, movies);
//        String movieName = "A Nightmare on Elm Street";
//
//        assertDoesNotThrow(() -> library.findMovieByName(movieName, movies));
//    }

    @Test
    public void shouldNotThrowExceptionWhenMovieCheckOutSuccessfully() {
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        Library library = new Library(null, movies);
        String movieName = "A Nightmare on Elm Street";

        assertDoesNotThrow(() -> library.checkoutMovie(movieName));
    }

    @Test
    public void shouldNotThrowExceptionWhenMovieReturnedSuccessfully() throws InvalidMovieException {
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        Library library = new Library(null, movies);
        String movieName = "A Nightmare on Elm Street";

        library.checkoutMovie(movieName);

        assertDoesNotThrow(() -> library.returnMovie(movieName));
    }

    @Test
    public void shouldThrowExceptionWhenMovieReturnedSuccessfully() throws InvalidMovieException {
        Movie movie1 = new Movie("A Nightmare on Elm Street", 1984, "Wes Craven", 8);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, " Frank Darabont", 9);
        Movie movie3 = new Movie("The Godfather", 1972, "Francis Ford Coppola", 9);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        Library library = new Library(null, movies);
        String movieCheckout = "A Nightmare on Elm Street";

        library.checkoutMovie(movieCheckout);

        String movieReturn = "A Nightmare on Elm";
        assertThrows(InvalidMovieException.class, () -> library.returnMovie(movieReturn));
    }

}