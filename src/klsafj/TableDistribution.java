/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klsafj;

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

    public TableDistribution(){
        this.tables = TableController.getTables();
        this.players = PlayerController.getPlayers();

        //random order
        Collections.shuffle(players);

        //als er 73 mensen zijn dan blijft er 1 over.
        //  players.size() > 8 players.size()/8  && player.size()
        if((players.size() > minPlayersPerTournament) )
        {
            //&& ((players.size()/maxPlayersPerTable) % 1 == 0)
            double tableNumber = players.size()/maxPlayersPerTable;
            //round up table number
            int roundUpTableNumber = (int)Math.ceil(tableNumber);
            fillTable(roundUpTableNumber);
        }
        
        else if (players.size() == minPlayersPerTournament){
            int tableNumber = players.size()/minPlayersPerTable;
            fillTable(tableNumber);
        }
    }

    public void fillTable(int tableNumber){
        for (Player player : players) {
                Table table = tables.get(tableIndex);
                ArrayList<Player> tablePlayers = table.getPlayerList();
                tablePlayers.add(player);
                tableIndex++;
                if(tableIndex == tableNumber){
                    tableIndex = 0;
                }
        }
    }
}

