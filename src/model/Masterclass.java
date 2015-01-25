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
    private double minRating;
    private int maxEntries;
    Player host;
    Location location;

    public Masterclass(int m_id, Player host, int maxEntries, double minRating, Location location){
        this.m_id = m_id;
        this.host = host;
        this.maxEntries = maxEntries;
        this.minRating = minRating;
        this.location = location;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }
    
    public int getId(){
        return m_id;
    }

    public double getMinRating() {
        return minRating;
    }

    public void setMinRating(double minRating) {
        this.minRating = minRating;
    }

    public int getMaxParticipants() {
        return maxEntries;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxEntries = maxParticipants;
    }

    public Player getHost() {
        return host;
    }

    public void setHost(Player host) {
        this.host = host;
    }
    
    @Override
    public String toString(){
        return "" + m_id + "   " + host + "   " + minRating + "   " + maxEntries + "   ";
    }
}
