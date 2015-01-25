/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CVD
 */
public class Tournament {
    private int tournamentId;
    Location location;

    public Tournament(int tournamentId, Location location) {
        this.tournamentId = tournamentId;
        this.location = location;
    }

    //public enum TournamentType { POKER, PLAY JASS, BRIDGE};
    
    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return "" + tournamentId + "   " + location.getAddress() + "   " + location.getLocation() + "   ";
    }
}
