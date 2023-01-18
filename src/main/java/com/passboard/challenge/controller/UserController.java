package com.passboard.challenge.controller;

import com.passboard.challenge.model.Cart;
import com.passboard.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/checkout")
    public String checkoutCart(Cart cart){
        userService.checkoutCart(cart);
        return "";
    }

    @PostMapping("/borrow")
    public String borrowCart(Cart cart){
        userService.borrowCart(cart);
        return "";
    }


}
