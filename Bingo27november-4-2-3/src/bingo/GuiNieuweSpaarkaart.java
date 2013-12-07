/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;
import javax.swing.JOptionPane;


/**
 *
 * @author ruben-verhelst
 */
public class GuiNieuweSpaarkaart extends javax.swing.JFrame {

    protected Account ac;
    protected boolean nieuw = false;
    
    /**
     * Creates new form GuiNieuweWinkel
     */
    private static final GuiNieuweSpaarkaart guiNSk = new GuiNieuweSpaarkaart();    
    
    public static GuiNieuweSpaarkaart getInstance()
    {
        return guiNSk;
    } 
    
    public GuiNieuweSpaarkaart() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        txtVoornaam = new javax.swing.JTextField();
        btnTerug = new javax.swing.JButton();
        btnBewerken = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Naam");

        jLabel2.setText("Voornaam");

        btnTerug.setText("Terug");
        btnTerug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerugActionPerformed(evt);
            }
        });

        btnBewerken.setText("Toevoegen");
        btnBewerken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBewerkenActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(btnTerug)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnBewerken))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .add(17, 17, 17)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(txtNaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtVoornaam))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtNaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtVoornaam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnTerug)
                    .add(btnBewerken))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerugActionPerformed
        if(nieuw == false)
        {
            GuiSpaarkaarten guiSk = GuiSpaarkaarten.getInstance();
            guiSk.setAccount(ac);
            guiSk.updateTable();
            setVisible(false);
            guiSk.setVisible(true);
        }
        else
        {
            GuiFiliaalIndex guiKI = GuiFiliaalIndex.getInstance();
            setVisible(false);
            guiKI.setVisible(true);
        }
    }//GEN-LAST:event_btnTerugActionPerformed

    public void setAccount(Account a)
    {
        this.ac = a;
    }
    
    public void setNieuw(boolean b)
    {
        this.nieuw = b;
    }    
    
    public void clearTexts()
    {
        txtNaam.setText("");
        txtVoornaam.setText("");
    }
  
    private void btnBewerkenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBewerkenActionPerformed
        if(txtNaam.getText().equals("") || txtNaam.getText().length() > 64 )
        {
            JOptionPane.showMessageDialog(guiNSk, "Naam (correct) invullen", "Naam (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtVoornaam.getText().equals("") || txtVoornaam.getText().length() > 64)
        {
            JOptionPane.showMessageDialog(guiNSk, "Voornaam (correct) invullen", "Voornaam (correct) invullen", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String naam = txtNaam.getText();
            String voornaam = txtVoornaam.getText();
            int account = ac.getID();

            MySQL mySql = MySQL.getInstance();
                                  
            mySql.addSpaarkaart(account, naam, voornaam);
            clearTexts();
            JOptionPane.showMessageDialog(guiNSk, "Spaarkaart toegevoegd", "Spaarkaart toegevoegd", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBewerkenActionPerformed

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
            java.util.logging.Logger.getLogger(GuiNieuweSpaarkaart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweSpaarkaart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweSpaarkaart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNieuweSpaarkaart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiNieuweSpaarkaart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBewerken;
    private javax.swing.JButton btnTerug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtVoornaam;
    // End of variables declaration//GEN-END:variables
}