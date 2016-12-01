package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        Person joe = new Person("Joe", "male", "Charlotte", 31);
        System.out.println(joe.getName());
        System.out.println(joe.getGender());
        System.out.println(joe.getLocation());
        System.out.println(joe.getage());

        Person jimmy = new Person("Jimmy", "male", "Raleigh", 37);
        System.out.println(jimmy.getName());
        System.out.println(jimmy.getage());
        System.out.println(jimmy.getGender());
        System.out.println(jimmy.getLocation());

        Dog foxy = new Dog("Foxy", "Brown","Corgi","female", 11);
        System.out.println(foxy.getName());
        System.out.println(foxy.getBreed());

        Cat darcy = new Cat("Darcy","Orange","Female","Calico", 2);
        System.out.println(darcy.getName());

        Car camry = new Car("Toyota", "Camry", "Silver", 2000);
        System.out.println(camry.getYear());

        Book hp = new Book("Harry Potter", "J.K. Rowling", "Purple", 1001);
        System.out.print(hp.getPages());
    }


}
