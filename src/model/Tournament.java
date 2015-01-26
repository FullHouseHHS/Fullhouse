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
    private int toId;
    Location location;
    String type;
    private double entryFee;
    Date date;

    public Tournament(int toId, String type, double entryFee, Location location, Date date) {
        this.toId = toId;
        this.type = type;
        this.entryFee = entryFee;
        this.location = location;
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

    public int getToId() {
        return toId;
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
    
    public int getTournamentId() {
        return toId;
    }

    public void setTournamentId(int tournamentId) {
        this.toId = tournamentId;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return "" + toId + "   " + type + "   " + entryFee + "   " + location.getAddress() + "   " + location.getCity() + "   " + date;
    }
    
    public String[] getInfo(){
        return new String[]{this.type, Double.toString(this.entryFee), this.location.getAddress(), this.location.getCity(), date.toString()};
    }
}
