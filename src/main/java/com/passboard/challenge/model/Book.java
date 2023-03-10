package com.passboard.challenge.model;

public class Book {

    long id;
    String name;
    Category category;
    Author author;
    String description;
    int qty;
    double buyPrice;
    double borrowPrice;
    boolean borrowable;

    public Book() {
    }

    public Book(long id, String name, Author author, int qty, boolean borrowable) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
        this.borrowable = borrowable;

    }

    public Book(long id, String name,
                Category category,
                Author author,
                String description,
                int qty,
                double buyPrice,
                double borrowPrice,
                boolean borrowable) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.description = description;
        this.qty = qty;
        this.buyPrice = buyPrice;
        this.borrowPrice = borrowPrice;
        this.borrowable = borrowable;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getBorrowPrice() {
        return borrowPrice;
    }

    public void setBorrowPrice(double borrowPrice) {
        this.borrowPrice = borrowPrice;
    }

    public boolean getBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }
}
