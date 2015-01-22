/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overview;

import java.util.Comparator;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nikko
 */
public class FuturePlayerOverview extends javax.swing.JPanel {

    /**
     * Creates new form PlayerOverview
     */
    public FuturePlayerOverview() {
        initComponents();
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

        jPlayerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Jan",  new Integer(1244), "De pot", null},
                { new Integer(2), "Kees",  new Integer(32131), "De pot",  new Boolean(true)},
                { new Integer(3), "Piet",  new Integer(4325), "De pot",  new Boolean(true)},
                { new Integer(1), "Jan",  new Integer(1244), "Vuil gebeuren",  new Boolean(true)}
            },
            new String [] {
                "Speler ID", "Naam", "Rating", "Toernooi", "Inleggeld betaald"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jPlayerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jPlayerTable);

        jSearchPlayer.setText("Zoek een speler..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jPlayerTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchPlayer;
    // End of variables declaration//GEN-END:variables

    private void initSorter() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jPlayerTable.getModel());
        jPlayerTable.setRowSorter(sorter);
        
        Comparator<String> comparator = new Comparator<String>() {

            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }
}