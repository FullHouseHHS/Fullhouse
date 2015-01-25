/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import utilities.databaseUtil.DataBaseConnector;
import java.sql.*;
import java.util.ArrayList;
import model.Location;

/**
 *
 * @author Jeroen
 */
public class LocationController {
    private static ArrayList<Location> locations;
    
    public static String addLocations(String address, String city, int maxTables) {
        try{
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            //location
            String prepStatInsertLocation = "INSERT INTO location (address, city, maxTables)"
                                                   + "VALUES (?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertLocation);
            
            prepStat.setString(1, address);
            prepStat.setString(2, city);
            prepStat.setInt(3, maxTables);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de locatie toegevoegd!";
        }
        catch (SQLException exc) {
            System.out.println("Sql fout bij het toevoegen van de locatie: " + exc.toString());
            return "Sql fout bij het toevoegen van de locatie.";
        }
        
    }
   
    public static String updateLocation(String address, String city, int maxTables){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeLocation = "UPDATE location SET address = ?, city = ?, maxTables = ? WHERE address = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeLocation);
            
            prepStat.setString(1, address);
            prepStat.setString(2, city);
            prepStat.setInt(3, maxTables);

            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de locatie gewijzigd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de locatie: " + exc.toString());
            return "Sql fout bij het wijzigen van de locatie.";
        }
    }
    
        public static String deleteLocation(Location location){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteLocation = "DELETE FROM location WHERE address = ? AND city=?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteLocation);
            
            prepStat.setString(1, location.getAddress());
            prepStat.setString(2, location.getCity());
            
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de locatie verwijderd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de locatie: " + exc.toString());
            return "Sql fout bij het verwijderen van de locatie.";
        }
    }
        
    public static String getAllLocations(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM location");
            
            while (result.next()) {
                String address = result.getString("address");
                String city = result.getString("location");
                int maxTables = result.getInt("maxTables");
                
                Location location = new Location(address, city, maxTables);
                locations.add(location);
            }

            result.close();
            stat.close();
            return "Succesvol alle locaties opgehaald!";
        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de locaties: " + exc.toString());
            return "Sql fout bij het ophalen van de locaties.";
        }
    }
    
     public static ArrayList<Location> getLocations() {
        return locations;
    }

}
