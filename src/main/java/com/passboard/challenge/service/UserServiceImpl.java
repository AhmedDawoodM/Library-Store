package com.passboard.challenge.service;

import com.passboard.challenge.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    BookServiceRestrictions bookServiceRestrictions;

    @Override
    public Cart buyCart(List<Book> books) {

        double totalPrice = 0;
        User user = new User(121212, "Mohamed Adel", 500);

        List<Book> booksRetrieved = bookServiceRestrictions.simulateDatabaseReturnCartBuyOrBorrow();
        for (Book book : booksRetrieved){
            if(bookServiceRestrictions.isExist(book)) {
                    book.setQty(book.getQty() - 1);
                    totalPrice += book.getBuyPrice();
                    books.add(book);
            }
        }
        if (user.getBalance() > totalPrice) {
            user.setBalance(user.getBalance() - totalPrice);
            System.out.println("hey," + user.getName());
            System.out.println("You just bought " );
            for (Book book : books)
                System.out.println("    [" + book.getName() + "] for " + book.getBuyPrice() + "$");
            System.out.println("You payed total amount of : " + totalPrice);
            System.out.println("Your remaining balance is : " + user.getBalance());

            return new Cart(1212, books);
        } else {
            return null;
        }

    }

    @Override
    public Cart borrowCart(List<Book> books) {

        double totalPrice = 0;
        User user = new User(104499, "Ahmed Dawood", 100);

        List<Book> booksRetrieved = bookServiceRestrictions.simulateDatabaseReturnCartBuyOrBorrow();
        for (Book book : booksRetrieved){
            if(bookServiceRestrictions.isExist(book)) {
                if(bookServiceRestrictions.isBorrowable(book)) {
                    book.setQty(book.getQty() - 1);
                    totalPrice += book.getBorrowPrice();
                    books.add(book);
                }
            }
        }
        if (user.getBalance() > totalPrice) {
            user.setBalance(user.getBalance() - totalPrice);
            System.out.println("hey," + user.getName());
            System.out.println("You just bought " );
            for (Book book : books)
                System.out.println("    [" + book.getName() + "] for " + book.getBorrowPrice() + "$");
            System.out.println("You payed total amount of : " + totalPrice);
            System.out.println("Your remaining balance is : " + user.getBalance());

            return new Cart(343434, books);
        } else {
            return null;
        }
    }

}
