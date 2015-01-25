/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CVD
 */
public class Masterclass {
    private int m_id;
    private int minRating;
    private int maxParticipants;
    Player lecturer;
    
    public Masterclass(int m_id, Player lecturer, int maxParticipants, int minRating){
        this.m_id = m_id;
        this.lecturer = lecturer;
        this.maxParticipants = maxParticipants;
        this.minRating = minRating;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
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

    @Override
    public String toString(){
        return "" + m_id + "   " + lecturer + "   " + minRating + "   " + maxParticipants + "   ";
    }
}
