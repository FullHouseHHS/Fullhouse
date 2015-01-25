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
    
    private String address;
    private String location;
    private int maxTables;
    
    public Location(String address, String location, int maxTables) {
        this.address = address;
        this.location = location;
        this.maxTables = maxTables;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxTables() {
        return maxTables;
    }

    public void setMaxTables(int maxTables) {
        this.maxTables = maxTables;
    }
    
    @Override
    public String toString(){
        return "" + location + "   " + address + "   " + maxTables + "   ";  
    }
}
