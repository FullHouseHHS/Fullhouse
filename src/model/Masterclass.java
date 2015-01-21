/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author CVD
 */
public class Masterclass {
    private int minRating;
    private int maxParticipants;
    Player lecturer;
    
    ArrayList<Player> playerList;
    
    public Masterclass(Player lecturer, int maxParticipants, int minRating, ArrayList<Player> playerList){
        this.lecturer = lecturer;
        this.maxParticipants = maxParticipants;
        this.minRating = minRating;
        this.playerList = playerList;
    }

    public int getMinRating() {
        return minRating;
    }

    public void setMinRating(int minRating) {
        this.minRating = minRating;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Player getLecturer() {
        return lecturer;
    }

    public void setLecturer(Player lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }
    
}
