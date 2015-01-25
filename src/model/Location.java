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
    private String city;
    private int maxTables;
    
    public Location(String address, String city, int maxTables) {
        this.address = address;
        this.city = city;
        this.maxTables = maxTables;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return "" + city + "   " + address + "   " + maxTables + "   ";  
    }
}
