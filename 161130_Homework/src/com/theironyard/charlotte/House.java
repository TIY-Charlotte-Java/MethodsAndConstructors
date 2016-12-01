package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/30/16.
 */
public class House {
    private String houseName;
    private int numberOfStudents;
    int numberOfRooms;
    String houseColor;
    String headOfHouse;
    String outcome;

    public House (String houseHouseName, int houseNumberOfStudents) {
        houseName = houseHouseName;
        numberOfStudents = houseNumberOfStudents;
    }
    //getter
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    //setter
    public void setNumberOfStudents(int newNumberOfStudents) {
        if (newNumberOfStudents > 0 && newNumberOfStudents< 20) {
            numberOfStudents = newNumberOfStudents;
        } else {
            System.out.println("We can't fit that many kids in the dormitory!");
        }
    }
    public void newYear() {
        numberOfStudents++;
    }
    public void houseCup() {
        if (Math.random() >= .50) {
            outcome = "Gryffindor wins!";
        } else if(Math.random()< .50){
            outcome = "Oh no, Slytherin wins!";
        }
    }
    public void expandingCharm() {
        numberOfRooms++;
    }
}
