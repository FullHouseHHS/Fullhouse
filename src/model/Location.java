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
    private int maxTabels;
    
    public Location(String adress, int maxTables) {
        this.adress = adress;
        this.maxTabels = maxTables;
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
