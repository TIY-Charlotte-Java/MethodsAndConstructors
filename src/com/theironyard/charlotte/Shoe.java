package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Shoe {
    //establish variable that will describe a shoe
    //make read only static field exist
    private final static boolean exist = true;
    private boolean exposedToe;
    private boolean closedHeel;
    private String closureType;
    private double heelHeight;

    //Constructor missing the boolean exist because it is already initialized within this class and is final.
    public Shoe(boolean exposedToe, boolean closedHeel, String closureType, double heelHeight) {
        setExposedToe(exposedToe);
        setClosedHeel(closedHeel);
        setClosureType(closureType);
        setHeelHeight(heelHeight);
    }

    //Establish getters and setters
    public boolean isExist() {
        return exist;
    }

    public boolean isExposedToe() {
        return exposedToe;
    }

    public void setExposedToe(boolean exposedToe) {
        this.exposedToe = exposedToe;
    }

    public boolean isClosedHeel() {
        return closedHeel;
    }

    public void setClosedHeel(boolean closedHeel) {
        this.closedHeel = closedHeel;
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    public double getHeelHeight() {
        return heelHeight;
    }

    public void setHeelHeight(double heelHeight) {
        if (heelHeight > 4) {
            System.out.println("This heel height exceeds safety measures");
        }
        else if (heelHeight < 0){
            System.out.println("This is a value below zero");
        }
        else {
            this.heelHeight = heelHeight;
        }
    }
}