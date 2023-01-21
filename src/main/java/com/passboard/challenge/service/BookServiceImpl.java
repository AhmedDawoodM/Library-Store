package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookServiceRestrictions bookServiceRestrictions;
    @Override
    public List<Book> findBookByName(String name) {

        List<Book> books = bookServiceRestrictions.simulateDatabaseReturnListAllBooks();

        List<Book> searchResult = new ArrayList<>();
        for (Book book : books){
            if (book.getName().contains(name)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public List<Book> findBookByAuthor(String authorName) {
        List<Book> books = bookServiceRestrictions.simulateDatabaseReturnListAllBooks();

        List<Book> searchResult = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().getName().contains(authorName)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public List<Book> findBookIsBorrowable() {
        List<Book> books = bookServiceRestrictions.simulateDatabaseReturnListAllBooks();

        List<Book> searchResult = new ArrayList<>();
        for (Book book : books){
            if (bookServiceRestrictions.isBorrowable(book)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

}
