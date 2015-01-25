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
public class EnrollmentController {
    private static ArrayList<Player> tournamentPlayers;
    
    public static void addPlayer(String name,int telephoneNumber,String emailAdress,double rating, boolean is_famous, String address, String zipcode, String city){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            //player
            String prepStatInsertPlayer = "INSERT INTO player (name, telephoneNumber, emailAdress, rating, is_famous, address, zipcode, city) "
                                                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertPlayer);
            
            prepStat.setString(1, name);
            prepStat.setInt(2, telephoneNumber);
            prepStat.setString(3, emailAdress);
            prepStat.setDouble(4, rating);
            prepStat.setBoolean(5, is_famous);
            prepStat.setString(6, address);
            prepStat.setString(7, zipcode);
            prepStat.setString(8, city);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
        }
    }
    
    public static void updatePlayer(String name, int telephoneNumber, String emailAdress, double rating, boolean is_famous, String address, String zipcode, String city, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeKlant = "UPDATE player SET name=?, telephoneNumber=?, emailAdress=?, rating=?, is_famous=?, address=?, zipcode=?, city=? WHERE id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setString(1, name);
            prepStat.setInt(2, telephoneNumber);
            prepStat.setString(3, emailAdress);
            prepStat.setDouble(4, rating);
            prepStat.setBoolean(5, is_famous);
            prepStat.setString(6, address);
            prepStat.setString(7, zipcode);
            prepStat.setString(8, city);
            prepStat.setInt(9, player.getId());
            
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
    
    public static void getAllPlayersByTournament(int to_id){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            String prepStatGetPlayersByTournament = "SELECT * FROM enrollment WHERE to_id = ? ";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatGetPlayersByTournament);
            
            prepStat.setInt(1, to_id);
            ResultSet result = prepStat.executeQuery();
            
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int telephoneNumber = result.getInt("telephoneNumber");
                String emailAdress = result.getString("emailAdress");
                double rating = result.getInt("rating");
                boolean is_famous = result.getBoolean("is_famous");
                String address = result.getString("address");
                String zipcode = result.getString("zipcode");
                String city = result.getString("city");
    
                Player player = new Player(id, name, telephoneNumber, emailAdress, rating, is_famous, address, zipcode, city);
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
