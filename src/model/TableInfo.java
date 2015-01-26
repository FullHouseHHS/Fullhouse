/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Jeroen
 */
public class TableInfo {
    Table table;
    Round round;
    Tournament tournament;
    Player player;
    //enum winner;
    
    public TableInfo(Table table, Round round, Tournament tournament, Player player) {
        this.table = table;
        this.round = round;
        this.tournament = tournament;
        this.player = player;
        //this.winner = winner;
        
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    public Round getRound() {
        return round;
    }
    
    public void setRound(Round round) {
        this.round = round;
    }

    public Tournament getTournament() {
        return tournament;
    }
    
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString(){
        return "" + player.getId() + "   " + round.getRoundNumber() + "   " + table.getTableNumber() + "   " + tournament.getTournamentId() + "   ";
    }
}
