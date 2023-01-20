package com.passboard.challenge.service;

import com.passboard.challenge.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Override
    public Cart checkoutCart(List<Book> books) {

        double totalPrice = 0;
        User user = new User(121212, "Mohamed Adel", 500);

        List<Book> booksRetrieved = simulateDatabaseReturnList();
        for (Book book : booksRetrieved){
            if(isExist(book)) {
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

        List<Book> booksRetrieved = simulateDatabaseReturnList();
        for (Book book : booksRetrieved){
            if(isExist(book)) {
                book.setQty(book.getQty() - 1);
                totalPrice += book.getBorrowPrice();
                books.add(book);
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

    private List<Book> simulateDatabaseReturnList(){
        List<Book> books = new ArrayList<>();
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

        books.add(book1);
        books.add(book2);

        return books;
    }


    private boolean isBorrowable(Book book){
       if(book.getQty() <= 1)
           return false;
       return true;
    }



    private boolean isExist(Book book){
        if(book.getQty() >= 1)
            return true;
        return false;
    }

}
