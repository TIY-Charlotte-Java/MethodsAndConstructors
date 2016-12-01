package com.theironyard.charlotte;

/**
 * Created by Joe on 11/30/16.
*/
public class Cat {
    String name;
    String color;
    String gender;
    String breed;
    int age;

    public Cat(String catName, String catColor, String catGender, String catBreed, int catAge) {
    name = catName;
    color = catColor;
    gender = catGender;
    breed = catBreed;
    age = catAge;
    }
//getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public String getBreed() {
        return breed;
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
    public void setGender(String newGender) {
        gender = newGender;
    }
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    public void setAge(int newAge) {
        if(age <= 18);
        age = newAge;
    }
}
