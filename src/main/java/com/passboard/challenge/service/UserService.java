package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;
import com.passboard.challenge.model.User;

import java.util.List;

public interface UserService {

    Cart checkoutCart(List<Book> books);
    Cart borrowCart(List<Book> books);

}
