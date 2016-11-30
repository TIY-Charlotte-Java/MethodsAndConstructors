package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Main {

    public static void main(String[] args) {

        // Create two new people
        Person aStudent= new Person("Wendy Herman",16,15, "blue","green", "Female");
        Person bStudent = new Person("Sandy Pants",47,17,"blue","red","male");

        //Each students choice and being effected by the Age potion method
        System.out.println(aStudent.getName()+" original age "+aStudent.getAge());
        aStudent.drinkAgePotion();
        System.out.println(bStudent.getName()+" original age "+bStudent.getAge());
        bStudent.drinkAgePotion();
        //applying the combined hair length method to determine if we can make a rug
        System.out.println(aStudent.getName() + " and " + bStudent.getName() + " have " + aStudent.combinedHairLength(bStudent) + " combined inches of hair!");

        CustomMath.Area(9.45);








    }


}
