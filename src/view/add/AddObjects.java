/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.add;

import controller.LocationController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Location;

/**
 *
 * @author nikko
 */
public class AddObjects extends javax.swing.JPanel {
    ArrayList<Location> locations;
    
    private String address, city, host;
    int min_rating, max_entries;
    /**
     * Creates new form AddObjects
     */
    public AddObjects() {
        this.locations = LocationController.getLocations();
        initComponents();
        initList();
        
        jMasterclassInvalidInput.setVisible(false);
        jTournamentInvalidInput.setVisible(false);
    }
    
    public void fillLocationComboBox(){
        DefaultComboBoxModel modelMasterclassLocation = new DefaultComboBoxModel();
        DefaultComboBoxModel modelTournamentLocation = new DefaultComboBoxModel();
               
        for(Location location: locations){
            modelMasterclassLocation.addElement(location);
            modelTournamentLocation.addElement(location);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelMasterclass = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMasterclassPlayers = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMasterclassMaxParticipants = new javax.swing.JTextField();
        jMasterclassButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jMasterclassMinPoints = new javax.swing.JTextField();
        jMasterclassInvalidInput = new javax.swing.JLabel();
        jMasterclassDate1 = new javax.swing.JLabel();
        jMasterclassDay = new javax.swing.JTextField();
        jMasterclassMonth = new javax.swing.JTextField();
        jMasterclassYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MasterclassLocation = new javax.swing.JComboBox();
        jPanelTournament = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTournamentMaxParticipants = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTournamentTables = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioPoker = new javax.swing.JRadioButton();
        jRadioBridge = new javax.swing.JRadioButton();
        jRadioHearts = new javax.swing.JRadioButton();
        jTournamentButton = new javax.swing.JButton();
        jTournamentInvalidInput = new javax.swing.JLabel();
        jMasterclassDate = new javax.swing.JLabel();
        jTournamentDay = new javax.swing.JTextField();
        jTournamentMonth = new javax.swing.JTextField();
        jTournamentYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TournamentLocation = new javax.swing.JComboBox();

        jPanelMasterclass.setBackground(new java.awt.Color(220, 240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masterclass toevoegen");

        jLabel11.setText("Locatie");

        jMasterclassPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Lesgevende speler");

        jLabel13.setText("Maximaal aantal deelnemers");

        jMasterclassButton.setText("Voeg toe");
        jMasterclassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMasterclassButtonMouseClicked(evt);
            }
        });

        jLabel18.setText("Minimaal aantal punten");

        jMasterclassInvalidInput.setText("do not delete");

        jMasterclassDate1.setText("Datum");

        jMasterclassDay.setText("dd");

        jMasterclassMonth.setText("mm");

        jMasterclassYear.setText("jjjj");

        jLabel5.setText("/");

        jLabel6.setText("/");

        MasterclassLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        MasterclassLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterclassLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMasterclassLayout = new javax.swing.GroupLayout(jPanelMasterclass);
        jPanelMasterclass.setLayout(jPanelMasterclassLayout);
        jPanelMasterclassLayout.setHorizontalGroup(
            jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMasterclassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMasterclassLayout.createSequentialGroup()
                        .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMasterclassMinPoints)
                            .addComponent(jMasterclassPlayers, javax.swing.GroupLayout.Alignment.TRAILING, 0, 210, Short.MAX_VALUE)
                            .addComponent(jMasterclassMaxParticipants)
                            .addComponent(MasterclassLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMasterclassLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMasterclassButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jMasterclassInvalidInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelMasterclassLayout.createSequentialGroup()
                        .addComponent(jMasterclassDate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMasterclassYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jMasterclassMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMasterclassDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMasterclassLayout.setVerticalGroup(
            jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMasterclassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(MasterclassLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMasterclassPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jMasterclassMaxParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jMasterclassMinPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMasterclassDate1)
                    .addComponent(jMasterclassDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMasterclassMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMasterclassYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(jMasterclassInvalidInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMasterclassButton)
                .addContainerGap())
        );

        jPanelTournament.setBackground(new java.awt.Color(240, 220, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Toernooi toevoegen");

        jLabel14.setText("Locatie");

        jLabel15.setText("Maximaal aantal deelnemers");

        jLabel16.setText("Aantal tafels");

        jLabel17.setText("Soort toernooi");

        buttonGroup2.add(jRadioPoker);
        jRadioPoker.setText("Poker");

        buttonGroup2.add(jRadioBridge);
        jRadioBridge.setText("Bridge");

        buttonGroup2.add(jRadioHearts);
        jRadioHearts.setText("Hartenjagen");

        jTournamentButton.setText("Voeg toe");
        jTournamentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTournamentButtonMouseClicked(evt);
            }
        });

        jTournamentInvalidInput.setText("do not delete");

        jMasterclassDate.setText("Datum");

        jTournamentDay.setText("dd");

        jTournamentMonth.setText("mm");

        jTournamentYear.setText("jjjj");

        jLabel3.setText("/");

        jLabel4.setText("/");

        TournamentLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelTournamentLayout = new javax.swing.GroupLayout(jPanelTournament);
        jPanelTournament.setLayout(jPanelTournamentLayout);
        jPanelTournamentLayout.setHorizontalGroup(
            jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTournamentLayout.createSequentialGroup()
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTournamentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTournamentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTournamentButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTournamentInvalidInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTournamentLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jMasterclassDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTournamentMaxParticipants)
                            .addComponent(jTournamentTables)
                            .addComponent(jRadioBridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioPoker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioHearts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTournamentLayout.createSequentialGroup()
                                .addComponent(jTournamentYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jTournamentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jTournamentDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TournamentLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelTournamentLayout.setVerticalGroup(
            jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTournamentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TournamentLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTournamentMaxParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTournamentTables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioPoker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBridge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioHearts)
                .addGap(13, 13, 13)
                .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMasterclassDate)
                    .addComponent(jTournamentDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTournamentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTournamentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jTournamentInvalidInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTournamentButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTournament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMasterclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTournament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMasterclassButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMasterclassButtonMouseClicked
        checkMasterclassInput();
    }//GEN-LAST:event_jMasterclassButtonMouseClicked

    private void jTournamentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTournamentButtonMouseClicked
        checkTournamentInput();
    }//GEN-LAST:event_jTournamentButtonMouseClicked

    private void MasterclassLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterclassLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasterclassLocationActionPerformed
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MasterclassLocation;
    private javax.swing.JComboBox TournamentLocation;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jMasterclassButton;
    private javax.swing.JLabel jMasterclassDate;
    private javax.swing.JLabel jMasterclassDate1;
    private javax.swing.JTextField jMasterclassDay;
    private javax.swing.JLabel jMasterclassInvalidInput;
    private javax.swing.JTextField jMasterclassMaxParticipants;
    private javax.swing.JTextField jMasterclassMinPoints;
    private javax.swing.JTextField jMasterclassMonth;
    private javax.swing.JComboBox jMasterclassPlayers;
    private javax.swing.JTextField jMasterclassYear;
    private javax.swing.JPanel jPanelMasterclass;
    private javax.swing.JPanel jPanelTournament;
    private javax.swing.JRadioButton jRadioBridge;
    private javax.swing.JRadioButton jRadioHearts;
    private javax.swing.JRadioButton jRadioPoker;
    private javax.swing.JButton jTournamentButton;
    private javax.swing.JTextField jTournamentDay;
    private javax.swing.JLabel jTournamentInvalidInput;
    private javax.swing.JTextField jTournamentMaxParticipants;
    private javax.swing.JTextField jTournamentMonth;
    private javax.swing.JTextField jTournamentTables;
    private javax.swing.JTextField jTournamentYear;
    // End of variables declaration//GEN-END:variables

    private void checkTournamentInput() {
        boolean tournamentIncorrect = false;
                
        //Aantal deelnemers
        tournamentIncorrect = InputVerifier.checkNumbers(this.jTournamentMaxParticipants.getText()) ? tournamentIncorrect : true;
        
        //Aantal toernooitafels
        tournamentIncorrect = InputVerifier.checkNumbers(this.jTournamentTables.getText()) ? tournamentIncorrect : true;
        
        //Datum
        tournamentIncorrect = InputVerifier.checkDate(this.jTournamentDay.getText(), this.jTournamentMonth.getText(), this.jTournamentYear.getText()) 
                ? tournamentIncorrect : true;
        
        
        if (!tournamentIncorrect){
            //Add to database
            jTournamentInvalidInput.setVisible(true);
            jTournamentInvalidInput.setForeground(new Color(0, 200, 0));
            jTournamentInvalidInput.setText("Toegevoegd aan de database!");
            clearTournamentFields();
        } else {
            jTournamentInvalidInput.setVisible(true);
            jTournamentInvalidInput.setForeground(Color.red);
            jTournamentInvalidInput.setText("Bepaalde velden hebben geen correcte input.");
        }
    }

    private void checkMasterclassInput() {
        boolean masterclassIncorrect = false;
                
        masterclassIncorrect = InputVerifier.checkNumbers(this.jMasterclassMaxParticipants.getText()) ? masterclassIncorrect : true;
        
        masterclassIncorrect = InputVerifier.checkNumbers(this.jMasterclassMinPoints.getText()) ? masterclassIncorrect : true;
        
        masterclassIncorrect = InputVerifier.checkDate(this.jMasterclassDay.getText(), this.jMasterclassMonth.getText(), this.jMasterclassYear.getText()) 
                ? masterclassIncorrect : true;
        
        
        if (!masterclassIncorrect){
            //Add to database
            jMasterclassInvalidInput.setVisible(true);
            jMasterclassInvalidInput.setForeground(new Color(0, 200, 0));
            jMasterclassInvalidInput.setText("Toegevoegd aan de database!");
            // submit to database
            setValuesMasterclass();
            String addedToDataBase = MasterclassController.addMasterclass(min_rating, max_entries, address, city, host);
            clearMasterclassFields();
        } else {
            jMasterclassInvalidInput.setVisible(true);
            jMasterclassInvalidInput.setForeground(Color.red);
            jMasterclassInvalidInput.setText("Bepaalde velden hebben geen correcte input.");
        }
    }
    
    private void clearTournamentFields() {
        this.jTournamentMaxParticipants.setText("");
        this.jTournamentTables.setText("");
        this.jTournamentDay.setText("");
        this.jTournamentMonth.setText("");
        this.jTournamentYear.setText("");
    }
    
    private void clearMasterclassFields() {
        this.jMasterclassMaxParticipants.setText("");
        this.jMasterclassMinPoints.setText("");
        this.jMasterclassDay.setText("");
        this.jMasterclassMonth.setText("");
        this.jMasterclassYear.setText("");
    }

    private void initList() {
        //Read from database
        //Put in jMasterclassPlayers
        
    }
    
    private void setValuesMasterclass(){
        min_rating = Integer.parseInt(this.jMasterclassMinPoints.getText());
        max_entries = Integer.parseInt(this.jMasterclassMaxParticipants.getText());
        //Object tempdata = this.MasterclassLocation.getSelectedItem();
        address = this.MasterclassLocation.getAddress();
    }
}
