package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class Car {
    String make;
    String model;
    int year;
    double cost;

    public Car(String carMake, String carModel, int carYear, double carCost) {
        make = carMake;
        model = carModel;
        year = carYear;
        cost = carCost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String carMake) {
        make = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public int getYear() {
        return year;

    }

    public void setYear(int carYear) {
        year = carYear;
        if (year < 2000) {
            System.out.println("you car is ancient ");
        } else if (year > 2000 && year < 20010) {
            System.out.println("your car is pretty new");
        } else {
            System.out.println("you have a sweet ride");
        }
    }

    public double getCost() {
        return cost;


    }


    public void setCost(int carCost) {
        cost = carCost;
    }


    public void myCar() {
        System.out.println("This is my dream car " + make + " " + model + " " + year + " " +
                "but the price is a killer  " + "$" + cost + " but you live once");

    }
}
