package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Food {
    //Establish vars that describe food
    private String ethnicity;
    private boolean fingerFood;
    private int calorieCount;
    private int customerReview;
    private int spiceLevel;

    // Establish constructors for this class and assigning values for the object being created.
    public Food(String ethnicity, boolean fingerFood, int calorieCount, int customerReview, int spiceLevel) {
        setEthnicity(ethnicity);
        setFingerFood(fingerFood);
        setCalorieCount(calorieCount);
        setConstomerReview(customerReview);
    }

    //Establish getters and setters
    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public boolean isFingerFood() {
        return fingerFood;
    }

    public void setFingerFood(boolean fingerFood) {
        this.fingerFood = fingerFood;
    }

    public int getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }

    public int getConstomerReview() {
        return customerReview;
    }

    public void setConstomerReview(int customerReview) {
        this.customerReview = customerReview;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        if (spiceLevel < 5 && spiceLevel > 0){
            this.spiceLevel = spiceLevel;
        }
        else{
            System.out.println("The requested spice level exists outside of our Five Star system.");
        }
    }

    //Begin Methods




}


