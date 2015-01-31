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
public class EnrollmentM {
    private Date date;
    private String paid;
    private Player player;
    private Masterclass masterclass;
    
    public EnrollmentM(Player player, Masterclass masterclass, Date date, String paid) {
        this.player = player;
        this.masterclass = masterclass;
        this.date = date;
        this.paid = paid;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Masterclass getMasterclass() {
        return masterclass;
    }

    public void setMasterclass(Masterclass masterclass) {
        this.masterclass = masterclass;
    }
    
    @Override
    public String toString(){
        return "" + player.getId() + "   " + masterclass.getId() + "   " + date + "   " + paid;
    }    
}
