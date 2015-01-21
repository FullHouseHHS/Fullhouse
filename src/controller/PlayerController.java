/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import databaseUtil.DataBaseConnector;
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
    
    public static void addPlayer(String name,String zipCode,String city,int telephoneNumber,String emailAdress,double rating){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertKlant = "INSERT INTO player (name, zipCode, city, telephoneNumber, emailAdress, rating) "
                                                   + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertKlant);
            
            prepStat.setString(1, name);
            prepStat.setString(2, zipCode);
            prepStat.setString(3, city);
            prepStat.setInt(4, telephoneNumber);
            prepStat.setString(5, emailAdress);
            prepStat.setDouble(6, rating);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
        
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
        }
    }
    
    public static void updatePlayer(String name,String zipCode,String city,int telephoneNumber,String emailAdress,double rating, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeKlant = "UPDATE player SET name=?, zipCode=?, city=?, telephoneNumber=?, emailAdress=?, rating=? WHERE id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setString(1, name);
            prepStat.setString(2, zipCode);
            prepStat.setString(3, city);
            prepStat.setInt(4, telephoneNumber);
            prepStat.setString(5, emailAdress);
            prepStat.setDouble(6, rating);
            prepStat.setInt(7, player.getId());
            
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
                String name = result.getString("name");
                String zipCode = result.getString("zipCode");
                String city = result.getString("city");
                int telephoneNumber = result.getInt("telephoneNumber");
                String emailAdress = result.getString("emailAdress");
                double rating = result.getInt("rating");
                
                Player player = new Player(id, name, zipCode, city, telephoneNumber, emailAdress, rating);
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
