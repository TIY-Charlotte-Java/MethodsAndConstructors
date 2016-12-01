package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Main {

    public static void main(String[] args) {

        //ITEMS WORKING WITH THE PERSON CLASS
        // Create two new people
        Person aStudent = new Person("Wendy Herman",16,8, "blue","green", "Female");
        Person bStudent = new Person("Sandy Pants",47,17,"blue","red","male");

        //Each students choice and being effected by the Age potion method
        System.out.println(aStudent.getName()+" original age "+aStudent.getAge());
        aStudent.drinkAgePotion();
        System.out.println(bStudent.getName()+" original age "+bStudent.getAge());
        bStudent.drinkAgePotion();

        //applying the combined hair length method to determine if we can make a rug
        System.out.println(aStudent.combinedHairLength(bStudent) + " inches.");

        //checking out the length difference between student names
        System.out.println("The length difference between student names is: " + aStudent.nameDiff(bStudent));

        //ITEMS WORKING WITH THE BUILDING CLASS
        Building packardPlace = new Building(-1,13,"Packard Place", "Polar Ice Caps","Metal", 8,8,8);

        System.out.println("The volume of your building is: " + packardPlace.buildingVolume());

        //ITEMS WORKING WITH THE CUSTOM MATH CLASS
        // output the area of a circle
        System.out.println("the area of the circle is " + CustomMath.AreaCircle(10));

        // output the hypotenuse of a triangle.
        System.out.println("The hypotenuse of your triangle is " + CustomMath.Hypotenuse(3,4));
    }


}
