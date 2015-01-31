/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import utilities.databaseUtil.DataBaseConnector;
import java.sql.*;
import java.util.ArrayList;
import model.Tournament;
import model.Location;
import utilities.databaseUtil.DateUtil;
/**
 *
 * @author Jeroen
 */
public class TournamentController {
    private static ArrayList<Tournament> tournaments = new ArrayList();
    
    public static String addTournament(String type, double entryFee, Location location, java.util.Date date) {
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertTournament = "INSERT INTO tournament (type, entry_fee, address, city, date"
                                            + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertTournament);
            
            prepStat.setString(1, type);
            prepStat.setDouble(1, entryFee);
            prepStat.setString(3, location.getAddress());
            prepStat.setString(4, location.getCity());
            prepStat.setTimestamp(5, DateUtil.toSqlTimestamp(date));
            
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close(); 
            return "Succesvol het toernooi toegevoegd!";
        }
        catch (SQLException exc) {
                System.err.println("Sql fout bij het toevoegen van het toernooi: " + exc.toString());
                return "Sql fout bij het toevoegen van het toernooi.";
            }
    }
    /*
    //weet niet zeker of deze methode zo goed is, heb hem overgenomen van TableController (TableController heeft nog vreemde sleutels erin staan)        
    public static void updateTournament(int tournamentId, Tournament tournament){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeTournament = "UPDATE tournament SET tournamentId=? WHERE tournamentId=?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeTournament);
            
            prepStat.setInt(1, tournamentId);
            prepStat.setInt(2, tournament.getTournamentId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van het Tournament: " + exc.toString());
        }
    }

    //is deleteTournament eigenlijk echt nodig?
    public static void deleteTournament(Tournament tournament){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteTournament = "DELETE FROM tournament WHERE tournametId = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteTournament);
            
            prepStat.setInt(1, tournament.getTournamentId());
            
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de speler: " + exc.toString());
        }
    }
    
    public static void getAllTournaments(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM tournament");
            
            while (result.next()) {
                int tournamentId = result.getInt("tournamentId");
                String address = result.getString("address");
                String location = result.getString("location");
                
                ArrayList locations = new ArrayList();
                locations.add(address);
                locations.add(location);
                
//weet niet of de methode die hier word voorgesteld het goed oplost.
                Tournament tournament = new Tournament(tournamentId, locations);
                tournaments.add(tournament);
            }

            result.close();
            stat.close();

        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van het Tournament: " + exc.toString());
        }
    }
    */
    public static ArrayList<Tournament> getTournaments() {
        return tournaments;
    } 
}
