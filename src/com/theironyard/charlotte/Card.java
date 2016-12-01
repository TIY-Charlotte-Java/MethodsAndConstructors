package com.theironyard.charlotte;

public class Card {
    //Fields
    private String nameTo;
    private String nameFrom;
    private String contents;
    private boolean holidayCard;
    private boolean wellCard;
    private double price;

    //Constructor
    public Card(String nameTo, String nameFrom, String contents, boolean holidayCard, boolean wellCard, double price) {
        this.nameTo = nameTo;
        this.nameFrom = nameFrom;
        this.contents = contents;
        this.holidayCard = holidayCard;
        this.wellCard = wellCard;
        this.price = price;
    }

    // Getters and Setters
    public String getNameTo() {
        return nameTo;
    }

    public void setNameTo(String nameTo) {
        this.nameTo = nameTo;
    }

    public String getNameFrom() {
        return nameFrom;
    }

    public void setNameFrom(String nameFrom) {
        this.nameFrom = nameFrom;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        if (contents.equals("")) {
            System.out.println("Error: No Contents in this Card");
        } else {
            this.contents = contents;
        }
    }
    public boolean isHolidayCard() {
        return holidayCard;
    }
    public void setHolidayCard(boolean holidayCard) {
        this.holidayCard = holidayCard;
    }
    public boolean isWellCard() {
        return wellCard;
    }
    public void setWellCard(boolean wellCard) {
        this.wellCard = wellCard;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Boolean method to express size of card.
    String findDimension (Card type) {

        String sizeOne = "9x9";
        String sizeTwo = "8x10";
        String errorMessage = "Size not found";
        boolean holCheck = type.holidayCard;
        boolean wellCheck = type.wellCard;
        if (holCheck == true && wellCheck == false) {
            return sizeOne;
        } else if (wellCheck == true && holCheck == false) {
            return sizeTwo;
        } else {
            return errorMessage;
        }
    }
}