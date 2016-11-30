package com.theironyard.charlotte;

public class CustomMath {
    //Fields
    private double radius;
    private double legA;
    private double legB;
    final double pi = 3.14;

    public CustomMath(double radius, double legA, double legB) {
        this.radius = radius;
        this.legA = legA;
        this.legB = legB;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLegA() {
        return legA;
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public double getLegB() {
        return legB;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

    public double findCircleArea (double radius) {
        double area;
        radius *= radius;
        area = pi * radius;
        return area;
    }

    public double findHypotenuse (double legA, double legB) {
        double hypotenuse;
        legA *= legA;
        legB *= legB;
        hypotenuse = legA + legB;
        return hypotenuse;
    }
}


