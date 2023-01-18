package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;

import java.util.List;

public interface UserService {

    List<Book> checkoutCart(Cart cart);
    List<Book> borrowCart(Cart cart);

}
