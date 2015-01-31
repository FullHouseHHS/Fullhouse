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
public class Tournament {
    private int id;
    Location location;
    private String lAdress;
    private String lCity;
    String type;
    private double entryFee;
    Date date;

    public Tournament(int id, String type, double entryFee, Location location, Date date) {
        this.id = id;
        this.type = type;
        this.entryFee = entryFee;
        this.location = location;
        this.lAdress = location.getAddress();
        this.lCity = location.getCity();
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getEntreeFee() {
        return entryFee;
    }

    public void setEntreeFee(double entreeFee) {
        this.entryFee = entreeFee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return "" + type + "   " + entryFee + "   " + location.getAddress() + "   " + location.getCity() + "   " + date;
    }
    
    public String[] getInfo(){
        return new String[]{this.type, Double.toString(this.entryFee), this.lAdress, this.lCity, date.toString()};
    }
}
