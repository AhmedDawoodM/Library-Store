package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;

import java.util.List;

public interface UserService {

    Cart buyCart(List<Book> books);
    Cart borrowCart(List<Book> books);

}
