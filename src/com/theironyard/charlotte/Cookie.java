package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 11/30/16.
 */
public class Cookie {
    String ingredient;
    int amount;
    String mixOrder;
    int time;
    int temp;


public Cookie(String ingredient, int amount, String mixOrder,int time, int temp) {


        this.ingredient = ingredient;
        this.amount = amount;
        this.mixOrder = mixOrder;
        this.time = time;
        this.temp = temp;
    }


    public String getIngredient() {
        return ingredient;
    }

    public int getAmount() {
        return amount;
    }

    public String getMixOrder() {
        return mixOrder;
    }

    public int getTime() {
        return time;
    }

    public int getTemp() {
        return temp;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMixOrder(String mixOrder) {
        this.mixOrder = mixOrder;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

