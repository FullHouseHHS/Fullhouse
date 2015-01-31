/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.overview;

import controller.PlayerController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Player;

/**
 *
 * @author nikko
 */
public class PlayerOverview extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private ArrayList<Player> players;
    private ArrayList<Player> searchedPlayers = new ArrayList();
    String[] columns = {"Voornaam", "Achternaam", "Adres", "Postcode", "Woonplaats", "Emailadres", "Telefoonnummer","Rating", "Bekend"};
    /**
     * Creates new form PlayerOverview
     */
    public PlayerOverview() {
        this.players = PlayerController.getPlayers();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPlayerTable = new javax.swing.JTable();
        jSearchPlayer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deletePlayerButton = new javax.swing.JButton();

        jPlayerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voornaam", "Achternaam", "Tel.", "E-mail", "Rating", "Is bekend", "Adres", "Postcode", "Woonplaats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jPlayerTable.getTableHeader().setReorderingAllowed(false);
        jPlayerTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPlayerTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jPlayerTable);

        jSearchPlayer.setToolTipText("Zoek een speler..");
        jSearchPlayer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchPlayerKeyReleased(evt);
            }
        });

        jLabel1.setText("Zoek een speler:");

        deletePlayerButton.setText("Verwijder speler(s)");
        deletePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deletePlayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deletePlayerButton)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchPlayerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchPlayerKeyReleased
        searchedPlayers.clear();
        tableModel.setRowCount(0);
        tableModel.fireTableDataChanged();
        if(jSearchPlayer.getText() != null){
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();
            for(Player player : players){
                if(player.toString().contains(jSearchPlayer.getText())) {
                    searchedPlayers.add(player);
                }
            }
            for(Player player : searchedPlayers){
                tableModel.addRow(player.getInfo());
            }
            this.jPlayerTable.setModel(tableModel);
        }
        else{
            searchedPlayers.clear();
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();
            fillTable();
        }
    }//GEN-LAST:event_jSearchPlayerKeyReleased

    private void deletePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.jPlayerTable.getModel();
        int[] rows = jPlayerTable.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            PlayerController.deletePlayer(players.get(rows[i]-i));
        }
        fillTable();
    }//GEN-LAST:event_deletePlayerButtonActionPerformed

    private void jPlayerTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPlayerTablePropertyChange
        try{
            int column = jPlayerTable.getSelectedColumn();
            int row = jPlayerTable.getSelectedRow();
            Player player = players.get(row);
            String rColumn = columns[column];
            String value = (String)jPlayerTable.getValueAt(jPlayerTable.getSelectedRow(),jPlayerTable.getSelectedColumn()); 

            switch(rColumn.toLowerCase()){
                case "voornaam":
                    player.setFirstName(value);
                break;
                case "achternaam":
                    player.setLastName(value);
                break;
                case "adres":
                    player.setAddress(value);
                break;
                case "postcode":
                    player.setZipCode(value);
                break;
                case "woonplaats":
                    player.setCity(value);
                break;
                case "emailadres":
                    player.setEmailAddress(value);
                break;
                case "telefoonnummer":
                    if(value.startsWith("0")){
                        value = "o" + value.substring(1);
                    }
                    player.setTelephoneNumber(value);
                break;
                case "rating":
                    JOptionPane.showMessageDialog(this, "Rating kan niet aangepast worden!", "Error", JOptionPane.ERROR_MESSAGE);
                break;
                case "bekend":
                    player.setFamous(value);
                break;
            }
            PlayerController.updatePlayer(player);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jPlayerTablePropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletePlayerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jPlayerTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchPlayer;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        tableModel = new DefaultTableModel(columns, 0);   
        if(players != null){
            for(Player player : players){
                tableModel.addRow(player.getInfo());
            }
        }
        tableModel.fireTableDataChanged();
        this.jPlayerTable.setModel(tableModel);
    }
    
    private void initSorter() {
        TableRowSorter<TableModel> sorter = new TableRowSorter(jPlayerTable.getModel());
        jPlayerTable.setRowSorter(sorter);
    }
}