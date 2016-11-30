package com.theironyard.charlotte;

/**
 * Created by Ben on 11/30/16.
 */
public class Cellphone {
    String brand;
    String carrier;
    double screenSize;
    double price;
    boolean hasSIMCard;

    public Cellphone(String brand, String carrier, double screenSize, double price, boolean hasSIMCard) {
        this.brand = brand;
        this.carrier = carrier;
        this.screenSize = screenSize;
        this.price = price;
        this.hasSIMCard = hasSIMCard;
    }

    public String getBrand() {
        return brand;
    }

    public String getCarrier() {
        return carrier;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasSIMCard() {
        return hasSIMCard;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize > 0 && screenSize <= 6.0) {
            this.screenSize = screenSize;
        } else {
            System.out.println("That's not a phone");
        }
    }

    public void setPrice(double price) {
        if (price <= 200) {
            this.price = price;
        } else {
            System.out.println("You Paid too damn much");
        }
    }

    public void setHasSIMCard(boolean hasSIMCard) {
        this.hasSIMCard = hasSIMCard;
    }
}
