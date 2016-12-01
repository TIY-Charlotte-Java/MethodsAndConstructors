package com.theironyard.charlotte;

/**
 * Created by Joe on 11/30/16.
*/
public class Car {
    String make;
    String model;
    String color;
    int year;

    public Car(String carMake, String carModel, String carColor, int carYear){
    make = carMake;
    model = carModel;
    color = carColor;
    year = carYear;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    //setters
    public void setMake(String newMake) {
        make = newMake;
    }
    public void setModel(String newModel) {
        model = newModel;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setYear(int newYear) {
        if(year >= 1905 || year <= 2017)
            year = newYear;
    }
}

