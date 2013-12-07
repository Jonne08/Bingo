/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gmavdamm
 */
public class GuiFiliaalVerkopenTotaal extends javax.swing.JFrame {

    /**
     * Creates new form GuiKlantRapportAssortiment
     */
    private static final GuiFiliaalVerkopenTotaal guiKRA = new GuiFiliaalVerkopenTotaal();
    private Filiaal fn;
    private DefaultTableModel model;
    private boolean wi = false;
    NumberFormat num = NumberFormat.getCurrencyInstance();

    public static GuiFiliaalVerkopenTotaal getInstance()
    {
        return guiKRA;
    }
    
    public void setFiliaal(Filiaal fi)
    {
        this.fn = fi;
        lblNaam.setText(fn.getNaam());
        lblAdres.setText(fn.getStraatFiliaal() + " " + fn.getHuisnummerFiliaal() + ", " + fn.getPostcodeFiliaal() + " " + fn.getStadFiliaal());
        lblTelefoon.setText(fn.getTelefoonFiliaal());
        lblWinkel.setText(fn.getWinkelNaam());        
    }
    
    public void setWI(boolean wi)
    {
        this.wi = wi;
    }
    
    public GuiFiliaalVerkopenTotaal() 
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

        jPanel1 = new javax.swing.JPanel();
        lblNaam = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        lblTelefoon = new javax.swing.JLabel();
        lblFiliaal = new javax.swing.JLabel();
        lblWinkel = new javax.swing.JLabel();
        btnExporteren = new javax.swing.JButton();
        btnTerug = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVerkopen = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        lblNaam.setText("Naam");

        lblAdres.setText("Adres");

        lblTelefoon.setText("Telefoon");

        lblFiliaal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFiliaal.setText("Filiaal van:");

        lblWinkel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWinkel.setText("winkel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefoon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAdres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblWinkel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNaam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                                .addComponent(lblFiliaal)))
                        .addGap(253, 253, 253))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaam)
                    .addComponent(lblFiliaal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdres)
                    .addComponent(lblWinkel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTelefoon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnExporteren.setText("Exporteren");
        btnExporteren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExporterenActionPerformed(evt);
            }
        });

        btnTerug.setText("Terug");
        btnTerug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerugActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Verkopen"));

        model = new DefaultTableModel()
        {
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tblVerkopen.setModel(model);
        model.setColumnIdentifiers(new String[]{"ID", "Naam", "Datum", "Hoeveelheid", "Punten gekregen", "Prijs"});
        jScrollPane1.setViewportView(tblVerkopen);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTerug, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnExporteren, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerug)
                    .addComponent(btnExporteren))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExporterenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExporterenActionPerformed
        MySQL sql = new MySQL();
        ArrayList<Verkopen> verkopen = sql.getVerkopenFiliaalTotaal(fn.getIdFiliaal());
           
        String str = "%11s\t%32s\t%10s\t%11s\t%12s\t%12s\r\n";
        str = str.format(str, "ID", "Naam", "Datum", "Hoeveelheid", "Punten gekr", "Prijs");
        double totaal = 0.0;
        double totprijs = 0.0;
       
        for(Verkopen v : verkopen)
        {
            String stl = "";
            String st = "";
            stl = "%11d\t%32s\t%10s\t%11d\t%10.2f\t%16s\r\n";
            st = st.format(stl, v.getId(), v.getNaam(), v.getDatum(), v.getHoev(), v.getPuntengekr(), num.format(v.getPrijs()));
            str += st;
            totaal += v.getPuntengekr();
            totprijs += v.getPrijs();
        }
       
        str += "\t\t\t\t\t\t\t\t\t\t   " + "_____________________________________" + "\r\n";
        String stb = "";
        stb = stb.format("\t\t\t\t\t\t\t\t\t\t\t%10.2f\t%16s", totaal, num.format(totprijs));
        str += stb;
  
        String file = fn.getNaam() + " VerkopenTotaal.txt";
        File f = new File(file);
        if(f.exists())
        {
            f.delete();
        }
        PrintWriter best = null;
        try
        {
            best = new PrintWriter(new FileOutputStream(file, true));
            best.append(str);
            best.flush();
            best.close();
        }
        catch(IOException e)
        {
            try
            {
                best.close();
            }
            catch(Exception ex)
            {
                 
            }
            e.printStackTrace();
        }  
        
        JOptionPane.showMessageDialog(guiKRA, "Rapport geëxporteerd.", "Rapport geëxporteerd.", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_btnExporterenActionPerformed

    private void btnTerugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerugActionPerformed
        if(wi == false)
        {
            GuiFiliaalIndex guiFI = GuiFiliaalIndex.getInstance();
            guiFI.setFiliaal(fn);
            setVisible(false);
            guiFI.setVisible(true);
        }
        else
        {
            GuiFiliaalRapport guiFR = GuiFiliaalRapport.getInstance();
            setVisible(false);
            guiFR.setVisible(true);
        }
    }//GEN-LAST:event_btnTerugActionPerformed

    public void updateTable()
    {
        MySQL sql = new MySQL();
        ArrayList<Verkopen> verkopen = sql.getVerkopenFiliaalTotaal(fn.getIdFiliaal());
        int rowCount = model.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        for(Verkopen v : verkopen)
        {
            model.addRow(new Object[]{v.getId(), v.getNaam(), v.getDatum(), v.getHoev(), v.getPuntengekr(), num.format(v.getPrijs())});
        }
        
        model.addRow(new Object[]{"", "", "", "", sql.getVerkopenFiliaalTotaalPG(fn.getIdFiliaal()), num.format(sql.getVerkopenFiliaalTotaalPr(fn.getIdFiliaal()))});
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExporteren;
    private javax.swing.JButton btnTerug;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblFiliaal;
    private javax.swing.JLabel lblNaam;
    private javax.swing.JLabel lblTelefoon;
    private javax.swing.JLabel lblWinkel;
    private javax.swing.JTable tblVerkopen;
    // End of variables declaration//GEN-END:variables
}