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
    private static ArrayList<Player> players;
    
    public static String addPlayer(String surname, String lastName, int telephoneNumber,String emailAddress,double rating, boolean is_famous, String address, String zipcode, String city){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            //player
            String prepStatInsertPlayer = "INSERT INTO player (surname, lastName, telephoneNumber, emailAddress, rating, is_famous, address, zipcode, city) "
                                                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertPlayer);
            
            prepStat.setString(1, surname);
            prepStat.setString(2, lastName);
            prepStat.setInt(3, telephoneNumber);
            prepStat.setString(4, emailAddress);
            prepStat.setDouble(5, rating);
            prepStat.setBoolean(6, is_famous);
            prepStat.setString(7, address);
            prepStat.setString(8, zipcode);
            prepStat.setString(9, city);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol aan database toegevoegd!";
        }
        catch (SQLException exc) {
            System.out.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
            return "Sql fout bij het toevoegen van de speler.";
        }
    }
    
    public static void updatePlayer(String surname, String lastName, int telephoneNumber, String emailAddress, double rating, boolean is_famous, String address, String zipcode, String city, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeKlant = "UPDATE player SET surname=?, lastName=?, telephoneNumber=?, emailAddress=?, rating=?, is_famous=?, address=?, zipcode=?, city=? WHERE id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setString(1, surname);
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
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de speler: " + exc.toString());
        }
    }
    
    public static void deletePlayer(Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteKlant = "DELETE FROM player WHERE id = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteKlant);
            
            prepStat.setInt(1, player.getId());
            
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de speler: " + exc.toString());
        }
    }
    
    public static void getAllPlayers(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM player");
            
            while (result.next()) {
                int id = result.getInt("id");
                String surname = result.getString("surname");
                String lastName = result.getString("lastName");
                int telephoneNumber = result.getInt("telephoneNumber");
                String emailAddress = result.getString("emailAddress");
                double rating = result.getInt("rating");
                boolean is_famous = result.getBoolean("is_famous");
                String address = result.getString("address");
                String zipcode = result.getString("zipcode");
                String city = result.getString("city");
    
                Player player = new Player(id, surname, lastName, telephoneNumber, emailAddress, rating, is_famous, address, zipcode, city);
                players.add(player);
            }

            result.close();
            stat.close();

        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de spelers: " + exc.toString());
        }
    }
    
    public static ArrayList<Player> getPlayers() {
        return players;
    }
}
