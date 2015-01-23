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
public class Location {
    
    private String adress;
    private String location;
    private int maxTables;
    
    public Location(String adress, String location, int maxTables) {
        this.adress = adress;
        this.location = location;
        this.maxTables = maxTables;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getMaxTables() {
        return maxTables;
    }

    public void setMaxTables(int maxTables) {
        this.maxTables = maxTables;
    }
    
    @Override
    public String toString(){
        return "" + location + "   " + adress + "   " + maxTables + "   ";  
    }
}
