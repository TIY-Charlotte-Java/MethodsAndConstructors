package com.theironyard.charlotte;

public class Shoe {

    private int size;
    private double price;
    private String brand;
    private String type;
    private boolean velcro;

    public Shoe(int size, double price, String brand, String type, boolean velcro) {
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.type = type;
        this.velcro = velcro;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVelcro() {
        return velcro;
    }

    public void setVelcro(boolean velcro) {
        this.velcro = velcro;
    }
}