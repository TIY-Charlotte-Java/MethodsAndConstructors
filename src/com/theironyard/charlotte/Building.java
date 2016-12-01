package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/30/16.
 */
public class Building {
    // Creates Variables that can be used to describe a building
    private int currentFloor;
    private int totalFloors;
    private String name;
    private String havcSystem;
    private String facade;
    private double length;
    private double width;
    private double height;

    //Constructors
    public Building(int currentFloor, int totalFloors, String buildingName, String climateControlSytsem, String buildingFacade, double length, double width, double height) {
        setCurrentFloor(currentFloor);
        setTotalFloors(totalFloors);
        setName(buildingName);
        setHavcSystem(climateControlSytsem);
        setFacade(buildingFacade);
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    //getters and setters

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        if(currentFloor > -1 && currentFloor < totalFloors){
            this.currentFloor = currentFloor;
        }
        else{
            System.out.println("This is an invalid floor number");
        }
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHavcSystem() {
        return havcSystem;
    }

    public void setHavcSystem(String havcSystem) {
        this.havcSystem = havcSystem;
    }

    public String getFacade() {
        return facade;
    }

    public void setFacade(String facade) {
        this.facade = facade;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //method to provide the volume of a building
    public double buildingVolume(){
        return CustomMath.VolumeCuboid(getLength(),getWidth(),getHeight());

    }

}
