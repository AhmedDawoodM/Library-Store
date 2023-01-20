package com.passboard.challenge.service;

import com.passboard.challenge.model.*;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Override
    public Cart checkoutCart(List<Book> books) {

        double totalPrice = 0;


        Book book1 = new Book(
                1, "Days of our lifes",
                new Category(11,"Comedy"),
                new Author(111,"Albert Divido"),
                "This Book is about fantasy and comedy",
                10, 50, 5.5);

        Book book2 = new Book(
                1, "The one",
                new Category(22,"Horror"),
                new Author(222,"Daniel Lewis"),
                "This Book is about crime and mystery",
                5, 70, 7.5);

        totalPrice = book1.getBuyPrice() + book2.getBuyPrice();

        User user = new User(121212, "Mohamed Adel", 500);
        if(isExist(book1) && isExist(book2)) {
            if (user.getBalance() > totalPrice) {
                user.setBalance(user.getBalance() - totalPrice);
                book1.setQty(book1.getQty()-1);
                book2.setQty(book2.getQty()-1);
                books.add(book1);
                books.add(book2);

                System.out.println("hey," + user.getName());
                System.out.println("You just bought ["+ book1.getName() + ", " + book2.getName()+"]");
                System.out.println("You payed total amount of : " + totalPrice);
                System.out.println("Your remaining balance is : " + user.getBalance());
            }
        }

        return new Cart(1212, books);
    }

    @Override
    public Cart borrowCart(List<Book> books) {

        double totalPrice = 0;

        Book book1 = new Book(
                1, "Days of our lifes",
                new Category(11,"Comedy"),
                new Author(111,"Albert Divido"),
                "This Book is about fantasy and comedy",
                10, 50, 5.5);

        Book book2 = new Book(
                1, "The one",
                new Category(22,"Horror"),
                new Author(222,"Daniel Lewis"),
                "This Book is about crime and mystery",
                5, 70, 7.75);

        totalPrice = book1.getBorrowPrice() + book2.getBorrowPrice();

        User user = new User(4499, "Ahmed Dawood", 200);
        if(isBorrowable(book1) && isBorrowable(book2)) {
            if (user.getBalance() > totalPrice) {
                user.setBalance(user.getBalance() - totalPrice);
                book1.setQty(book1.getQty()-1);
                book2.setQty(book2.getQty()-1);
                books.add(book1);
                books.add(book2);

                System.out.println("hey," + user.getName());
                System.out.println("You just bought ["+ book1.getName() + ", " + book2.getName()+"]");
                System.out.println("You payed total amount of : " + totalPrice);
                System.out.println("Your remaining balance is : " + user.getBalance());
            }

        }

        return new Cart(2424, books);
    }


    boolean isBorrowable(Book book){
       if(book.getQty() <= 1)
           return false;
       return true;
    }

    boolean isExist(Book book){
        if(book.getQty() >= 1)
            return true;
        return false;
    }

}
