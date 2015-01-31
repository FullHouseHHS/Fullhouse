/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import utilities.databaseUtil.DataBaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Player;

/**
 *
 * @author CVD
 */
public class PlayerController {

    private static ArrayList<Player> players = new ArrayList();
    
    public static String addPlayer(String firstName, String lastName, String address, String zipcode, String city, String emailAddress, String telephoneNumber, double rating, String famous){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();            
            
            //player
            String prepStatInsertPlayer = "INSERT INTO player (first_name, last_name,address, zipcode, city, emailaddress, telephonenumber, rating, famous) "
                                                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertPlayer);
            
            prepStat.setString(1, firstName);
            prepStat.setString(2, lastName);
            prepStat.setString(3, address);
            prepStat.setString(4, zipcode);
            prepStat.setString(5, city);
            prepStat.setString(6, emailAddress);
            prepStat.setString(7, telephoneNumber);
            prepStat.setDouble(8, rating);
            prepStat.setString(9, famous);
            
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de speler toegevoegd!";
        }
        catch (SQLException exc) {
            System.out.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
            return "Sql fout bij het toevoegen van de speler.";
        }
    }
    
    public static String updatePlayer(Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatUpdatePlayer = "UPDATE player SET first_name=?, last_name=?,address=?, zipcode=?, city=?, emailaddress=?, telephonenumber=?, rating=?, famous=? WHERE s_id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatUpdatePlayer);
            
            prepStat.setString(1, player.getFirstName());
            prepStat.setString(2, player.getLastName());
            prepStat.setString(3, player.getAddress());
            prepStat.setString(4, player.getZipCode());
            prepStat.setString(5, player.getCity());
            prepStat.setString(6, player.getEmailAddress());
            prepStat.setString(7, player.getTelephoneNumber());
            prepStat.setDouble(8, player.getRating());
            prepStat.setString(9, player.isFamous());
            prepStat.setInt(10, player.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de speler gewijzigd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de speler: " + exc.toString());
            return "Sql fout bij het wijzigen van de speler.";
        }
    }
    
    public static String deletePlayer(Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeletePlayer = "DELETE FROM player WHERE s_id = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeletePlayer);
            
            prepStat.setInt(1, player.getId());
            
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de speler verwijderd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de speler: " + exc.toString());
            return "Sql fout bij het verwijderen van de speler.";
        }
    }
    
    public static String getAllPlayers(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM player");
            
            while (result.next()) {
                int id = result.getInt("s_id");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String address = result.getString("address");
                String zipcode = result.getString("zipcode");
                String city = result.getString("city");
                String emailAddress = result.getString("emailaddress");
                String telephoneNumber = result.getString("telephonenumber");
                double rating = result.getInt("rating");
                String famous = result.getString("famous");
                
                if(telephoneNumber.length() == 9){
                    telephoneNumber = "o" + telephoneNumber; 
                }
                
                Player player = new Player(id, firstName, lastName, address, zipcode, city, emailAddress, telephoneNumber, rating, famous);
                players.add(player);
            }

            result.close();
            stat.close();
            return "Succesvol alle spelers opgehaald!";
        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de spelers: " + exc.toString());
            return "Sql fout bij het ophalen van de spelers.";
        }
    }
    
    public static ArrayList<Player> getPlayers() {
        return players;
    }
}
