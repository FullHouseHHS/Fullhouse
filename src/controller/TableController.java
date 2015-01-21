package controller;

import databaseUtil.DataBaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Player;
import model.Table;

/**
 *
 * @author CVD
 * 
 * je wilt tabellen toevoegen, tabellen aanpassen, players in de tabellen weghalen/toevoegen/wijzigen, tabellen verwijderen
 */
public class TableController {
    private static ArrayList<Table> tables;
    
    public static void addTable(int tableNumber, ArrayList<Player> players){
        try {
            for(Player player : players){
                
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatInsertKlant = "INSERT INTO table (tableNumber, playerId) "
                                                   + "VALUES (?, ?)";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatInsertKlant);
            
            prepStat.setInt(1, tableNumber);
            prepStat.setInt(2, player.getId());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
        
            stat.close();
            }
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het toevoegen van de tafel: " + exc.toString());
        }
    }
    
    public static void updateTable(int tableNumber, Table table){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatChangeKlant = "UPDATE table SET tableNumber=? WHERE tableNumber=?";
            
            PreparedStatement prepStat =  conn.prepareStatement(prepStatChangeKlant);
            
            prepStat.setInt(1, tableNumber);
            prepStat.setInt(2, table.getTableNumber());
            
            System.out.println(prepStat);
            prepStat.executeUpdate();
            
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het wijzigen van de tafel: " + exc.toString());
        }
    }
    
    public static void deletePlayerFromTable(Table table, Player player){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteKlant = "DELETE FROM table WHERE playerId = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteKlant);
            
            prepStat.setInt(1, player.getId());
            
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de tafel: " + exc.toString());
        }
    }
    
    public static void deleteTable(Table table){
        try {
            Connection conn = DataBaseConnector.getConnection(); 
            Statement stat = conn.createStatement();
            
            String prepStatDeleteKlant = "DELETE FROM table WHERE tableNumber = ?";
            PreparedStatement prepStat =  conn.prepareStatement(prepStatDeleteKlant);
            
            prepStat.setInt(1, table.getTableNumber());
            
            prepStat.executeUpdate();
            stat.close();
        }
        catch (SQLException exc) {
            System.err.println("Sql fout bij het verwijderen van de tafel: " + exc.toString());
        }
    }
    
    
    public static void getAllTables() {
        try {
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM table");
            
            while (result.next()) {
                int tableNumber = result.getInt("tableNumber");
                int playerId = result.getInt("playerId");
                //spelers ophalen van tabellen en daarna pas in arraylist gooien
                ArrayList players = new ArrayList();
                players.add(playerId);
                Table table = new Table(tableNumber, players);
                tables.add(table);
            }

            result.close();
            stat.close();

        } catch (SQLException exc) {
            System.err.println("Sql fout bij het ophalen van de tafels: " + exc.toString());
        }
    }

    public static ArrayList<Table> getTables() {
        return tables;
    } 
}
