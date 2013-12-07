/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bingo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jonas
 */
public class GuiFiliaalRapport extends javax.swing.JFrame 
{
    private static final GuiFiliaalRapport guiFR = new GuiFiliaalRapport();
    private Winkel wn;
    private ArrayList<Filiaal> fils;

    public static GuiFiliaalRapport getInstance()
    {
        return guiFR;
    }
 
    public void setWinkel(Winkel wi) 
    {
        this.wn = wi;
        MySQL sql = new MySQL();
        cbxFiliaal.removeAllItems();
        try 
        {
            fils = sql.getFilialen(wn.getWinkelID());
            for(Filiaal f: fils)
            {
                cbxFiliaal.addItem(f.getNaam());
            }            
        } catch (SQLException ex) 
        {
        }      
    }    
    
    public GuiFiliaalRapport() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxFiliaal = new javax.swing.JComboBox();
        lblFiliaal = new javax.swing.JLabel();
        btnVT = new javax.swing.JButton();
        btnVP = new javax.swing.JButton();
        btnAss = new javax.swing.JButton();
        btnTerug = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFiliaal.setText("Filiaal:");

        btnVT.setText("Verkopen Totaal");
        btnVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVTActionPerformed(evt);
            }
        });

        btnVP.setText("Verkopen (Punten)");
        btnVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPActionPerformed(evt);
            }
        });

        btnAss.setText("Assortiment");
        btnAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssActionPerformed(evt);
            }
        });

        btnTerug.setText("Terug");
        btnTerug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiliaal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(cbxFiliaal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTerug)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFiliaal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiliaal))
                .addGap(18, 18, 18)
                .addComponent(btnVT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAss, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerug)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVTActionPerformed
        if(cbxFiliaal.getSelectedIndex() != -1)
        {
            GuiFiliaalVerkopenTotaal guiKVT = GuiFiliaalVerkopenTotaal.getInstance();
            guiKVT.setFiliaal(fils.get(cbxFiliaal.getSelectedIndex()));
            guiKVT.setWI(true);
            guiKVT.updateTable();
            setVisible(false);
            guiKVT.setVisible(true);
        }
    }//GEN-LAST:event_btnVTActionPerformed

    private void btnVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVPActionPerformed
        if(cbxFiliaal.getSelectedIndex() != -1)
        {
            GuiFiliaalVerkopenPunten guiKVP = GuiFiliaalVerkopenPunten.getInstance();
            guiKVP.setFiliaal(fils.get(cbxFiliaal.getSelectedIndex()));
            guiKVP.setWI(true);        
            guiKVP.updateTable();        
            setVisible(false);
            guiKVP.setVisible(true);
        }
    }//GEN-LAST:event_btnVPActionPerformed

    private void btnAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssActionPerformed
        if(cbxFiliaal.getSelectedIndex() != -1)
        {
            GuiFiliaalRapportAssortiment guiKRA = GuiFiliaalRapportAssortiment.getInstance();
            guiKRA.setFiliaal(fils.get(cbxFiliaal.getSelectedIndex()));
            guiKRA.setWI(true);
            guiKRA.updateTable();
            setVisible(false);
            guiKRA.setVisible(true);
        }
    }//GEN-LAST:event_btnAssActionPerformed

    private void btnTerugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerugActionPerformed
        GuiWinkelIndex guiWI = GuiWinkelIndex.getInstance();
        guiWI.setWinkel(wn);
        setVisible(false);
        guiWI.setVisible(true);  
    }//GEN-LAST:event_btnTerugActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAss;
    private javax.swing.JButton btnTerug;
    private javax.swing.JButton btnVP;
    private javax.swing.JButton btnVT;
    private javax.swing.JComboBox cbxFiliaal;
    private javax.swing.JLabel lblFiliaal;
    // End of variables declaration//GEN-END:variables
}