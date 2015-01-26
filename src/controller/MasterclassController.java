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
import model.Masterclass;

/**
 *
 * @author Nick Schulte
 */
public class MasterclassController {
    private static ArrayList<Masterclass> masterclasses;
    
    public static String addMasterclass(int min_rating, int max_entries, String address, String city, String host){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatInsertMasterclass = "INSERT INTO masterclass (min_rating, max_entries, address, city, host) "
                                                        + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepStat = conn.prepareStatement(prepStatInsertMasterclass);
            
            prepStat.setInt(1, min_rating);
            prepStat.setInt(2, max_entries);
            prepStat.setString(3, address);
            prepStat.setString(4, city);
            prepStat.setString(5, host);
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("SQL fout bij het toevoegen van de masterclass: " + exc.toString());
        }
    }
    
    public static void updateMasterclass(int min_rating, int max_entries, String address, String city, String host, Masterclass masterclass){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatChangeMasterclass = "UPDATE masterclass SET min_rating=?, max_entries=?, address=?, city=?, host=? WHERE m_id = ?";
            
            PreparedStatement prepStat = conn.prepareStatement(prepStatChangeMasterclass);
            
            prepStat.setInt(1, min_rating);
            prepStat.setInt(2, max_entries);
            prepStat.setString(3, address);
            prepStat.setString(4, city);
            prepStat.setString(5, host);
            prepStat.setInt(6, masterclass.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc){
            System.err.println("SQL fout bij wijzigen van de masterclass: " + exc.toString());
        }
    }
    
    public static void deleteMasterclass(Masterclass masterclass){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            
            String prepStatDeleteMasterclass = "DELETE  FROM masterclass WHERE m_id = ?";
            
            PreparedStatement prepStat = conn.prepareStatement(prepStatDeleteMasterclass);
            
            prepStat.setInt(1, masterclass.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc){
            System.err.println("SQL fout bij verwijderen van de masterclass: " + exc.toString());
        }
    }
    
    public static void getAllMasterclasses(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM masterclass");
            
            while (result.next()) {
                int m_id = result.getInt("m_id");
                int min_rating = result.getInt("min_rating");
                int max_entries = result.getInt("max_entries");
                String address = result.getString("address");
                String city = result.getString("city");
                String host = result.getString("host");
                
                Masterclass masterclass = new Masterclass(m_id, min_rating, max_entries, address, city, host);
                masterclasses.add(masterclass);
            }
            
            result.close();
            stat.close();
            
        } catch (SQLException exc) {
            System.err.println("SQL fout bij het ophalen van de masterclassen: " + exc.toString());
        }
    }
    
    public static ArrayList<Masterclass> getMasterclasses() {
        return masterclasses;
    }
}
