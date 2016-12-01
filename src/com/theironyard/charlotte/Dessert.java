package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class Dessert {
    private String type;
    private String flavour;
    private int quantity;

    public Dessert(String dessertType, String dessertFlavour, int dessertQuanity) {
        type = dessertType;
        flavour = dessertFlavour;
        quantity = dessertQuanity;
    }

    public String getType() {
        return type;
    }

    public void setType(String dessertType) {
        type = dessertType;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String dessertFlaour) {
        flavour = dessertFlaour;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int dessertQuantity) {
        quantity = dessertQuantity;

    }

    void myDessert() {

        System.out.println("I like " + flavour + type + " " + "and I like to eat it " + quantity + " at a time");

        if (quantity > 1 && quantity < 2) {
            System.out.println("you have self control");
        } else {
            System.out.println("you like your dessert");
        }
    }
}
