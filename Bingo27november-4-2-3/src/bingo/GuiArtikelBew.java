/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillaume
 */
public class GuiArtikelBew extends javax.swing.JFrame {

    /**
     * Creates new form GuiArtikel
     */
    
    private static final GuiArtikelBew guiAB = new GuiArtikelBew();
    protected Winkel wn; 
    private boolean w = false;
    Artikel art;
    GuiArtikels guiArt;
    
    public GuiArtikelBew() {
        initComponents();
    } 
    
    public static GuiArtikelBew getInstance()
    {
        return guiAB;
    }

    public void setWinkel(Winkel wi)
    {
        this.wn = wi;
    }

    public void setWI(boolean w)
    {
        this.w = w;
    }    
    
    public void setArt(Artikel a)
    {
        this.art = a;
        txtNaam.setText(a.getNaam());
        txtBarcode.setText(a.getBarcode());
        txtPrijs.setText(Double.toString(a.getPrijs()));
        txtPuntenGekregen.setText(Double.toString(a.getPuntenGekregen()));
        txtPuntenKopen.setText(Double.toString(a.getPuntenKopen()));
        txtMinimum.setText(Integer.toString(a.getMinimum()));        
    }
    
    public void clearTexts()
    {
        
        txtNaam.setText("");
        txtBarcode.setText("");
        txtPrijs.setText("");
        txtPuntenGekregen.setText("");
        txtPuntenKopen.setText("");
        txtMinimum.setText(""); 
        
        
        
    }        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuntenGekregen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPuntenKopen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAddArtikel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrijs = new javax.swing.JTextField();
        txtMinimum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Naam");

        jLabel3.setText("Punten krijgen bij het kopen");

        jLabel4.setText("Punten nodig om te kopen");

        jLabel6.setText("Minimum aantal voor bonuspunten");

        btnAddArtikel.setText("Bewerken");
        btnAddArtikel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArtikelActionPerformed(evt);
            }
        });

        jLabel1.setText("Prijs");

        txtPrijs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrijsActionPerformed(evt);
            }
        });

        jLabel5.setText("Barcode");

        jButton1.setText("Terug");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Verwijder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnAddArtikel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)
                            .add(jLabel6)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 74, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPuntenGekregen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPuntenKopen)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtMinimum)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPrijs)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel2)
                                .add(41, 41, 41))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel5)
                                .add(29, 29, 29)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtNaam, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .add(txtBarcode))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtNaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtBarcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtPrijs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtPuntenGekregen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtPuntenKopen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtMinimum, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAddArtikel)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddArtikelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArtikelActionPerformed
        Pattern tf = Pattern.compile("\\d{5}");
        Pattern tf2 = Pattern.compile("\\d+\\.\\d+");
        Pattern tf3 = Pattern.compile(("\\d{1,11}"));
               
        
        Matcher matcher = tf.matcher(txtBarcode.getText());
        Matcher matcher2 = tf2.matcher(txtPrijs.getText());
        Matcher matcher3 = tf3.matcher(txtMinimum.getText());
        Matcher matcher4 = tf2.matcher(txtPuntenGekregen.getText());
        Matcher matcher5 = tf2.matcher(txtPuntenKopen.getText());
        
        
        
        if(txtNaam.getText().equals("") ||txtNaam.getText().length() > 32)
        {
            JOptionPane.showMessageDialog(guiAB, "Naam (correct) invullen.", "Naam (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtBarcode.getText().equals("") || !matcher.matches())
        {
            JOptionPane.showMessageDialog(guiAB, "Barcode (correct) invullen.", "Barcode (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPrijs.getText().equals("") || !matcher2.matches())
        {
            JOptionPane.showMessageDialog(guiAB, "Prijs (correct) invullen.", "Prijs (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPuntenGekregen.getText().equals("") || !matcher4.matches())
        {
            JOptionPane.showMessageDialog(guiAB, "Punten gekregen (correct) invullen.", "Punten gekregen (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPuntenKopen.getText().equals("") || !matcher5.matches())
        {
            JOptionPane.showMessageDialog(guiAB, "Punten kopen (correct) invullen.", "Punten kopen (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtMinimum.getText().equals("") || !matcher3.matches())
        {
            JOptionPane.showMessageDialog(guiAB, "Minimum aantal voor punten (correct) invullen.", "Minimum aantal voor punten (correct) invullen.", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String naam = txtNaam.getText();
            String barcode = txtBarcode.getText();
            double prijs = Double.parseDouble(txtPrijs.getText());
            double puntenGekr = Double.parseDouble(txtPuntenGekregen.getText());
            double puntenKopen = Double.parseDouble(txtPuntenKopen.getText());
            int minimum = Integer.parseInt(txtMinimum.getText());
            
            MySQL mySQL = new MySQL();
            mySQL.updateArtikel(art.getID(), naam, barcode, prijs, puntenGekr, puntenKopen, minimum);
            
            JOptionPane.showMessageDialog(guiAB, "Artikel bewerkt.", "Artikel bewerkt.", JOptionPane.INFORMATION_MESSAGE);
                                   
            clearTexts();
            if(w == true)
            {
                GuiWinkelIndex guiKI = GuiWinkelIndex.getInstance();
                setVisible(false);
                guiKI.setVisible(true);
            }
            else
            {
                GuiArtikels guiArts = GuiArtikels.getInstance();
                guiArts.updateTable();
                setVisible(false);
                guiArts.setVisible(true);                
            }
        }
                               
                   
    }//GEN-LAST:event_btnAddArtikelActionPerformed

    private void txtPrijsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrijsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrijsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int id = art.getID();
        
        MySQL sql = new MySQL();
        try 
        {
            sql.deleteArtikel(id);
        } 
        catch (SQLException ex) 
        {
            
        }

        
        JOptionPane.showMessageDialog(guiAB, "Artikel verwijderd.", "Artikel verwijderd.", JOptionPane.INFORMATION_MESSAGE);
        
        clearTexts();
        if(w == true)
        {
            GuiWinkelIndex guiKI = GuiWinkelIndex.getInstance();
            setVisible(false);
            guiKI.setVisible(true);
        }
        else
        {
            GuiArtikels guiArts = GuiArtikels.getInstance();
            guiArts.updateTable();
            setVisible(false);
            guiArts.setVisible(true);                
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiArtikelBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiArtikelBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiArtikelBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiArtikelBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GuiArtikelBew().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArtikel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtMinimum;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtPrijs;
    private javax.swing.JTextField txtPuntenGekregen;
    private javax.swing.JTextField txtPuntenKopen;
    // End of variables declaration//GEN-END:variables
}