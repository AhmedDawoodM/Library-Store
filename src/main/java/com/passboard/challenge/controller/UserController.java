package com.passboard.challenge.controller;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;
import com.passboard.challenge.model.User;
import com.passboard.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/checkout")
    Cart checkoutCart(){
        List<Book> books = new ArrayList<>();
        return userService.checkoutCart(books);
    }

    @PostMapping("/borrow")
    Cart borrowCart() {
        List<Book> books = new ArrayList<>();
        return userService.borrowCart(books);
    }


}
