package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class CustomMath {

    //Static method that takes in a radius and returns the area of a circle
    static double AreaCircle(double radius){
        return Math.PI*(Math.pow(radius,2));
    }

    //Static method that takes in sides a and b of a right triangle and returns c the hypotenuse
    static double Hypotenuse(double sideA, double sideB ){
        return Math.sqrt((Math.pow(sideA,2)+Math.pow(sideB,2)));
    }

    //Static method that takes in the length width and height of a cuboid.
    static double VolumeCuboid(double length, double width, double height){
        return length * width * height;
    }

}
