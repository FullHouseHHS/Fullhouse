/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.overview;

import controller.LocationController;
import controller.MasterclassController;
import controller.PlayerController;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Location;
import model.Masterclass;
import model.Player;

/**
 *
 * @author CVD
 */
public class MasterclassOverview extends javax.swing.JPanel {

    /**
     * Creates new form MasterclassOverview
     */
    DefaultTableModel tableModel;
    private boolean changed;
    private ArrayList<Masterclass> masterclasses;
    private ArrayList<Masterclass> searchedMasterclasses;
    String[] columns = {"Spreker", "Max bezoekers", "Min rating", "Adres", "Plaats", "Datum"};
    
    public MasterclassOverview() {
        this.masterclasses = MasterclassController.getMasterclasses();
        initComponents();
        fillTable();
        initSorter();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMasterclassTable = new javax.swing.JTable();
        jSearchTournament = new javax.swing.JTextField();
        deleteMasterclassButton = new javax.swing.JButton();

        jLabel1.setText("Zoek een masterclass:");

        jMasterclassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jMasterclassTable.getTableHeader().setReorderingAllowed(false);
        jMasterclassTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMasterclassTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jMasterclassTable);

        jSearchTournament.setToolTipText("Zoek een masteclass..");
        jSearchTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchTournamentActionPerformed(evt);
            }
        });

        deleteMasterclassButton.setText("Verwijder masterclass(en)");
        deleteMasterclassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMasterclassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteMasterclassButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jSearchTournament, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchTournament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(deleteMasterclassButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchTournamentActionPerformed
        searchedMasterclasses.clear();
        tableModel.setRowCount(0);
        tableModel.fireTableDataChanged();
        if(jSearchTournament.getText() != null){
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();
            for(Masterclass masterclass : masterclasses){
                if(masterclass.toString().contains(jSearchTournament.getText())) {
                    searchedMasterclasses.add(masterclass);
                }
            }
            for(Masterclass masterclass : searchedMasterclasses){
                tableModel.addRow(masterclass.getInfo());
            }
            this.jMasterclassTable.setModel(tableModel);
        }
        else{
            searchedMasterclasses.clear();
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();
            fillTable();
        }
    }//GEN-LAST:event_jSearchTournamentActionPerformed

    private void deleteMasterclassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMasterclassButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.jMasterclassTable.getModel();
        int[] rows = jMasterclassTable.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            MasterclassController.deleteMasterclass(masterclasses.get(rows[i]-i));
        }
        fillTable();
    }//GEN-LAST:event_deleteMasterclassButtonActionPerformed

    private void jMasterclassTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMasterclassTablePropertyChange
        try{
            int column = jMasterclassTable.getSelectedColumn();
            int row = jMasterclassTable.getSelectedRow();
            Masterclass masterclass = masterclasses.get(row);
            String rColumn = columns[column];
            String value = (String)jMasterclassTable.getValueAt(jMasterclassTable.getSelectedRow(),jMasterclassTable.getSelectedColumn()); 
            switch(rColumn){
                case "Spreker":
                    changed = false;
                    for(Player player : PlayerController.getPlayers()){
                        if(value.equals(player.getFirstName() + " " + player.getLastName())){
                            if(player.isFamous().equals("T")){
                                masterclass.setHost(player);
                            changed = true;
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "Deze speler is niet bekend!", "Error", JOptionPane.ERROR_MESSAGE);  
                            }
                        }
                    }
                    if(!changed){
                        JOptionPane.showMessageDialog(this, "Deze speler bestaat nog niet in de database!", "Error", JOptionPane.ERROR_MESSAGE);  
                        fillTable();
                    }
                break;
                case "Max bezoekers":
                    masterclass.setMaxEntries(Integer.parseInt(value));
                break;
                case "Min rating":
                    masterclass.setMinRating(Double.valueOf(value));
                break;
                case "Adres":
                    changed = false;
                    for(Location location : LocationController.getLocations()){
                        if(value.equals(location.getAddress())){
                            masterclass.setLocation(location);
                            changed = true;
                        }
                    }
                    if(!changed){
                        JOptionPane.showMessageDialog(this, "Dit adres bestaat nog niet in de database!", "Error", JOptionPane.ERROR_MESSAGE);  
                        fillTable();
                    }
                break;
                case "Plaats":
                    changed = false;
                    for(Location location : LocationController.getLocations()){
                        if(value.equals(location.getCity())){
                            masterclass.setLocation(location);
                            changed = true;
                        }
                    }
                    if(!changed){
                        JOptionPane.showMessageDialog(this, "Deze plaats bestaat nog niet in de database!", "Error", JOptionPane.ERROR_MESSAGE);  
                        fillTable();
                    }
                break;
                case "Datum":
                    masterclass.setDate(Date.valueOf(value));
                break;
            }
            MasterclassController.updateMasterclass(masterclass);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jMasterclassTablePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteMasterclassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jMasterclassTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchTournament;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        tableModel = new DefaultTableModel(columns, 0);   
        if(masterclasses != null){
            for(Masterclass masterclass : masterclasses){
                tableModel.addRow(masterclass.getInfo());
            }
        }
        this.jMasterclassTable.setModel(tableModel);
    }
    
    private void initSorter() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jMasterclassTable.getModel());
        jMasterclassTable.setRowSorter(sorter);
    }
}