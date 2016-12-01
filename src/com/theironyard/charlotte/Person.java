package com.theironyard.charlotte;

/**
 * Created by Joe on 11/30/16.
 */
public class Person {
    String name;
    String gender;
    String location;
    int age;

    public Person(String personName, String personGender, String personLocation, int personAge) {
    name = personName;
    gender = personGender;
    location = personLocation;
    age = personAge;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getLocation() {
        return location;
    }
    public int getage() {
        return age;
    }
    //setters
    public void setName(String newName) {
        name = newName;
    }
    public void setGender(String newGender) {
        gender = newGender;
    }
    public void setLocation(String newLocation) {
        location = newLocation;
    }
    public void setAge(int newAge) {
        if (age > 0 && age < 117) {
            age = newAge;
        }
    }
}

