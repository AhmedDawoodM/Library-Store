package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findBookByName(String name);
    List<Book> findBookByAuthor(String authorName);
    List<Book> findBookIsBorrowable();

}
