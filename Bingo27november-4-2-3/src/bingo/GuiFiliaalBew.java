/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.awt.event.WindowEvent;
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
public class GuiFiliaalBew extends javax.swing.JFrame {

    /**
     * Creates new form GuiFiliaal
     */
    
    private static final GuiFiliaalBew guiFB = new GuiFiliaalBew();
    private Winkel wn;
    protected Filiaal fi;
    private boolean t = false;
    private boolean w = false;
    GuiFilialen guiFi;
    
    public static GuiFiliaalBew getInstance()
    {
        return guiFB;
    }
    
    public void setAdmin(boolean f)
    {
        this.t = f;
    }

    public void setWI(boolean w)
    {
        this.w = w;
    }      
    
    public void setFiliaal(Filiaal fi)
    {
        this.fi = fi;
        txtFiliaalnaam.setText(fi.getNaam());
        txtStraat.setText(fi.getStraatFiliaal());
        txtNummer.setText(fi.getHuisnummerFiliaal());
        txtPostcode.setText(fi.getPostcodeFiliaal());
        txtStad.setText(fi.getStadFiliaal());
        txtTelefoon.setText(fi.getTelefoonFiliaal()); 
        txtLogin.setText(fi.getLogin());
        txtWachtwoord.setText(fi.getWachtwoord());
    }
    
    
    
    public GuiFiliaalBew() 
    {
        initComponents();
    }
    
    public void setWinkel(Winkel wi) 
    {
        this.wn = wi;
    }    
    
    public void clearTexts()
    {
        txtFiliaalnaam.setText("");
        txtStraat.setText("");
        txtNummer.setText("");
        txtPostcode.setText("");
        txtStad.setText("");
        txtTelefoon.setText("");
        txtLogin.setText("");
        txtWachtwoord.setText("");
        guiFB.setVisible(true);
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
        txtStraat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPostcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefoon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNummer = new javax.swing.JTextField();
        btnAddFiliaal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFiliaalnaam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtWachtwoord = new javax.swing.JTextField();
        jClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        txtStraat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStraatActionPerformed(evt);
            }
        });

        jLabel3.setText("Straat");

        jLabel4.setText("Postcode");

        jLabel5.setText("Stad");

        jLabel6.setText("Telefoon");

        jLabel7.setText("Nummer");

        txtNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNummerActionPerformed(evt);
            }
        });

        btnAddFiliaal.setText("Bewerken");
        btnAddFiliaal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFiliaalActionPerformed(evt);
            }
        });

        jLabel8.setText("Filiaal naam");

        txtFiliaalnaam.setName(""); // NOI18N

        jLabel9.setText("Login");

        jLabel10.setText("Wachtwoord");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jClose.setText("Terug");
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        jButton1.setText("Verwijderen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(246, 246, 246))))
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jLabel3)
                            .add(jLabel8)
                            .add(jLabel6)
                            .add(jLabel9)
                            .add(jLabel10))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(txtPostcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel5)
                                .add(18, 18, 18)
                                .add(txtStad))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtTelefoon, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(txtStraat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel7)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtNummer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(txtFiliaalnaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtWachtwoord, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtLogin)))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(jClose)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnAddFiliaal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(txtFiliaalnaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtStraat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(jLabel7)
                    .add(txtNummer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtPostcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(txtStad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtTelefoon, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(txtWachtwoord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAddFiliaal)
                    .add(jClose)
                    .add(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStraatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStraatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStraatActionPerformed

    private void txtNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNummerActionPerformed

    private void btnAddFiliaalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFiliaalActionPerformed
        Pattern tf1 = Pattern.compile("\\d{9}");
        Pattern tf2 = Pattern.compile("\\d{10}");
        Pattern tf3 = Pattern.compile("\\d{1,8}");
        Pattern tf4 = Pattern.compile("\\d{4}");
        
        Matcher matcher = tf1.matcher(txtTelefoon.getText());
        Matcher matcher2 = tf2.matcher(txtTelefoon.getText());
        Matcher matcher3 = tf3.matcher(txtNummer.getText());
        Matcher matcher4 = tf4.matcher(txtPostcode.getText());
        if(txtFiliaalnaam.getText().equals("") || txtFiliaalnaam.getText().length() > 128)
        {
            JOptionPane.showMessageDialog(guiFB, "Filiaal naam (correct) invullen.", "Filiaal naam (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStraat.getText().equals("") || txtStraat.getText().length() > 128)
        {
            JOptionPane.showMessageDialog(guiFB, "Straat (correct) invullen.", "Straat (correct)invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtNummer.getText().equals("") || !matcher3.matches())
        {
            JOptionPane.showMessageDialog(guiFB, "Nummer (correct) invullen.", "Nummer (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPostcode.getText().equals("") || !matcher4.matches())
        {
            JOptionPane.showMessageDialog(guiFB, "Postcode (correct) invullen.", "Postcode (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStad.getText().equals("") || txtStad.getText().length() > 128)
        {
            JOptionPane.showMessageDialog(guiFB, "Stad (correct) invullen.", "Stad (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtTelefoon.getText().equals("") || !matcher.matches() || !matcher2.matches())
        {
            JOptionPane.showMessageDialog(guiFB, "Telefoon (correct) invullen.", "Telefoon (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtLogin.getText().equals("") || txtLogin.getText().length() > 32)
        {
            JOptionPane.showMessageDialog(guiFB, "Login (correct) invullen.", "Login (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }                           
        else if(txtWachtwoord.getText().equals("") || txtWachtwoord.getText().length() > 32)
        {
            JOptionPane.showMessageDialog(guiFB, "Wachtwoord (correct) invullen.", "Wachtwoord (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String filiaalNaam = txtFiliaalnaam.getText();
            String straat = txtStraat.getText();
            String nummer = txtNummer.getText();
            String postcode = txtPostcode.getText();
            String stad = txtStad.getText();
            String telefoon = txtTelefoon.getText();
            String login = txtLogin.getText();
            String wachtwoord = txtWachtwoord.getText();
            int winkel = this.wn.getWinkelID();
            int id = fi.getIdFiliaal();
            
            MySQL mySQL = new MySQL();
            mySQL.updateFiliaal(id, filiaalNaam, straat, nummer, postcode, stad, telefoon, winkel, login, wachtwoord);
            System.out.println("test");
            JOptionPane.showMessageDialog(guiFB, "Filiaal bijgewerkt", "Filiaal bijgewerkt", JOptionPane.INFORMATION_MESSAGE);
                       
            if(!t)
            {
                if(!w)
                {
                    GuiFilialen guiF = GuiFilialen.getInstance();
                    guiF.updateTable();
                    setVisible(false);
                    guiF.setVisible(true);
                }
                else
                {
                    GuiWinkelIndex guiKI = GuiWinkelIndex.getInstance();
                    setVisible(false);
                    guiKI.setVisible(true);                    
                }
            }
            else
            {
                GuiAdmin guiF = GuiAdmin.getInstance();
                setVisible(false);
                guiF.setVisible(true);
            }
        }
                    
                    
    }//GEN-LAST:event_btnAddFiliaalActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        if(!t)
        {
            if(!w)
            {
                GuiFilialen guiF = GuiFilialen.getInstance();
                guiF.updateTable();
                setVisible(false);
                guiF.setVisible(true);
            }
            else
            {
                GuiWinkelIndex guiKI = GuiWinkelIndex.getInstance();
                setVisible(false);
                guiKI.setVisible(true);                    
            }
        }
        else
        {
            GuiAdmin guiF = GuiAdmin.getInstance();
            setVisible(false);
            guiF.setVisible(true);
        }
    }//GEN-LAST:event_jCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int id = fi.getIdFiliaal();
        
        MySQL mySQL = new MySQL();
        try {
            mySQL.deleteFiliaal(id);
        } 
        catch (SQLException ex) 
        {
           
        }
        
                JOptionPane.showMessageDialog(guiFB, "Filiaal verwijderd.", "Filiaal verwijderd.", JOptionPane.INFORMATION_MESSAGE);


        if(!t)
        {
            if(!w)
            {
                GuiFilialen guiF = GuiFilialen.getInstance();
                guiF.updateTable();
                setVisible(false);
                guiF.setVisible(true);
            }
            else
            {
                GuiWinkelIndex guiKI = GuiWinkelIndex.getInstance();
                setVisible(false);
                guiKI.setVisible(true);                    
            }
        }
        else
        {
            GuiAdmin guiF = GuiAdmin.getInstance();
            setVisible(false);
            guiF.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFiliaalBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFiliaalBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFiliaalBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFiliaalBew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFiliaalBew().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFiliaal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFiliaalnaam;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNummer;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtStad;
    private javax.swing.JTextField txtStraat;
    private javax.swing.JTextField txtTelefoon;
    private javax.swing.JTextField txtWachtwoord;
    // End of variables declaration//GEN-END:variables
}
