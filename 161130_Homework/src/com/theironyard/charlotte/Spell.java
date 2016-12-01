package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/30/16.
 */
public class Spell {
    private String type;
    int timesHit;
    String defense;
    Boolean deadly;
    private int threatLevel;
    String outcome;
    int levelOfInjury;

    public Spell (String spellType, int spellThreatLevel) {
        type = spellType;
        threatLevel = spellThreatLevel;
    }
    //getter
    public int getThreatLevel() {
        return threatLevel;
    }
    //setter
    public void setNewThreatLevel(int newThreatLevel) {
        if (newThreatLevel > 0 && newThreatLevel <= 10) {
            threatLevel = newThreatLevel;
        } else {
            System.out.println("No spell could be that powerful!");
        }
    }
    public void spellCast() {
        if (threatLevel < 8) {
            outcome = "Success!";
        } else if (threatLevel >= 8) {
            outcome = "You died :(";
        }
    }
    public void counterCurse() {
        if (threatLevel >= 5) {
            outcome = "protego!";
        } else if (threatLevel < 5) {
            outcome = "expelliarmus!";
        }
    }
    public void iveBeenHit() {
        if (levelOfInjury >= 3) {
            outcome = "To the hospital wing!";
        } else if (levelOfInjury < 3) {
            outcome = "eh, you'll be okay";
        }
    }
}