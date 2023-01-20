package com.passboard.challenge.controller;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("findByName")
    List<Book> findBookByName(String bookName) {
        return bookService.findBookByName(bookName);
    }

    @GetMapping("findByAuthor")
    List<Book> findBookByAuthor(String authorName) {
        return bookService.findBookByAuthor(authorName);
    }

    @GetMapping("isBorrowable")
    List<Book> findBookIsBorrowable() {
        return bookService.findBookIsBorrowable();

    }

}
