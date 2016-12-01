package com.theironyard.charlotte;

public class Book {
    //Fields
    private String author;
    private String title;
    private boolean fiction;
    private boolean hardCover;
    private double usCost;
    private double canadianCost;

    // Constructor
    public Book(String author, String title, boolean fiction, boolean hardcover, double usCost, double canadianCost) {
        this.author = author;
        this.title = title;
        this.fiction = fiction;
        this.hardCover = hardcover;
        this.usCost = usCost;
        this.canadianCost = canadianCost;
    }

    //Getters and Setters
    String getAuthor() {
        return this.author;
    }
    void setAuthor (String author) {
        this.author = author;
    }
    //
    String getTitle() {
        return this.title;
    }
    void setTitle (String title) {
        this.title = title;
    }
    //
    boolean getFiction() {
        return this.fiction;
    }
    void setFiction (boolean fiction) {
        this.fiction = fiction;
    }
    //
    boolean getHardCover() {
        return this.hardCover;
    }
    void setHardCover (boolean hardCover) {
        this.hardCover = hardCover;
    }
    //
    double getUsCost() {
        return this.usCost;
    }
    void setUsCost (double usCost) {
        if (usCost >= 0) {
            this.usCost = usCost;
        } else {
            System.out.println("Error: The book can't owe you money for purchasing it");
        }
    }
    //
    double getCanadianCosth() {
        return this.canadianCost;
    }
    void setCanadianCost (double canadianCost) {
        if (canadianCost >= 0) {
            this.canadianCost = canadianCost;
        } else {
            System.out.println("Error: The book can't owe you money for purchasing it");
        }
    }

    // Method Calculates book price after sales tax in the US
    double plusUsTax (Book cost) {
        double tax = 0.0475;
        double price = this.usCost + cost.usCost;
        double result =  price * tax;

        return (result + price)/2;
    }
    // Method Calculates book price after sales tax in Canada
    double plusCanTax (Book cost) {
        double tax = 0.13;
        double price = this.canadianCost + cost.canadianCost;
        double result =  price * tax;

        return (result + price)/2;
    }
}