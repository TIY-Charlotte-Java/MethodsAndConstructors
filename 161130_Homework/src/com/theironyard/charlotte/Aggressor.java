package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/30/16.
 */
public class Aggressor {
    private int numberOfFoes;
    private String whoIsIt;
    private int howDangerousAreThey;
    Boolean isItYouKnowWho;
    String spellOfChoice;
    String outcome;

    public Aggressor(String aggressorWhoIsIt, int aggressorHowDangerousAreThey, int aggressorNumberOfFoes) {
        whoIsIt = aggressorWhoIsIt;
        howDangerousAreThey = aggressorHowDangerousAreThey;
        numberOfFoes = aggressorNumberOfFoes;
    }
    //getter
    public int getNumberOfFoes() {
        return numberOfFoes;
    }
    //setter
    public void setNumberOfFoes(int newFoesHaveJoined) {
        if (newFoesHaveJoined> 0 && newFoesHaveJoined < 100) {
            numberOfFoes = newFoesHaveJoined;
        } else {
            System.out.println("NOPE");
        }
    }

    public void attackedHarry() {
        if (numberOfFoes <= 2) {
            outcome = "Harry wins";
        } else if (numberOfFoes > 2 ) {
            outcome = "Harry is in distress";
        }
    }
    public void wizardsDuel() {
        if (howDangerousAreThey <= 5) {
            outcome = "Harry can take 'em!";
        } else if (howDangerousAreThey >= 6){
            outcome = "Run away!";
        }
    }
    public void harryFights() {
        if (howDangerousAreThey < 5) {
            outcome = "Expelliarmus!";
        } else if (howDangerousAreThey >= 5) {
            outcome = "Stupefy!";
        }
    }
}
