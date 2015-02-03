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
import model.Enrollment;
import model.Player;
import model.Tournament;
import utilities.databaseUtil.DateUtil;

/**
 *
 * @author CVD
 */
public class EnrollmentController {
    private static ArrayList<Enrollment> enrollments = new ArrayList();
    private static Player enrollPlayer;
    private static Tournament enrollTournament;

    
    public static String addEnrollment(Player player, Tournament tournament, Date date, String paid){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertEnrollment = "INSERT INTO enrollment (s_id, to_id, date, paid) "
                                                   + "VALUES (?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertEnrollment);
            
            prepStat.setInt(1, player.getId());
            prepStat.setInt(2, tournament.getId());
            prepStat.setTimestamp(3, DateUtil.toSqlTimestamp(date));
            prepStat.setString(4, paid);
         
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
            return "Succesvol de speler ingeschreven!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij de inschrijving van de speler: " + exc.toString());
            return "Sql fout bij de inschrijving van de speler!";
        }
    }
    
    public static String updateEnrollment(Enrollment enrollment){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeEnrollment = "UPDATE enrollment SET date=?, paid=? WHERE s_id = ? AND to_id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeEnrollment);
            
            prepStat.setTimestamp(1, DateUtil.toSqlTimestamp(enrollment.getDate()));
            prepStat.setString(2, enrollment.getPaid());
            prepStat.setInt(3, enrollment.getPlayer().getId());
            prepStat.setInt(4, enrollment.getTournament().getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de inschrijving gewijzigd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de inschrijving: " + exc.toString());
            return "Sql fout bij het wijzigen van de inschrijving!";
        }
    }
    
    public static String deleteEnrollment(Enrollment enrollment){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteEnrollment = "DELETE FROM enrollment WHERE s_id = ? AND to_id = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteEnrollment);
            
            prepStat.setInt(1, enrollment.getPlayer().getId());
            prepStat.setInt(2, enrollment.getTournament().getId());
            
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de inschrijving verwijderd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de inschrijving: " + exc.toString());
            return "Sql fout bij het verwijderen van de inschrijving!";
        }
    }
    
    public static String getAllEnrollments(){
        enrollments.clear();
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            String getAllEnrollments = "SELECT * FROM enrollment";
            ResultSet result = stat.executeQuery(getAllEnrollments);
                        
            while (result.next()) {
                int s_id = result.getInt("s_id");
                int to_id = result.getInt("to_id");
                Date date = result.getTimestamp("date");
                String paid = result.getString("paid");
                    
                for(Player player : PlayerController.getPlayers()){
                    if(player.getId() == s_id){
                        player = enrollPlayer;
                    }
                }
                
                for(Tournament tournament : TournamentController.getTournaments()){
                    if(tournament.getId() == to_id){
                        tournament = enrollTournament;
                    }
                }
                
                Enrollment enrollment = new Enrollment(enrollPlayer, enrollTournament, date, paid);
                enrollments.add(enrollment);
            }

            result.close();
            stat.close();
            return "Succesvol alle inschrijvingen opgehaald!";
        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de inschrijvingen: " + exc.toString());
            return "Sql fout bij het ophalen van de inschrijvingen!";
        }
    }
    
    public static ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }
}
