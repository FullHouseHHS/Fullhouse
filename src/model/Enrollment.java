/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Jeroen
 */
public class Enrollment {
    private Date date;
    private String paid;
    Player player;
    Tournament tournament;
    
    public Enrollment(Player player, Tournament tournament, Date date, String paid) {
            this.date = date;
            this.paid = paid;
            this.player = player;
            this.tournament = tournament;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getPaid() {
        return paid;
    }
    
    public void setPaid(String paid) {
        this.paid = paid;
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
        return "" + player.getId() + "   " + tournament.getId() + "   " + date + "   " + paid;
    }
}
