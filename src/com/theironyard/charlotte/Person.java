package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int Age;

    public Person (String personFirstName, String personLastName, int personAge) {
        firstName = personFirstName;
        lastName = personLastName;
        Age = personAge;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String yourLastName) {
        lastName = yourLastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int yourAge) {
        if (Age>0 && Age<130) {
            Age = yourAge;

        }else{
            System.out.println("provide your correct age");
        }

    }

    public void myInfo() {

        System.out.println("My Name is: " + firstName + " " + lastName + " and I am " + Age);

        if (Age < 30) {
            System.out.println("you are young");
        } else if (Age >= 30 || Age <= 50) {
            System.out.println("you are wise!!!");
        } else if (Age > 50) {
            System.out.println("you are the wisest");
        } else {
            System.out.println("you are old -- :)");
        }
    }

}
