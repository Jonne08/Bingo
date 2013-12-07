/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Guillaume
 */
public class GuiNieuweKlant extends javax.swing.JFrame {

    /**
     * Creates new form GuiKlantNieuweKlantPrivé
     */
    private static final GuiNieuweKlant guiNK = new GuiNieuweKlant();
    private boolean isBedrijf = false;
    private JFileChooser fc;

    public static GuiNieuweKlant getInstance()
    {
        return guiNK;
    }
    
    public GuiNieuweKlant() {
        initComponents();
        lblBTW.setVisible(false);
        txtBTW.setVisible(false);
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
        lblBTW = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtBTW = new javax.swing.JTextField();
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
        txtFile = new javax.swing.JTextField();
        btnFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNaam.setText("Naam");

        lblBTW.setText("BTW");

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

        txtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileActionPerformed(evt);
            }
        });

        btnFile.setText("...");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
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
                                    .add(lblBTW))
                                .add(23, 23, 23)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtNaam)
                                    .add(txtBTW))
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
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, cBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(lblEmail)
                                            .add(lblGD))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(txtEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                            .add(layout.createSequentialGroup()
                                                .add(txtDag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtSlash1)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtMaand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(2, 2, 2)
                                                .add(txtSlash2)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtJaar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(txtFile))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(btnFile)))
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
                    .add(lblBTW)
                    .add(txtBTW, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtFile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnFile))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
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
            lblBTW.setVisible(false);
            txtBTW.setVisible(false);
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
            lblBTW.setVisible(true);
            txtBTW.setVisible(true);
            txtDag.setVisible(false);
            txtMaand.setVisible(false);
            txtJaar.setVisible(false);
            txtSlash1.setVisible(false);
            txtSlash2.setVisible(false);
            lblGD.setVisible(false);
        }
    }//GEN-LAST:event_cBoxActionPerformed

    private void btnToevoegenPriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenPriveActionPerformed
        Pattern tf3 = Pattern.compile("\\d{1,8}");
        Pattern tf4 = Pattern.compile("\\d{4}");
        Pattern tf5 = Pattern.compile("\\d{2}");
        Pattern tf6 = Pattern.compile("\\d{10}");
        
        Matcher matcher3 = tf3.matcher(txtNummer.getText());
        Matcher matcher4 = tf4.matcher(txtPostcode.getText());
        Matcher matcher5 = tf5.matcher(txtDag.getText());
        Matcher matcher6 = tf5.matcher(txtMaand.getText());
        Matcher matcher7 = tf4.matcher(txtJaar.getText());
        Matcher matcher8 = tf6.matcher(txtBTW.getText());
        
        if(txtNaam.getText().equals("") || txtNaam.getText().length() > 64)
        {
            JOptionPane.showMessageDialog(guiNK, "Naam invullen", "Naam invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(isBedrijf == true && !matcher8.matches())
        {
            JOptionPane.showMessageDialog(guiNK, "BTW-nummer invullen", "BTW-nummer invullen", JOptionPane.ERROR_MESSAGE);
        }     
        else if(txtStraat.getText().equals("") || txtStraat.getText().length() > 128)
        {
            JOptionPane.showMessageDialog(guiNK, "Straat invullen", "Straat invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtNummer.getText().equals("") || !matcher3.matches())
        {
            JOptionPane.showMessageDialog(guiNK, "Nummer invullen", "Nummer invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPostcode.getText().equals("") || !matcher4.matches())
        {
            JOptionPane.showMessageDialog(guiNK, "Postcode invullen", "Postcode invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStad.getText().equals("") || txtStad.getText().length() > 64)
        {
            JOptionPane.showMessageDialog(guiNK, "Stad invullen", "Stad invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtEmail.getText().equals("") || txtEmail.getText().length() > 128)
        {
            JOptionPane.showMessageDialog(guiNK, "Email invullen", "Email invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(isBedrijf == true && (txtBTW.getText().equals("")  || !matcher8.matches()))
        {
            JOptionPane.showMessageDialog(guiNK, "Btw nummer invullen", "Btw nummer invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(isBedrijf == false && (txtDag.getText().equals("") || !matcher5.matches()))
        {
            JOptionPane.showMessageDialog(guiNK, "Dag invullen", "Dag invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(isBedrijf == false && (txtMaand.getText().equals("") || !matcher6.matches()))
        {
            JOptionPane.showMessageDialog(guiNK, "Maand invullen", "Maand invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(isBedrijf == false && (txtJaar.getText().equals("") || !matcher7.matches()))
        {
            JOptionPane.showMessageDialog(guiNK, "Jaar invullen", "Jaar invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtFile.getText().equals(""))
        {
            JOptionPane.showMessageDialog(guiNK, "Geen foto geselecteerd", "Geen foto geselecteerd", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String voornaam = txtBTW.getText();
            String naam = txtNaam.getText();
            String straat = txtStraat.getText();
            String nummer = txtNummer.getText();
            String postcode = txtPostcode.getText();
            String stad = txtStad.getText();
            String email = txtEmail.getText();
            int dag = 0;
            int maand = 0;
            int jaar = 0;
            String btw = "";
            if(isBedrijf == false)
            {
                dag = Integer.parseInt(txtDag.getText());
                maand = Integer.parseInt(txtMaand.getText());
                jaar = Integer.parseInt(txtJaar.getText());
            }
            else
            {
                btw = txtBTW.getText();                
            }
            Calendar calendar = Calendar.getInstance();
            int aangemaaktd = calendar.get(Calendar.DAY_OF_MONTH);
            int aangemaaktm = calendar.get(Calendar.MONTH) + 1;
            int aangemaaktj = calendar.get(Calendar.YEAR);
            int gespaardepunten = 0;
            int werkelijkepunten = 0;
            boolean vip = false;
            boolean bigspender = false;
            boolean wolverene = false;
            boolean major = false;
            String fotopath = txtFile.getText();
            int acid = 0;
                         
            MySQL mySql = new MySQL();
            try 
            {
                acid = mySql.addAccount(naam, straat, nummer, postcode, stad, email, btw, isBedrijf, aangemaaktd, aangemaaktm, aangemaaktj, gespaardepunten, werkelijkepunten, dag, maand, jaar, vip, bigspender, wolverene, fotopath);                                              
            } 
            catch (SQLException ex) 
            {  
            }
            
            int r = JOptionPane.showConfirmDialog(guiNK, "Spaarkaart toevoegen?", "Spaarkaart toevoegen?", JOptionPane.YES_NO_OPTION);
            
            if(r == JOptionPane.YES_OPTION)
            {
                GuiNieuweSpaarkaart guiNSk = GuiNieuweSpaarkaart.getInstance();
                Account a = mySql.getAccount(acid);
                guiNSk.setAccount(a);
                guiNSk.setNieuw(true);
                guiNSk.setVisible(true);
                setVisible(false);
            }
            else
            {
                GuiFiliaalIndex guiKI = GuiFiliaalIndex.getInstance();
                setVisible(false);
                guiKI.setVisible(true);
            }
        }                                  
    }//GEN-LAST:event_btnToevoegenPriveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            GuiFiliaalIndex guiKI = GuiFiliaalIndex.getInstance();
            setVisible(false);
            guiKI.setVisible(true);    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        fc = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif", "bmp");
        fc.setFileFilter(imageFilter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showOpenDialog(guiNK);
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            txtFile.setText(file.getPath());
        } else 
        {
            txtFile.setText("");
        }
    }//GEN-LAST:event_btnFileActionPerformed

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
            java.util.logging.Logger.getLogger(GuiNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweKlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiNieuweKlant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnToevoegenPrive;
    private javax.swing.JComboBox cBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBTW;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGD;
    private javax.swing.JLabel lblNaam;
    private javax.swing.JTextField txtBTW;
    private javax.swing.JTextField txtDag;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFile;
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