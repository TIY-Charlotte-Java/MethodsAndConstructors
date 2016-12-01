package com.theironyard.charlotte;

/**
 * Created by Joe on 11/30/16.
 */
public class Dog {
    String name;
    String color;
    String breed;
    String gender;
    int age;

    public Dog(String dogName, String dogColor, String dogBreed, String dogGender, int dogAge) {
        name = dogName;
        color = dogColor;
        breed = dogBreed;
        gender = dogGender;
        age = dogAge;
    }
//getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getBreed() {
        return breed;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
//setters
    public void setName(String newName) {
        name = newName;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    public void setGender(String newGender) {
        gender = newGender;
    }
    public void setAge(int newAge) {
        if (age <= 15) {
            age = newAge;
        }
    }
}

