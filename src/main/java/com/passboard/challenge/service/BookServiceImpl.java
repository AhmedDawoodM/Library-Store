package com.passboard.challenge.service;

import com.passboard.challenge.model.Author;
import com.passboard.challenge.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Override
    public List<Book> findBookByName(String name) {

        List<Book> books = simulateDatabaseReturnList();

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
        List<Book> books = simulateDatabaseReturnList();

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
        List<Book> books = simulateDatabaseReturnList();

        List<Book> searchResult = new ArrayList<>();
        for (Book book : books){
            if (isBorrowable(book)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    private List<Book> simulateDatabaseReturnList() {
        Book book1 = new Book(1, "Days", new Author(11,"Taha Hussein"), 4, true);
        Book book2 = new Book(2, "The Bro Code", new Author(22,"Davinci"), 8, true);
        Book book3 = new Book(3, "The Play Book", new Author(33,"Solvan King"), 6, false);
        Book book4 = new Book(4, "Prisoners", new Author(44,"Snow Shoe"), 1, true);
        Book book5 = new Book(5, "Java for Beginners", new Author(55,"David Adams"), 10, false);
        Book book6 = new Book(6, "Once Upon a Time", new Author(66,"Steve Jobs"), 1, false);
        Book book7 = new Book(7, "Doctors", new Author(77,"Mohamed Hussein Yakoub"), 7, true);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);

        return books;
    }

    private boolean isBorrowable(Book book){
        if(book.getQty() <= 1)
            return false;
        return true;
    }
}
