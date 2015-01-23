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
    
    public static void addPlayer(String name,int telephoneNumber,String emailAdress,double rating, boolean is_famous){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertKlant = "INSERT INTO player (name, telephoneNumber, emailAdress, rating, is_famous) "
                                                   + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertKlant);
            
            prepStat.setString(1, name);
            prepStat.setInt(2, telephoneNumber);
            prepStat.setString(3, emailAdress);
            prepStat.setDouble(4, rating);
            prepStat.setBoolean(5, is_famous);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
        
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
        }
    }
    
    public static void updatePlayer(String name, int telephoneNumber, String emailAdress, double rating, boolean is_famous, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeKlant = "UPDATE player SET name=?, telephoneNumber=?, emailAdress=?, rating=?, is_famous WHERE id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setString(1, name);
            prepStat.setInt(2, telephoneNumber);
            prepStat.setString(3, emailAdress);
            prepStat.setDouble(4, rating);
            prepStat.setInt(5, player.getId());
            prepStat.setBoolean(6, is_famous);
            
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
                int telephoneNumber = result.getInt("telephoneNumber");
                String emailAdress = result.getString("emailAdress");
                double rating = result.getInt("rating");
                boolean is_famous = result.getBoolean("is_famous");
                
                Player player = new Player( name, telephoneNumber, emailAdress, rating, is_famous);
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
