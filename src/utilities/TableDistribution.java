/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import controller.PlayerController;
import controller.TableController;
import java.util.ArrayList;
import java.util.Collections;
import model.Player;
import model.Table;

/**
 *
 * @author CVD
 */
public class TableDistribution {
    private int tableIndex = 0;
    private final int minPlayersPerTable = 4;
    private final int maxPlayersPerTable = 8;
    private final int minPlayersPerTournament = 8;
    
    ArrayList<Player> players;
    ArrayList<Table> tables;
    
    ArrayList<Double> tableDistOptions = new ArrayList();
    ArrayList<Long> tableDistOptionsWithoutDecimal = new ArrayList();
    
    //int maxTables or make use of Location location
    public TableDistribution(int maxTables){
        this.tables = TableController.getTables();
        this.players = PlayerController.getPlayers();

        //random order
        Collections.shuffle(players);

        if((players.size() > minPlayersPerTournament) )
        {
            for(int i = minPlayersPerTable; i <= maxPlayersPerTable; i++){
                double tableValue = players.size() / i;
                if(tableValue <= maxTables){
                    tableDistOptions.add(tableValue);
                    long iPart = (long) tableValue;
                    tableDistOptionsWithoutDecimal.add(iPart);
                }
            }
            double maxValue = Collections.max(tableDistOptions);
            double maxValueWithoutDecimals = Collections.max(tableDistOptionsWithoutDecimal);
            
            if(maxValue > maxValueWithoutDecimals){
                int amountOfTables = (int)maxValueWithoutDecimals + 1;
                fillTable(amountOfTables);
            }
            else{
                int amountOfTables = (int)maxValueWithoutDecimals;
                fillTable(amountOfTables);
            }
        }
        
        else if (players.size() == minPlayersPerTournament){
            int amountOfTables = players.size()/minPlayersPerTable;
            fillTable(amountOfTables);
        }
    }

    public void fillTable(int amountOfTables){
        for (Player player : players) {
                Table table = tables.get(tableIndex);
                ArrayList<Player> tablePlayers = table.getPlayerList();
                tablePlayers.add(player);
                tableIndex++;
                if(tableIndex == (amountOfTables - 1)){
                    tableIndex = 0;
                }
        }
    }
}

