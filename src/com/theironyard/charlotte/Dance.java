package com.theironyard.charlotte;

/**
 * Created by loydcharles on 11/30/16.
 */
public class Dance {
    String type;
    String pace;
    String music;

    public Dance(String danceType, String dancePace, String danceMusic) {
        type = danceType;
        pace = dancePace;
        music = danceMusic;

    }

    public String getType() {
        return type;
    }

    public void setType(String danceType) {
        type = danceType;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String dancePace) {
        pace = dancePace;

        if (pace == "fast") {
            System.out.println("you like to move it");
        } else {
            System.out.println("slow gives you time to enjoy the music");
        }

    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String danceMusic) {
        pace = danceMusic;
    }

    public void loveToDance(Dance info) {
        System.out.println("I love to Dance to  " + info.music + " " + info.type + " music " + " with a "
                + info.pace + " beat ");

    }
}
