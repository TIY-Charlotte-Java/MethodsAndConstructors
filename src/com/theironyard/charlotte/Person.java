package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Person {

    //Establish vars that describe person - all set private so they aren't tampered with
    private String name;
    private int age;
    private int hairLength;
    private String hairColor;
    private String eyeColor;
    private String sex;
    private final static int requiredHair = 15;

    // Establish constructors for this class and assigning values for the object being created.
    public Person(String name, int age, int hairLength, String hairColor, String eyeColor, String sex) {
        setName(name);
        setAge(age);
        setHairLength(hairLength);
        setHairColor(hairColor);
        setEyeColor(eyeColor);
        setSex(sex);
    }

    //Create Getters and Setters for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        if (hairLength > 0){
            this.hairLength = hairLength;
        }
        else {
            System.out.println("Hair Length should be a positive number");
        }
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static int getRequiredHair() {
        return requiredHair;
    }

    //Defines a method for randomly reassigning a new age 75% of the time to a person once they during the age potion
    public void drinkAgePotion() {
        if (Math.random() >= 0.25) {
            age = (int) Math.floor(Math.random() * 101);
            System.out.println(name + " drank the age potion. Their new age is " + age);

        } else {
            System.out.println(name + " didn't drink the age potion. Their age is " + age);
        }
    }

    //Defines a method for combining hair length so we can later check if we have enough to make a rug.
    //Use an if statement to make sure that the other is not null when it is brought in so we don't
    //get a null no pointer exception
    int combinedHairLength(Person other) {
        if (other != null) {
            if (hairLength == 0 || other.hairLength == 0) {
                System.out.println("All hair lengths must be greater than zero.");
                return this.hairLength + other.hairLength;
            }
                else if (this.hairLength + other.hairLength < requiredHair){
                    System.out.println("There is not enough hair to make a rug :-(");
                    return this.hairLength + other.hairLength;
                }
                else if (this.hairLength + other.hairLength >= requiredHair) {
                    System.out.println("Yay you have enough enough hair to make a rug!");
                    return this.hairLength + other.hairLength;
                }
                else{
                    System.out.println("Weird, something weird happened.");
                    return this.hairLength;
                }
        }
        else {
            return this.hairLength;
        }
    }

    //Defines a method to measure the length difference between the names final name(other) minus initial name (this)
    int nameDiff(Person other) {
        if (other != null) {
            return (Math.abs(other.name.length() - this.name.length()));
        } else {
            return this.name.length();
        }
    }
}