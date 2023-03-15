/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import nogometnastatistika.controller.ObradaKlubEntitet;
import nogometnastatistika.controller.ObradaKlub;
import nogometnastatistika.model.Klub;
import nogometnastatistika.util.Aplikacija;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ProzorKlub extends javax.swing.JFrame {
    private ObradaKlub obrada;

    /**
     * Creates new form ProzorKlub
     */
    public ProzorKlub() {
        initComponents();
        obrada = new ObradaKlub();
        setTitle(Aplikacija.NAZIV_APP + ": " + 
                Aplikacija.OPERATER.getImePrezime() +
                ": Klubovi");
        ucitaj();
    }
private void ucitaj(){
    DefaultListModel<Klub> m = new DefaultListModel<>();
    m.addAll(obrada.read());
    lstPodaci.setModel(m);
    lstPodaci.repaint();
    
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
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("~Naziv Kluba~");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaziv))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       obrada.setEntitet(new Klub());
       napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
       if(evt.getValueIsAdjusting()){
           return;
       }
       if(lstPodaci.getSelectedValue()==null){
           return;
       }
       obrada.setEntitet(lstPodaci.getSelectedValue());
       
       napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
       if(lstPodaci.getSelectedValue()==null){
           JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite klub :)");
           return;
       }
       
       napuniModel();
        try {
            obrada.update();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
      if(lstPodaci.getSelectedValue()==null){
          JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite klub");
          return;
      }
      if(JOptionPane.showConfirmDialog(getRootPane(), "Sigurno obrisati" + " " + obrada.getEntitet().getNaziv() +" " + "?","Brisanje"
              ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
          return;
      }
         try {
            obrada.delete();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
      
      
    }//GEN-LAST:event_btnObrisiActionPerformed
private void napuniView(){
    var k = obrada.getEntitet();
    txtNaziv.setText(k.getNaziv());
}
    
    
    private void napuniModel(){
    var k = obrada.getEntitet();
    k.setNaziv(txtNaziv.getText());
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Klub> lstPodaci;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}