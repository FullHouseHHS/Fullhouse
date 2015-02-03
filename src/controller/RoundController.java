/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import utilities.databaseUtil.DataBaseConnector;
import java.sql.*;
import java.util.ArrayList;
import model.Round;
import model.Player;
import model.Tournament;
/**
 *
 * @author Jeroen
 */
public class RoundController {
    private static ArrayList<Round> rounds = new ArrayList();
    
    public static void addRound(int roundNumber, ArrayList<Player> players, ArrayList<Tournament> tournaments) {
        try {
            for(Tournament tournament : tournaments){
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            //round
            //weet niet of speler id er in moet of niet
            String prepStatInsertRound = "INSERT INTO round (roundNumber, to_id) "
                                                   + "VALUES (?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertRound);
            
            prepStat.setInt(1, roundNumber);
            prepStat.setInt(2, tournament.getId());

            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
            
            }
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het toevoegen van de speler: " + exc.toString());
        }
    }

    public static void updateRound(int roundNumber, Round round){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeRound = "UPDATE round SET roundNumber=? WHERE roundNumber=?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeRound);
            
            prepStat.setInt(1, roundNumber);
            prepStat.setInt(2, round.getRoundNumber());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de round: " + exc.toString());
        }
    }
        
    public static void deleteRound(Round round){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteKlant = "DELETE FROM round WHERE roundNumber = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteKlant);
            
            prepStat.setInt(1, round.getRoundNumber());
            
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de ronde: " + exc.toString());
        }
    }
    
    
    public static void getAllRounds() {
        rounds.clear();
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM round");
            
            while (result.next()) {
                int roundNumber = result.getInt("roundNumber");
                int tournamentId = result.getInt("tournamentId");

                ArrayList tournaments = new ArrayList();
                tournaments.add(tournamentId);
                //zelfde over de error als bij TournamentController
                Round round = new Round(roundNumber, tournaments);
                rounds.add(round);
            }

            result.close();
            stat.close();

        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de tafels: " + exc.toString());
        }
    }

    public static ArrayList<Round> getRounds() {
        return rounds;
    } 
}
