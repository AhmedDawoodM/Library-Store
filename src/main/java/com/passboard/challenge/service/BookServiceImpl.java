package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Override
    public List<Book> findBookByName(String name) {
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String authorName) {
        return null;
    }

    @Override
    public List<Book> findBookIsBorrowable(String authorName) {
        return null;
    }
}
