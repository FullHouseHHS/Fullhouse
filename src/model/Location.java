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
    private int capacity;
    private int maxTabels;
    
    public Location(String adress, String location, int capacity, int maxTables) {
        this.adress = adress;
        this.location = location;
        this.capacity = capacity;
        this.maxTabels = maxTables;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    public int getMaxTabels() {
        return maxTabels;
    }

    public void setMaxTabels(int maxTabels) {
        this.maxTabels = maxTabels;
    }
}
