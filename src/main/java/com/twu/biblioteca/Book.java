package com.twu.biblioteca;

import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

public class Book {
    private final String name;
    private final String author;
    private final int publicationYear;

    public Book(String name, String author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }

    public String getName() {
        return name;
    }

    public void display(){
        Stream<? extends Serializable> books = Stream.of(name, author, publicationYear);
        books.forEach(System.out::println);
    }

}
