/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bingo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonas
 */
public class GuiArtikels extends javax.swing.JFrame {

    /**
     * Creates new form GuiArtikels
     */
    
    private static final GuiArtikels guiArts = new GuiArtikels();
    protected Winkel wn;
    ArrayList<Artikel> artList;
    ArrayList<Artikel> curList;
    
    public GuiArtikels() 
    {
        GuiWinkelIndex guiWI = GuiWinkelIndex.getInstance();
        wn = guiWI.getWinkel();
        initComponents();
    }
    
    public static GuiArtikels getInstance()
    {
        return guiArts;
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
        tblArtikels = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel()
        {
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tblArtikels.setModel(model);
        MySQL mySQL = new MySQL();
        artList = mySQL.getArtikels(wn.getWinkelID());
        curList = artList;
        model.setColumnIdentifiers(new String[]{"ID", "Naam", "Barcode", "Prijs", "Punten gekregen", "Punten kopen", "Minimum" });
        for(Artikel a : artList)
        {
            model.addRow(new Object[]{a.getID(), a.getNaam(), a.getBarcode(), a.getPrijs(), a.getPuntenGekregen(), a.getPuntenKopen(), a.getMinimum()});
        }
        jScrollPane1.setViewportView(tblArtikels);

        jButton1.setText("Bewerken");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton2.setText("Terug");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(tblArtikels.getSelectedRow());
        System.out.println(curList.get(tblArtikels.getSelectedRow()).getNaam());  
        GuiArtikelBew guiAB = GuiArtikelBew.getInstance();
        if(curList.isEmpty())
        {
            guiAB.setArt(artList.get(tblArtikels.getSelectedRow()));
            System.out.println("CL: " + curList.get(tblArtikels.getSelectedRow()).getNaam());
        }
        else
        {
            guiAB.setArt(curList.get(tblArtikels.getSelectedRow()));
            System.out.println("AL: " + artList.get(tblArtikels.getSelectedRow()).getNaam());
        }
        guiAB.setWinkel(wn);
        guiAB.setWI(false);
        setVisible(false);
        guiAB.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String search = txtSearch.getText();
        System.out.println(search);
        if(search.equals(""))
        {
            initTable(artList);
        }
        else
        {
            ArrayList<Artikel> zkList = zoekArtikels(search);
            initTable(zkList);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    public void updateTable()
            {
                DefaultTableModel model = (DefaultTableModel) tblArtikels.getModel();
                int rowCount = model.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--)
                 {
                 model.removeRow(i);
                }
            MySQL mySQL = new MySQL();
    artList = mySQL.getArtikels(wn.getWinkelID());
    curList = artList;
    model.setColumnIdentifiers(new String[]{"ID", "Naam", "Barcode", "Prijs", "Punten gekregen", "Punten kopen", "Minimum" });
    for(Artikel a : artList)
    {
        model.addRow(new Object[]{a.getID(), a.getNaam(), a.getBarcode(), a.getPrijs(), a.getPuntenGekregen(), a.getPuntenKopen(), a.getMinimum()});
    }
    
    
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GuiWinkelIndex guiWI = GuiWinkelIndex.getInstance();
        setVisible(false);
        guiWI.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public ArrayList<Artikel> zoekArtikels(String kw)
    {
        ArrayList<Artikel> zkList = new ArrayList<Artikel>();
        for(Artikel a : artList)
        {
            if(a.getBarcode().startsWith(kw) || a.getNaam().toLowerCase().startsWith(kw))
            {
                zkList.add(a);
            }
        }
        return zkList;
    }
    
    public void initTable(ArrayList<Artikel> aList)
    {
        DefaultTableModel model = (DefaultTableModel) tblArtikels.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        for(Artikel a : aList)
        {
            model.addRow(new Object[]{a.getID(), a.getNaam(), a.getBarcode(), a.getPrijs(), a.getPuntenGekregen(), a.getPuntenKopen(), a.getMinimum()});
            this.curList = aList;
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiArtikels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiArtikels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiArtikels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiArtikels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiArtikels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblArtikels;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
