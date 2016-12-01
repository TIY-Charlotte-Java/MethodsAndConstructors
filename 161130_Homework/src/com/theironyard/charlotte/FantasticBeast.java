package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/30/16.
 */
public class FantasticBeast {
    private String type;
    int numberOfLegs;
    private int numberOfHeads;
    String color;
    private int threatLevel;
    String outcome;

    public FantasticBeast ( String beastType, int beastThreatLevel, int beastNumberOfHeads) {
        type = beastType;
        threatLevel = beastThreatLevel;
        numberOfHeads = beastNumberOfHeads;
    }
    //getter
    public int getNumberOfHeads() {
        return numberOfHeads;
    }
    //setter
    public void setNumberOfHeads(int newNumberOfHeads) {
        if (newNumberOfHeads > 0 && newNumberOfHeads <= 10) {
            this.numberOfHeads = newNumberOfHeads;
        } else {
            System.out.println("that is far too many heads");
        }
    }
    public void beastIsProvoked() {
        if (threatLevel < 5) {
            outcome = "Easy, Buckbeak";
        } else if (threatLevel >= 5) {
            outcome = "*attack with giant talons*";
        }
    }
    public void cutOffHead() {
        numberOfHeads++;
    }
    public void humanOrCentaur() {
        if (numberOfLegs <= 2) {
            outcome = "He's a human!";
        } else if (numberOfLegs > 2);
        outcome = "He's a centaur!";
    }
}
