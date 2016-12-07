package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 11/30/16.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;

    public Person() {
    }

    public Person(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int newAge) {
        if (age > 0 && age < 130) {
            age = newAge;

            if (true) {

            } else {

            }
        } else {
            System.out.println("B.S. not my initials but bullshit. oh yeah invalid age.");
        }
    }

    public static boolean isValidName(String input) {
        return input.contains(" ");
    }
}