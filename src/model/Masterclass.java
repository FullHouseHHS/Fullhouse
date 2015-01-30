/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

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
    Date date;

    public Masterclass(int m_id, Player host, int maxEntries, double minRating, Location location, Date date){
        this.m_id = m_id;
        this.host = host;
        this.maxEntries = maxEntries;
        this.minRating = minRating;
        this.location = location;
        this.date = date;
    }

    public int getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public double getMinRating() {
        return minRating;
    }

    public void setMinRating(double minRating) {
        this.minRating = minRating;
    }

    public Player getHost() {
        return host;
    }

    public void setHost(Player host) {
        this.host = host;
    }
    
    @Override
    public String toString(){
        return "" + m_id + "   " + host + "   " + maxEntries + "   " + minRating + "   " + location.getAddress()+  "   " + location.getCity() + "   " + date;
    }
}
