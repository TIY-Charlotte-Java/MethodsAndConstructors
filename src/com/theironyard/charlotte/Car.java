package com.theironyard.charlotte;

public class Car {
    //Fields
    private String make;
    private String model;
    private String type;
    private String color;
    private int year;
    private double price;
    private double apr;
    //Constructor
    public Car(String make, String model, String type, String color, int year, double price, double apr) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.price = price;
        this.apr = apr;
    }
    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }
    // Method to calculate monthly payments
    double monthlyPayments (Car cost) {

        double payment = cost.price;
        double portion = cost.apr;
        payment = (payment / 36);
        payment = payment / portion;

        return payment;
    }


}