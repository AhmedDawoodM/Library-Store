package com.passboard.challenge.controller;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    @ResponseBody
    @PostMapping("findByName")
    List<Book> findBookByName(@RequestHeader String bookName) {
        return bookService.findBookByName(bookName);
    }

    @ResponseBody
    @PostMapping("findByAuthor")
    List<Book> findBookByAuthor(@RequestHeader String authorName) {
        return bookService.findBookByAuthor(authorName);
    }

    @ResponseBody
    @PostMapping("isBorrowable")
    List<Book> findBookIsBorrowable() {
        return bookService.findBookIsBorrowable();
    }

}
