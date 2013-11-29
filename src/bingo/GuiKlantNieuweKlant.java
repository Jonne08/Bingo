/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import javax.swing.JOptionPane;

/**
 *
 * @author Guillaume
 */
public class GuiKlantNieuweKlant extends javax.swing.JFrame {

    /**
     * Creates new form GuiKlantNieuweKlantPrivé
     */
    private static final GuiKlantNieuweKlant guiNK = new GuiKlantNieuweKlant();
    private boolean isBedrijf = false;

    public static GuiKlantNieuweKlant getInstance()
    {
        return guiNK;
    }
    
    public GuiKlantNieuweKlant() {
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

        lblNaam = new javax.swing.JLabel();
        lblDyn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtDyn = new javax.swing.JTextField();
        txtStraat = new javax.swing.JTextField();
        txtNummer = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtStad = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblGD = new javax.swing.JLabel();
        txtDag = new javax.swing.JTextField();
        btnToevoegenPrive = new javax.swing.JButton();
        cBox = new javax.swing.JComboBox();
        txtSlash1 = new javax.swing.JLabel();
        txtMaand = new javax.swing.JTextField();
        txtJaar = new javax.swing.JTextField();
        txtSlash2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNaam.setText("Naam");

        lblDyn.setText("Voornaam");

        jLabel3.setText("Straat");

        jLabel4.setText("Nr");

        jLabel5.setText("Postcode");

        jLabel6.setText("Stad");

        txtNaam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaamActionPerformed(evt);
            }
        });

        lblEmail.setText("E-mailadres");

        lblGD.setText("Geboortedatum");

        btnToevoegenPrive.setText("Klant toevoegen");
        btnToevoegenPrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenPriveActionPerformed(evt);
            }
        });

        cBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Privé", "Bedrijf" }));
        cBox.setToolTipText("");
        cBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxActionPerformed(evt);
            }
        });

        txtSlash1.setText("/");

        txtSlash2.setText("/");

        jButton1.setText("Sluiten");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton1)
                        .add(18, 18, 18)
                        .add(btnToevoegenPrive))
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblNaam)
                                    .add(lblDyn))
                                .add(23, 23, 23)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtNaam)
                                    .add(txtDyn))
                                .add(47, 47, 47))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel5)
                                    .add(jLabel3))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(txtStraat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtNummer, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                    .add(layout.createSequentialGroup()
                                        .add(txtPostcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(35, 35, 35)
                                        .add(jLabel6)
                                        .add(18, 18, 18)
                                        .add(txtStad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE))))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(lblEmail)
                                            .add(lblGD))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(txtEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(layout.createSequentialGroup()
                                                .add(txtDag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtSlash1)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtMaand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(2, 2, 2)
                                                .add(txtSlash2)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtJaar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, cBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(0, 0, Short.MAX_VALUE)))))
                .add(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(cBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNaam)
                    .add(txtNaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblDyn)
                    .add(txtDyn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(txtStraat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtNummer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel6)
                    .add(txtPostcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtStad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblEmail)
                    .add(txtEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblGD)
                    .add(txtDag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtSlash1)
                    .add(txtMaand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtJaar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtSlash2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnToevoegenPrive)
                    .add(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNaamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaamActionPerformed

    private void cBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxActionPerformed
        Object selected = cBox.getSelectedItem();
        if(selected.toString().equals("Privé"))
        {
            isBedrijf = false;
            lblDyn.setText("Voornaam");
            txtDag.setVisible(true);
            txtMaand.setVisible(true);
            txtJaar.setVisible(true);
            txtSlash1.setVisible(true);
            txtSlash2.setVisible(true);
            lblGD.setVisible(true);
        }
        else if(selected.toString().equals("Bedrijf"))
        {
            isBedrijf = true;
            lblDyn.setText("BTW-nummer");
            txtDag.setVisible(false);
            txtMaand.setVisible(false);
            txtJaar.setVisible(false);
            txtSlash1.setVisible(false);
            txtSlash2.setVisible(false);
            lblGD.setVisible(false);
        }
    }//GEN-LAST:event_cBoxActionPerformed

    private void btnToevoegenPriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenPriveActionPerformed
        if(txtDyn.getText().equals("") && isBedrijf == false)
        {
            JOptionPane.showMessageDialog(guiNK, "Voornaam invullen", "Voornaam invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtNaam.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Naam invullen", "Naam invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStraat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Straat invullen", "Straat invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtNummer.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Nummer invullen", "Nummer invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPostcode.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Postcode invullen", "Postcode invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Stad invullen", "Stad invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Email invullen", "Email invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDag.getText().equals("") && isBedrijf == false)
        {
            JOptionPane.showMessageDialog(guiNK, "Dag invullen", "Dag invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtMaand.getText().equals("") && isBedrijf == false)
        {
            JOptionPane.showMessageDialog(guiNK, "Maand invullen", "Maand invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtJaar.getText().equals("") && isBedrijf == false)
        {
            JOptionPane.showMessageDialog(guiNK, "Jaar invullen", "Jaar invullen", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String voornaam = txtDyn.getText();
            String naam = txtNaam.getText();
            String straat = txtStraat.getText();
            String nummer = txtNummer.getText();
            String postcode = txtPostcode.getText();
            String stad = txtStad.getText();
            String email = txtEmail.getText();
            int dag = Integer.parseInt(txtDag.getText());
            int maand = Integer.parseInt(txtMaand.getText());
            int jaar = Integer.parseInt(txtJaar.getText());
                         
            MySQL mySql = new MySQL();
            //mySql.addAccount(naam, voornaam, straat, nummer, postcode, stad, geboortedatum, email, isBedrijf);                                   
                                   
            GuiKlantIndex guiKI = GuiKlantIndex.getInstance();
            setVisible(false);
            guiKI.setVisible(true);
        }                                  
    }//GEN-LAST:event_btnToevoegenPriveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            GuiKlantIndex guiKI = GuiKlantIndex.getInstance();
            setVisible(false);
            guiKI.setVisible(true);    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiKlantNieuweKlant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnToevoegenPrive;
    private javax.swing.JComboBox cBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDyn;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGD;
    private javax.swing.JLabel lblNaam;
    private javax.swing.JTextField txtDag;
    private javax.swing.JTextField txtDyn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtJaar;
    private javax.swing.JTextField txtMaand;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtNummer;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JLabel txtSlash1;
    private javax.swing.JLabel txtSlash2;
    private javax.swing.JTextField txtStad;
    private javax.swing.JTextField txtStraat;
    // End of variables declaration//GEN-END:variables
}
