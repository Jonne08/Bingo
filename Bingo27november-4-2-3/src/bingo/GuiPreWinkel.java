package bingo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillaume
 */
public class GuiPreWinkel extends javax.swing.JFrame {

    /**
     * Creates new form GuiPreWinkel
     */
    private static final GuiPreWinkel guiPreWinkel = new GuiPreWinkel();
    
    public static GuiPreWinkel getInstance()
    {
        return guiPreWinkel;
    }
    
    public GuiPreWinkel() {
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
        txtLogin = new javax.swing.JTextField();
        btnInloggen = new javax.swing.JButton();
        btnWachtwoordVergeten = new javax.swing.JButton();
        pwWachtwoordWinkel = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Wachtwoord");

        btnInloggen.setText("Inloggen");
        btnInloggen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInloggenActionPerformed(evt);
            }
        });

        btnWachtwoordVergeten.setText("Terug");
        btnWachtwoordVergeten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWachtwoordVergetenActionPerformed(evt);
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
                        .add(btnWachtwoordVergeten)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnInloggen))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .add(41, 41, 41)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtLogin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .add(pwWachtwoordWinkel))
                        .add(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(pwWachtwoordWinkel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(59, 59, 59)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnInloggen)
                    .add(btnWachtwoordVergeten))
                .add(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInloggenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInloggenActionPerformed
        // TODO add your handling code here:
        int lgn = 7;
        MySQL sql = new MySQL();
        lgn = sql.loginCheckWinkel(txtLogin.getText(), pwWachtwoordWinkel.getText());
        if(lgn == 2)
        {
            JOptionPane.showMessageDialog(guiPreWinkel, "Pass fout", "Pass fout", JOptionPane.ERROR_MESSAGE);
        }
        else if(lgn == 3)
        {
            Winkel wi;         
            wi = sql.loginWinkel(txtLogin.getText(), pwWachtwoordWinkel.getText());
            GuiWinkelIndex guiWI = GuiWinkelIndex.getInstance();
            guiWI.setWinkel(wi);
            JOptionPane.showMessageDialog(guiPreWinkel, "Ingelogd", "Ingelogd", JOptionPane.INFORMATION_MESSAGE);            
            setVisible(false);
            guiWI.setVisible(true);           
        }
        else
        {
            JOptionPane.showMessageDialog(guiPreWinkel, "Login niet gevonden", "Login niet gevonden", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("lgn: " + lgn);
    }//GEN-LAST:event_btnInloggenActionPerformed

    private void btnWachtwoordVergetenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWachtwoordVergetenActionPerformed
        GuiHoofdmenu guiHM = GuiHoofdmenu.getInstance();
        setVisible(false);
        guiHM.setVisible(true);
    }//GEN-LAST:event_btnWachtwoordVergetenActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInloggen;
    private javax.swing.JButton btnWachtwoordVergeten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pwWachtwoordWinkel;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
