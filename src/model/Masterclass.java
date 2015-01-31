/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import utilities.databaseUtil.DateUtil;

/**
 *
 * @author CVD
 */
public class Masterclass {
    private int id;
    private String hostName;
    private double minRating;
    private int maxEntries;
    private String lAdress;
    private String lCity;
    Player host;
    Location location;
    Date date;

    public Masterclass(int id, Player host, int maxEntries, double minRating, Location location, Date date){
        this.id = id;
        this.host = host;
        this.hostName = host.getFirstName() + " " + host.getLastName();
        this.maxEntries = maxEntries;
        this.minRating = minRating;
        this.location = location;
        this.lAdress = location.getAddress();
        this.lCity = location.getCity();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "" + id + "   " + host + "   " + maxEntries + "   " + minRating + "   " + location.getAddress()+  "   " + location.getCity() + "   " + date;
    }
    public String[] getInfo(){
        return new String[]{this.hostName, Integer.toString(this.maxEntries), Double.toString(this.minRating), this.lAdress, this.lCity, DateUtil.fromUtilDateToString(this.date)};
    }
}
