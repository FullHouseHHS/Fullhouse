/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author CVD
 */
public class Round {
    
    private int roundNumber;
    Player player;
    Tournament tournament;
    
    public Round(int roundNumber, Player player, Tournament tournament){
        this.roundNumber = roundNumber;
        this.player = player;
        this.tournament = tournament;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Tournament getTournament() {
        return tournament;
    }
    
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    
    @Override
    public String toString(){
        return "" + roundNumber + "   " + player.getId() + "   " + tournament.getTournamentId() + "   ";
    }
}
