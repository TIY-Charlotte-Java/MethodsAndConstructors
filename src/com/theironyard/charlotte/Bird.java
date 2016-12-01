package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class Bird {

    String type = "peacook";
    String color = "the colour speaks for itself";

    public Bird(String birdType, String birdColor) {
        this.type = birdType;
        this.color = birdColor;

    }

    public String getType() {
        return type;
    }

    public void setType(String birdType) {
        type = birdType;
    }

    public String getColor() {
        return color;


    }


    public void setColor(String birdColor) {
        color = birdColor;

        if (color == "white") {
            System.out.println("you like things simple");
        } else if (color == "black") {
            System.out.println("your world is a little dark -- add some color");

        } else {
            System.out.println("Your world is very bright");
        }
    }

    public void myBirdType() {

        System.out.println("I like " + type + " " + color);
    }
}
