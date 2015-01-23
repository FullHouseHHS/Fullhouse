/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.add;

/**
 *
 * @author nikko
 */
public class AddObjects extends javax.swing.JPanel {
    
    /**
     * Creates new form AddObjects
     */
    public AddObjects() {
        initComponents();
        jMasterclassInvalidInput.setVisible(false);
        jTournamentInvalidInput.setVisible(false);
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
        jMasterclassLocation = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jMasterclassPlayers = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMasterclassMaxParticipants = new javax.swing.JTextField();
        jMasterclassButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jMasterclassMinPoints = new javax.swing.JTextField();
        jMasterclassInvalidInput = new javax.swing.JLabel();
        jPanelTournament = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTournamentLocation = new javax.swing.JTextField();
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

        jPanelMasterclass.setBackground(new java.awt.Color(220, 240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masterclass toevoegen");

        jLabel11.setText("Locatie");

        jMasterclassPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Lesgevende speler");

        jLabel13.setText("Maximaal aantal deelnemers");

        jMasterclassMaxParticipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMasterclassMaxParticipantsActionPerformed(evt);
            }
        });

        jMasterclassButton.setText("Voeg toe");

        jLabel18.setText("Minimaal aantal punten");

        jMasterclassInvalidInput.setText("jLabel3");

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
                            .addComponent(jMasterclassPlayers, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMasterclassLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jMasterclassMaxParticipants)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMasterclassLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMasterclassButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jMasterclassInvalidInput, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelMasterclassLayout.setVerticalGroup(
            jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMasterclassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelMasterclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMasterclassLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTournamentInvalidInput.setText("jLabel3");

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
                        .addGap(30, 30, 30)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTournamentLocation)
                            .addComponent(jTournamentMaxParticipants)
                            .addComponent(jTournamentTables)
                            .addComponent(jRadioBridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioPoker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioHearts, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTournamentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTournamentButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTournamentInvalidInput, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                    .addComponent(jTournamentLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
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

    private void jMasterclassMaxParticipantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMasterclassMaxParticipantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMasterclassMaxParticipantsActionPerformed
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jMasterclassButton;
    private javax.swing.JLabel jMasterclassInvalidInput;
    private javax.swing.JTextField jMasterclassLocation;
    private javax.swing.JTextField jMasterclassMaxParticipants;
    private javax.swing.JTextField jMasterclassMinPoints;
    private javax.swing.JComboBox jMasterclassPlayers;
    private javax.swing.JPanel jPanelMasterclass;
    private javax.swing.JPanel jPanelTournament;
    private javax.swing.JRadioButton jRadioBridge;
    private javax.swing.JRadioButton jRadioHearts;
    private javax.swing.JRadioButton jRadioPoker;
    private javax.swing.JButton jTournamentButton;
    private javax.swing.JLabel jTournamentInvalidInput;
    private javax.swing.JTextField jTournamentLocation;
    private javax.swing.JTextField jTournamentMaxParticipants;
    private javax.swing.JTextField jTournamentTables;
    // End of variables declaration//GEN-END:variables
}
