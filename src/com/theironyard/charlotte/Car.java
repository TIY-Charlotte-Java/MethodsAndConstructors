package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 11/30/16.
 */
public class Car {
    private String make;
    private int year;
    String color;
    boolean doesItStart;
    int mpg;



//public  Car(){

//}

public Car(String make, int year, String color,boolean doesItStart,int mpg) {


        this.make = make;
        this.year = year;
        this.color = color;
        this.doesItStart = doesItStart;
        this.mpg = mpg;
    }


    public String getMake() {
        return make;
    }

public void setMake(String make) {
        this.make = make;
        }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public boolean isDoesItStart() {
        return doesItStart;
    }

    public int getMpg() {
        return mpg;
    }



    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoesItStart(boolean doesItStart) {
        this.doesItStart = doesItStart;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
