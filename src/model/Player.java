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
public class Player {
    private String name;
    private String zipCode;
    private String city;
    private String emailAdress;
    
    private int id;
    private int telephoneNumber;
    private int rating; // kan het een komma getal worden?
    
    public Player(int id, String name, String zipCode, String city, int telephoneNumber,String emailAdress, int rating) {
        this.id = id;
        this.name = name;
        this.zipCode = zipCode;
        this.city = city;
        this.emailAdress = emailAdress;
        this.telephoneNumber = telephoneNumber;
        this.rating = rating;
    }
    
    public int getId() {
        return id;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
