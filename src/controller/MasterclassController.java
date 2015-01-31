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
import java.util.Date;
import model.Location;
import model.Masterclass;
import model.Player;
import utilities.databaseUtil.DateUtil;

/**
 *
 * @author Nick Schulte
 */
public class MasterclassController {
    private static ArrayList<Masterclass> masterclasses = new ArrayList();
    private static Player host;
    private static Location mLocation;
  
    public static String addMasterclass(Player host, int minRating, int maxEntries, Location location){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatInsertMasterclass = "INSERT INTO masterclass (min_rating, max_entries, address, city, host) "
                                                        + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepStat = conn.prepareStatement(prepStatInsertMasterclass);
            
            prepStat.setInt(1, minRating);
            prepStat.setInt(2, maxEntries);
            prepStat.setString(3, location.getAddress());
            prepStat.setString(4, location.getCity());
            prepStat.setInt(5, host.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
            return "Succesvol de masterclass toegevoegd!";
        }
        catch (SQLException exc) {
            System.err.println("SQL fout bij het toevoegen van de masterclass: " + exc.toString());
            return "Sql fout bij het toevoegen van de masterclass.";
        }
    }
    
    public static String updateMasterclass(Masterclass masterclass){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatChangeMasterclass = "UPDATE masterclass SET min_rating=?, max_entries=?, address=?, city=?, host=?, date=? WHERE m_id = ?";
            
            PreparedStatement prepStat = conn.prepareStatement(prepStatChangeMasterclass);
            
            prepStat.setDouble(1, masterclass.getMinRating());
            prepStat.setInt(2, masterclass.getMaxEntries());
            prepStat.setString(3, masterclass.getLocation().getAddress());
            prepStat.setString(4, masterclass.getLocation().getCity());
            prepStat.setInt(5, masterclass.getHost().getId());
            prepStat.setTimestamp(6, DateUtil.toSqlTimestamp(masterclass.getDate()));
            prepStat.setInt(7, masterclass.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de masterclass gewijzigd!";
        }
        catch (SQLException exc){
            System.err.println("SQL fout bij wijzigen van de masterclass: " + exc.toString());
            return "Sql fout bij het wijzigen van de masterclass.";
        }
    }
    
    public static String deleteMasterclass(Masterclass masterclass){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatDeleteMasterclass = "DELETE  FROM masterclass WHERE m_id = ?";
            
            PreparedStatement prepStat = conn.prepareStatement(prepStatDeleteMasterclass);
            
            prepStat.setInt(1, masterclass.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de masterclass verwijderd!";
        }
        catch (SQLException exc){
            System.err.println("SQL fout bij verwijderen van de masterclass: " + exc.toString());
            return "Sql fout bij het verwijderen van de masterclass.";
        }
    }
    
    public static String getAllMasterclasses(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM masterclass");
            
            while (result.next()) {
                int id = result.getInt("m_id");
                int hostId = result.getInt("host");
                int minRating = result.getInt("min_rating");
                int maxEntries = result.getInt("max_entries");
                String address = result.getString("address");
                String city = result.getString("city");
                Date date = result.getTimestamp("date");
                
                ArrayList<Player> players= PlayerController.getPlayers();
                for(Player player : players){
                    if(hostId == player.getId()){
                        host = player;
                    }
                }
                
                ArrayList<Location> locations = LocationController.getLocations();
                for(Location location : locations){
                    if((address.equals(location.getAddress()))&&(city.equals(location.getCity()))){
                        mLocation = location;
                    }
                }
                
                Masterclass masterclass = new Masterclass(id, host, maxEntries, minRating, mLocation, date);
                masterclasses.add(masterclass);
            }
            
            result.close();
            stat.close();
            return "Succesvol alle masterclasses opgehaald!";
            
        } catch (SQLException exc) {
            System.err.println("SQL fout bij het ophalen van de masterclasses: " + exc.toString());
            return "Sql fout bij het ophalen van de masterclasses.";
        }
    }
    
    public static ArrayList<Masterclass> getMasterclasses() {
        return masterclasses;
    }
}
