package com.theironyard.charlotte;

/**
 * Created by stephenwilliamson on 11/30/16.
 */
public class Movie {
    String direct;
    String title;
    int year;
    boolean wonOscar;
    boolean haveSeenIt;

    public Movie(String direct, String title, int year, boolean wonOscar, boolean haveSeenIt) {
        this.direct = direct;
        this.title = title;
        this.year = year;
        this.wonOscar = wonOscar;
        this.haveSeenIt = haveSeenIt;
    }
}