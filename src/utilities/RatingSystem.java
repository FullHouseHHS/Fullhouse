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
                
                Player player = new Player(id, name, telephoneNumber, emailAdress, rating, is_famous);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
