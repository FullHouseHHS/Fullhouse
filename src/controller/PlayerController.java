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
    private static String famous;
    private static boolean is_famous;
    private static ArrayList<Player> players = new ArrayList();
    
    public static String addPlayer(String firstName, String lastName, int telephoneNumber,String emailAddress,double rating, boolean is_famous, String address, String zipcode, String city){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();            
            if(is_famous){
               famous = "T";
            }
            else{
               famous = "F";
            }
            
            //player
            String prepStatInsertPlayer = "INSERT INTO player (first_name, last_name, telephonenumber, emailaddress, rating, is_famous, address, zipcode, city) "
                                                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertPlayer);
            
            prepStat.setString(1, firstName);
            prepStat.setString(2, lastName);
            prepStat.setInt(3, telephoneNumber);
            prepStat.setString(4, emailAddress);
            prepStat.setDouble(5, rating);
            prepStat.setString(6, famous);
            prepStat.setString(7, address);
            prepStat.setString(8, zipcode);
            prepStat.setString(9, city);
            
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
    
    public static String updatePlayer(String firstName, String lastName, int telephoneNumber, String emailAddress, double rating, boolean is_famous, String address, String zipcode, String city, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            if(is_famous){
               famous = "T";
            }
            else{
               famous = "F";
            }
            
            String prepStatChangeKlant = "UPDATE player SET surname=?, lastname=?, telephonenumber=?, emailaddress=?, rating=?, is_famous=?, address=?, zipcode=?, city=? WHERE id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setString(1, firstName);
            prepStat.setString(2, lastName);
            prepStat.setInt(3, telephoneNumber);
            prepStat.setString(4, emailAddress);
            prepStat.setDouble(5, rating);
            prepStat.setBoolean(6, is_famous);
            prepStat.setString(7, address);
            prepStat.setString(8, zipcode);
            prepStat.setString(9, city);
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
            
            String prepStatDeleteKlant = "DELETE FROM player WHERE id = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteKlant);
            
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
                int telephoneNumber = result.getInt("telephonenumber");
                String emailAddress = result.getString("emailaddress");
                double rating = result.getInt("rating");
                famous = result.getString("is_famous");
                String address = result.getString("address");
                String zipcode = result.getString("zipcode");
                String city = result.getString("city");
                
                is_famous = famous.equals("T");
                Player player = new Player(id, firstName, lastName, telephoneNumber, emailAddress, rating, is_famous, address, zipcode, city);
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
