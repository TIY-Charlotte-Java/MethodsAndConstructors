package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/30/16.
 */
public class Character {
    private String name;
    String house;
    private int age;
    int year;
    private Boolean isWizard;
    String outcome;

    public Character (String characterName, int characterAge, Boolean characterIsWizard){
        name = characterName;
        age = characterAge;
        isWizard = characterIsWizard;
    }
    //getter
    public int getAge() {
        return age;
    }
    //setter
    public void setAge (int newAge) {
        if (newAge > 0 && newAge <= 130) {
            age = newAge;
        } else {
            System.out.println ("I thought they destroyed the Sorcerer's Stone?");
        }
    }
    public void hadBirthday() {
        age++;
    }
    public void sortingHat() {
        if (Math.random() >= .75) {
            outcome = "Gryffindor!";
        } else if (Math.random() >= .50) {
            outcome = "Ravenclaw!";
        } else if (Math.random() >= .25) {
            outcome = "Hufflepuff!";
        } else if (Math.random() < .25) {
            outcome = "Slytherin!";
        }
    }
    public void owls() {
        year++;
    }
}
