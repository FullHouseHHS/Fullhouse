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
/**
 *
 * @author Jeroen
 */
public class TournamentController {
    private static ArrayList<Tournament> tournaments;
    
    public static void addTournament(int tournamentId, ArrayList<Location> locations) {
        try {
            for(Location location : locations) {
                
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            //tournament
            String prepStatInsertTournament = "INSERT INTO tournament (tournamentId, address, location "
                                            + "VALUES (?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertTournament);
            
            prepStat.setInt(1, tournamentId);
            prepStat.setString(2, location.getAddress());
            prepStat.setString(3, location.getLocation());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
            }
            
        }
        
        catch (SQLException exc) {
                System.err.println("Sql fout bij het toevoegen van het Tournament: " + exc.toString());
            }
    }
    
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
    
    public static ArrayList<Tournament> getTournaments() {
        return tournaments;
    } 
}
