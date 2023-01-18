package com.passboard.challenge.service;

import com.passboard.challenge.model.Book;
import com.passboard.challenge.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<Book> checkoutCart(Cart cart) {
        return null;
    }

    @Override
    public List<Book> borrowCart(Cart cart) {
        return null;
    }
}
