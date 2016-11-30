package com.theironyard.charlotte;

public class Bank {
    //Fields
    double checkings;
    double savings;

    //Constructor
    public Bank(double checkings, double savings) {
        this.checkings = checkings;
        this.savings = savings;
    }

    //Getters and Setters
    public double getCheckings() {
        return checkings;
    }
    public void setCheckings(double checkings) {
        if (checkings >= 0) {
            this.checkings = checkings;
        } else {
            System.out.println("Error: Incorrect input or Overdraft Alert");
        }
    }
    public double getSavings() {
        return savings;
    }
    public void setSavings(double savings) {
        if (savings >= 0) {
            this.savings = savings;
        } else {
            System.out.println("Error: Incorrect input or Savings Depleted");
        }
    }

    // Method to find total amount in both accounts
    double totalAmount (Bank end) {

        //sets the checkings and savings accounts
        double check = this.checkings + end.checkings;
        double save = this.savings + end.savings;
        //sets the sum of the checkings and savings accounts
        double total = check + save;
        return total;
    }
}