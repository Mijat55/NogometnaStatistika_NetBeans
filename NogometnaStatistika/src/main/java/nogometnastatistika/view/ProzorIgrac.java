/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import nogometnastatistika.controller.ObradaIgrac;
import nogometnastatistika.model.Igrac;
import nogometnastatistika.util.Aplikacija;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ProzorIgrac extends javax.swing.JFrame {
 private ObradaIgrac obrada;
 private DecimalFormat df;
    /**
     * Creates new form ProzorIgrac
     */
    public ProzorIgrac() {
        initComponents();
         obrada = new ObradaIgrac();
         DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("hr", "HR"));
         df = new DecimalFormat("###,##0.00",dfs);
         
        setTitle(Aplikacija.NAZIV_APP + ": " + 
                Aplikacija.OPERATER.getImePrezime() +
                ": Klubovi");
        ucitaj();
    }
    private void ucitaj(){
        DefaultListModel<Igrac> m = new DefaultListModel<>();
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
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDatumRodjenja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTrenutnaVrijednost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPozicija = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtKlubIgraca = new javax.swing.JTextField();
        btnPromjeni = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("~Ime~");

        jLabel2.setText("~Prezime~");

        jLabel3.setText("~Datum Rođenja~");

        jLabel4.setText("~OiB~");

        jLabel5.setText("~Vrijednost Igrača~");

        txtTrenutnaVrijednost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setText("~Pozicija Igrača~");

        jLabel7.setText("~Klub Igrača~");

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKlubIgraca)
                    .addComponent(txtPozicija)
                    .addComponent(txtTrenutnaVrijednost)
                    .addComponent(txtOib)
                    .addComponent(txtDatumRodjenja)
                    .addComponent(txtPrezime)
                    .addComponent(txtIme)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatumRodjenja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrenutnaVrijednost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(txtPozicija, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKlubIgraca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
    if(lstPodaci.getSelectedValue()==null){
           JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite igrača :)");
           return;
       }
       
       napuniModel();
        try {
            obrada.update();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

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

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
  obrada.setEntitet(new Igrac());
       napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka()); }
            
                }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
       if(lstPodaci.getSelectedValue()==null){
          JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite igrača");
          return;
      }
          if(JOptionPane.showConfirmDialog(getRootPane(), "Sigurno obrisati" + obrada.getEntitet().getImePrezime()+ "?","Brisanje"
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
    var i = obrada.getEntitet();
    txtIme.setText(i.getIme());
    txtPrezime.setText(i.getPrezime());
    txtOib.setText(i.getOib());
    txtPozicija.setText(i.getPozicija());
    //txtDatumRodjenja.setText(i.getDatumRodjenja());
    txtTrenutnaVrijednost.setText(df.format(i.getTrenutnaVrijednost()));
    //txtKlubIgraca.setText(i.getKlub());
}
    
    
    
     private void napuniModel(){
    var i = obrada.getEntitet();
    i.setIme(txtIme.getText());
    i.setPrezime(txtPrezime.getText());
    i.setPozicija(txtPozicija.getText());
   // i.setDatumRodjenja(datumRodjenja);
   //i.setOib(oib);
  // i.setKlub(klub);
         try {
              i.setTrenutnaVrijednost(BigDecimal.valueOf(df.parse(txtTrenutnaVrijednost.getText()).byteValue()));
         } catch (Exception e) {
         }
         
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Igrac> lstPodaci;
    private javax.swing.JTextField txtDatumRodjenja;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKlubIgraca;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPozicija;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtTrenutnaVrijednost;
    // End of variables declaration//GEN-END:variables
}