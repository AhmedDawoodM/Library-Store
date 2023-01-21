package com.passboard.challenge.controller;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;
import com.passboard.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/buy")
    Cart buyCart(){
        List<Book> books = new ArrayList<>();
        return userService.buyCart(books);
    }

    @PostMapping("/borrow")
    Cart borrowCart() {
        List<Book> books = new ArrayList<>();
        return userService.borrowCart(books);
    }


}
