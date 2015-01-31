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
import model.EnrollmentM;
import model.Masterclass;
import model.Player;
import utilities.databaseUtil.DateUtil;

/**
 *
 * @author CVD
 */
public class EnrollmentMController {
    private static ArrayList<EnrollmentM> mEnrollments = new ArrayList();
    private static Player enrollMPlayer;
    private static Masterclass enrollMMasterclass;

    
    public static String addEnrollmentM(Player player, Masterclass masterclass, Date date, String paid){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertEnrollmentM = "INSERT INTO enrollment_m (s_id, m_id, date, paid) "
                                                   + "VALUES (?, ?, ?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertEnrollmentM);
            
            prepStat.setInt(1, player.getId());
            prepStat.setInt(2, masterclass.getId());
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
    
    public static String updateEnrollmentM(EnrollmentM enrollmentM){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeEnrollmentM = "UPDATE enrollment_m SET date=?, paid=? WHERE s_id = ? AND m_id = ?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeEnrollmentM);
            
            prepStat.setTimestamp(1, DateUtil.toSqlTimestamp(enrollmentM.getDate()));
            prepStat.setString(2, enrollmentM.getPaid());
            prepStat.setInt(3, enrollmentM.getPlayer().getId());
            prepStat.setInt(4, enrollmentM.getMasterclass().getId());
            
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
    
    public static String deleteEnrollmentM(EnrollmentM enrollmentM){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteEnrollmentM = "DELETE FROM enrollment_m WHERE s_id = ? AND m_id = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteEnrollmentM);
            
            prepStat.setInt(1, enrollmentM.getPlayer().getId());
            prepStat.setInt(2, enrollmentM.getMasterclass().getId());
            
            prepStat.executeUpdate();
            stat.close();
            return "Succesvol de inschrijving verwijderd!";
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de inschrijving: " + exc.toString());
            return "Sql fout bij het verwijderen van de inschrijving!";
        }
    }
    
    public static String getAllMEnrollments(){
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            String getAllMEnrollments = "SELECT * FROM enrollment_m";
            ResultSet result = stat.executeQuery(getAllMEnrollments);
                        
            while (result.next()) {
                int s_id = result.getInt("s_id");
                int m_id = result.getInt("m_id");
                Date date = result.getTimestamp("date");
                String paid = result.getString("paid");
                    
                for(Player player : PlayerController.getPlayers()){
                    if(player.getId() == s_id){
                        player = enrollMPlayer;
                    }
                }
                
                for(Masterclass masterclass : MasterclassController.getMasterclasses()){
                    if(masterclass.getId() == m_id){
                        masterclass = enrollMMasterclass;
                    }
                }
                
                EnrollmentM enrollmentM = new EnrollmentM(enrollMPlayer, enrollMMasterclass, date, paid);
                mEnrollments.add(enrollmentM);
            }

            result.close();
            stat.close();
            return "Succesvol alle inschrijvingen opgehaald!";
        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de inschrijvingen: " + exc.toString());
            return "Sql fout bij het ophalen van de inschrijvingen!";
        }
    }
    
    public static ArrayList<EnrollmentM> getMEnrollments() {
        return mEnrollments;
    }
}
