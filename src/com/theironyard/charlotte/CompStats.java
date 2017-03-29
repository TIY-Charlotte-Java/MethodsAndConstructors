package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 11/30/16.
 */
public class CompStats {
    double cpu;
    int ram;
    int hdd;
    String os;
    boolean intel;
    public CompStats(double cpu, int ram, int hdd, String os, boolean intel) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.intel = intel;
    }
    public double getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public int getHdd() {
        return hdd;
    }
    public String getOs() {
        return os;
    }
    public boolean isIntel() {
        return intel;
    }
    public void setRam(int newRam) {
        if (ram >= 4 && ram < 128) {
            ram = newRam;
        } else {
            System.out.println("Ram is invalid");
        }
    }
}
