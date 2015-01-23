package utilities;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Player;
import utilities.databaseUtil.DataBaseConnector;

public class RatingSystem extends javax.swing.JFrame {
    
double sl = 0;
double sw = 0;
int selectedIndexL;
int selectedIndexW;
double sc = 0;
double scw = 0;
Player winner;
Player loser;
private ArrayList<Player> players = new ArrayList();
String[] columns = {"id", "rating"};
DefaultTableModel modelPlayer = new DefaultTableModel(columns, 0);

    
    public RatingSystem() {
        initComponents();
        fillPlayerList();
    }

    public void fillPlayerList(){
        try{
            Connection conn = DataBaseConnector.getConnection();
            Statement stat = conn.createStatement();            
            ResultSet result = stat.executeQuery("SELECT * FROM player");
            
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String emailAdress = result.getString("emailAdress");
                int telephoneNumber = result.getInt("telephoneNumber");
                double rating = result.getDouble("rating");
                boolean is_famous = result.getBoolean("is_famous");
                
                
                Player player = new Player(id, name, telephoneNumber, emailAdress, rating, is_famous, PlayerAdress playerAdress);
                players.add(player);
                
                modelPlayer.addRow(player.getInfo());
            }
            this.TPlayer.setModel(modelPlayer);
            
            result.close();
            stat.close();
        }catch(SQLException exc){
            System.err.println("Sql fout bij het ophalen van spelers: " + exc.toString());
        }
    }
    
    public void calculateWinner(){
        Player player = this.players.get(selectedIndexW);
        player.setRating(player.getRating() + sc);
        modelPlayer.setValueAt(player.getRating(), selectedIndexW, 1);    
    }
    
    public void calculateLoser(){
        Player player = this.players.get(selectedIndexL);
        player.setRating(player.getRating() - sc);
        modelPlayer.setValueAt(player.getRating(), selectedIndexL, 1);
        //modelPlayer.removeRow(selectedIndexL);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TPlayer = new javax.swing.JTable();
        btPickLoser = new javax.swing.JButton();
        btPickWinner = new javax.swing.JButton();
        btSetLoser = new javax.swing.JButton();
        btSetWinner = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TPlayer);

        btPickLoser.setText("pick loser");
        btPickLoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPickLoserActionPerformed(evt);
            }
        });

        btPickWinner.setText("pick winner");
        btPickWinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPickWinnerActionPerformed(evt);
            }
        });

        btSetLoser.setText("set loser score");
        btSetLoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetLoserActionPerformed(evt);
            }
        });

        btSetWinner.setText("set winner score");
        btSetWinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetWinnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btPickLoser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPickWinner)
                        .addGap(18, 18, 18)
                        .addComponent(btSetLoser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSetWinner))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPickLoser)
                    .addComponent(btPickWinner)
                    .addComponent(btSetLoser)
                    .addComponent(btSetWinner))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPickLoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPickLoserActionPerformed
        selectedIndexL = this.TPlayer.getSelectedRow(); 
        Player player = this.players.get(selectedIndexL);
        sl = player.getRating();
    }//GEN-LAST:event_btPickLoserActionPerformed

    private void btPickWinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPickWinnerActionPerformed
        selectedIndexW = this.TPlayer.getSelectedRow(); 
        Player player = this.players.get(selectedIndexW);
        sw = player.getRating();
    }//GEN-LAST:event_btPickWinnerActionPerformed

    private void btSetLoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSetLoserActionPerformed
        if(sw > sl) {
            sc = (sw - sl)/4 + 1;
            scw = scw + (sw - sl)/4 + 1;
        }
        
        if(sw < sl) {
            sc = (sl - sw)/8 + 1;
            scw = scw + (sl - sw)/8 + 1;
        }
        
        if(sw == sl) {
            sc = 25;
            scw = scw + 25;
        }
        calculateLoser();
    }//GEN-LAST:event_btSetLoserActionPerformed

    private void btSetWinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSetWinnerActionPerformed
        calculateWinner();
        scw = 0;
    }//GEN-LAST:event_btSetWinnerActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RatingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RatingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TPlayer;
    private javax.swing.JButton btPickLoser;
    private javax.swing.JButton btPickWinner;
    private javax.swing.JButton btSetLoser;
    private javax.swing.JButton btSetWinner;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
