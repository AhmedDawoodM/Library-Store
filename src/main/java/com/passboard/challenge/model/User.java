package com.passboard.challenge.model;

public class User {

    long id;
    String name;
    Cart cart;
    double balance;

    public User() {
    }

    public User(long id, String name, Cart cart, double balance) {
        this.id = id;
        this.name = name;
        this.cart = cart;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
