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
    String findBookByName(String bookName) {
        bookService.findBookByName(bookName);
        return "";
    }

    @GetMapping("findByAuthor")
    String findBookByAuthor(String authorName) {
        bookService.findBookByAuthor(authorName);
        return "";
    }

    @GetMapping("isBorrowable")
    String findBookIsBorrowable() {
        bookService.findBookIsBorrowable();
        return "";
    }

}
