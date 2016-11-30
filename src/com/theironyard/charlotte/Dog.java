package com.theironyard.charlotte;

/**
 * Created by Ben on 11/30/16.
 */
public class Dog {
    String breed;
    String name;
    int age;
    int weight;
    boolean isRegistered;

    public Dog(String breed, String name, int age, int weight, boolean isRegistered) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isRegistered = isRegistered;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        if (name == "Spike") {
            System.out.println("You suck at picking names");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
