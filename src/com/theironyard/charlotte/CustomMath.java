package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class CustomMath {


    public double circleArea(double a) {
        double area=0.00;
        area = Math.PI*(a*a);
        return area;
    }

    public double hypotensue(double lengthOne, double lengthTwo) {
        double length;
        //length = Math.sqrt((Math.pow()) + (Math.pow()));
        length = Math.sqrt((lengthOne*lengthOne) + (lengthTwo*lengthTwo));
        return length;
    }
}
