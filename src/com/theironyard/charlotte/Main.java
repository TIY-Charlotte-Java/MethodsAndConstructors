package com.theironyard.charlotte;

public class Main {
    public static void main(String[] args) {
        //Object Creators
        Book bookOne = new Book("Dr. Suess", "The Cat In The Hat", true, false, 7.99, 14.99);
        Bank acctOne = new Bank(40.0, 60.0);
        Bank acctTwo = new Bank(10.0, 90.0);
        Card cardOne = new Card("Kayla", "Sam", "Happy Hannukah!", true, false, 7.99);
        Card cardTwo = new Card( "Mom", "Son", "Hope you feel better soon!", false, true, 5.99);
        Card cardThree = new Card("Tom", "Mom", "We Rhyme", false, false, 50.99);
        Car carOne = new Car("Honda", "Accord", "Sedan", "Black", 2007, 25000.00, 13.0);
        Car carTwo = new Car("Acura", "NSX", "Sports", "Red", 2014, 50000.00,  13.0);
        Shoe shoeOne = new Shoe(12, 79.99, "Nike", "SoccerCleats", false);

        /**
         *
         * Old Style before Constructors and Getters and Setters
         *
         ** acctOne.checkings = 40.0;
         * acctOne.savings = 60.0;
         * acctTwo.checkings = 10.0;
         * acctTwo.savings = 90.0;
         ** bookOne.author = "Dr. Suess";
         * bookOne.title = "The Cat In The Hat";
         * bookOne.fiction = true;
         * bookOne.hardCover = true;
         * bookOne.usCost = 7.99;
         * bookOne.canadianCost = 14.99;
         ** cardOne.nameTo = "Kayla";
         * cardOne.nameFrom = "Sam";
         * cardOne.contents = "Happy Hannukah";
         * cardOne.holidayCard = true;
         * cardOne.wellCard = false;
         * cardOne.price = 7.99;
         * cardTwo.nameTo = "Mom";
         * cardTwo.nameFrom = "Son";
         * cardTwo.contents = "Hope you feel better soon! Sending my love.";
         * cardTwo.holidayCard = false;
         * cardTwo.wellCard = true;
         * cardTwo.price = 5.99;
         * cardThree.holidayCard = true;
         * cardThree.wellCard = true;
         ** carOne.make = "Honda";
         * carOne.model = "Accord";
         * carOne.type = "Sedan";
         * carOne.color = "Black";
         * carOne.year = 2014;
         * carOne.price = 25000;
         * carOne.apr = 13;
         * carTwo.make = "Acura";
         * carTwo.model = "NSX";
         * carTwo.type = "Sports";
         * carTwo.color = "Red";
         * carTwo.year = 2012;
         * carTwo.price = 50000;
         * carTwo.apr = 13;
         ** shoeOne.brand = "Nike";
         * shoeOne.type = "Soccer Cleats";
         * shoeOne.size = 12;
         * shoeOne.price = 79.99;
         * shoeOne.velcro = false;
         */
        //Console Print outs
        System.out.println("The amount contained in checkings account One is: " + acctOne.getCheckings());
        System.out.println("The amount contained in savings account One is: " + acctOne.getSavings());
        System.out.println("The amount contained in checkings account Two is: " + acctTwo.getCheckings());
        System.out.println("The amount contained in savings account Two is: " + acctOne.getSavings());
        System.out.println("The total amount in both accounts: " + acctOne.totalAmount(acctTwo));
        System.out.println("\nName of the author is: " + bookOne.getAuthor());
        System.out.println("The title of the book is: " + bookOne.getTitle());
        System.out.println("The book is fiction: " + bookOne.getFiction());
        System.out.println("The book is hardcover: " + bookOne.getHardCover());
        System.out.println("The book costs: " + bookOne.getUsCost() + " US Currency");
        System.out.println("The book costs: " + bookOne.getCanadianCosth() + " Canadian Currency");
        System.out.println("The book cost in the US after sales tax is: " + bookOne.plusUsTax(bookOne));
        System.out.println("The book cost in Canada after sales tax is: " + bookOne.plusCanTax(bookOne));
        System.out.println("\nThe size of this holiday card is: " +cardOne.findDimension(cardOne));
        System.out.println("The size of this get well card is: " +cardOne.findDimension(cardTwo));
        System.out.println("The size of this random card is: " +cardOne.findDimension(cardThree));
        System.out.println("\nThe monthly payments for " + carTwo.getMake() + " " + carTwo.getModel() + " is: " + carTwo.monthlyPayments(carTwo));
        System.out.println("Testing all get methods: " + shoeOne.getBrand() + " " + shoeOne.getType() + " " + shoeOne.getPrice() + " " + shoeOne.getSize() + " " + shoeOne.isVelcro());
        }
}