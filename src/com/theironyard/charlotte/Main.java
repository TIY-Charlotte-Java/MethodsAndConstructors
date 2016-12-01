package com.theironyard.charlotte;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Person me = new Person("Emileen", "me", 35);
        me.myInfo();
        System.out.println();
        me.setAge(55);
        me.myInfo();
        System.out.println();

        Dessert myTreat = new Dessert("cake", "chocolate", 1);
        myTreat.myDessert();
        System.out.println();

        Dance myDance = new Dance("classical", "fast", "tamil");
        myDance.loveToDance(myDance);
        myDance.setPace("fast");
        System.out.println();

        Car myCar = new Car("BMW", "i8", 2017, 140000);
        myCar.myCar();
        myCar.setYear(2013);
        System.out.println();
        myCar.setCost(100000);
        System.out.println("the cost of your car after taxes is " + myCar.getCost());



        Bird myBird = new Bird("penguine", "black and white ");
        myBird.myBirdType();
        myBird.setColor("black");
        System.out.println();

        System.out.println("This calculates the area of the circle");

        CustomMath radius = new CustomMath();
        double area;
        area = radius.circleArea(3);
        System.out.println(area);

        System.out.println();
        System.out.println("This calculates the hypotenesu");
        double length;
        length = radius.hypotensue(5.00, 12.00);
        System.out.println(length);


    }
}





