package com.passboard.challenge.model;

import java.util.List;

public class Cart {

    long id;
    List<Book> books;

    public Cart() {
    }

    public Cart(long id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
