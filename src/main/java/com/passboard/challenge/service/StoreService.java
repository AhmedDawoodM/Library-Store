package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;

import java.util.List;

public interface StoreService {

    List<Book> findBookByName(String name);
    List<Book> findBookByAuthor(String authorName);



}
