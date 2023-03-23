/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Toolkit;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import nogometnastatistika.controller.ObradaKlub;
import nogometnastatistika.controller.ObradaUtakmica;
import nogometnastatistika.model.Klub;
import nogometnastatistika.model.Utakmica;
import nogometnastatistika.util.Aplikacija;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ProzorUtakmica extends javax.swing.JFrame {
private ObradaUtakmica obrada;

    /**
     * Creates new form ProzorUtakmica
     */
    public ProzorUtakmica() {
        initComponents();
        setIcon();
           obrada = new ObradaUtakmica();
        setTitle(Aplikacija.NAZIV_APP + ": " + 
                Aplikacija.OPERATER.getImePrezime() +
                ": Utakmice");
        definirajDatumPocetka();
        ucitajDomaceKlubove();
        ucitajGostujuceKlubove();
        ucitaj();
    }
   private void ucitaj(){
        DefaultListModel<Utakmica> m = new DefaultListModel<>();
    m.addAll(obrada.read());

    lstPodaci.setModel(m);
    lstPodaci.repaint();
    
}
    private void ucitajDomaceKlubove(){
        DefaultComboBoxModel<Klub> m
                = new DefaultComboBoxModel<>();
        Klub k = new Klub();
        k.setSifra(0);
        k.setNaziv("Nije odabrano");
        m.addElement(k);
        m.addAll(new ObradaKlub().read());
        cmbDomaciKlub.setModel(m);
        cmbDomaciKlub.repaint();
        
    }
     private void ucitajGostujuceKlubove(){
        DefaultComboBoxModel<Klub> m
                = new DefaultComboBoxModel<>();
        Klub k = new Klub();
        k.setSifra(0);
        k.setNaziv("Nije odabrano");
        m.addElement(k);
        m.addAll(new ObradaKlub().read());
        cmbGostiKlub.setModel(m);
        cmbGostiKlub.repaint();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBrojNavijaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStadion = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        cmbDomaciKlub = new javax.swing.JComboBox<>();
        cmbGostiKlub = new javax.swing.JComboBox<>();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("~Domaći Klub~");

        jLabel2.setText("~Gostujući Klub~");

        jLabel3.setText("~Datum i vrijeme početka ~");

        jLabel4.setText("~Broj navijača ~");

        txtBrojNavijaca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("~Stadion ~");

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbDomaciKlub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbGostiKlub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dpDatumPocetka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtBrojNavijaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtStadion, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDomaciKlub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(cmbGostiKlub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrojNavijaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStadion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       obrada.setEntitet(new Utakmica());
       napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka()); }
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
           JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite utakmicu :)");
           return;
       }
      if(JOptionPane.showConfirmDialog(getRootPane(),"Sigurno promjeniti 👀" + " " + obrada.getEntitet().getDomaciGosti()+" " + "?" + " ","Brisanje"
              ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
          return;}
       
       napuniModel();
        try {
            obrada.update();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
           if(lstPodaci.getSelectedValue()==null){
          JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite utakmicu");
          return;
      }
           if(JOptionPane.showConfirmDialog(getRootPane(), "Sigurno obrisati" + " " + obrada.getEntitet().getDomaciGosti()+" " + "?"+"😱","Brisanje"
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
    var u = obrada.getEntitet();
    cmbDomaciKlub.setSelectedItem(u.getDomaciKlub());
    cmbGostiKlub.setSelectedItem(u.getGostiKlub());
    txtBrojNavijaca.setText(String.valueOf(u.getMaksimalanBrojNavijaca()));
    LocalDate ld = u.getVrijemePocetka().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    dpDatumPocetka.datePicker.setDate(ld);
    LocalTime lt = u.getVrijemePocetka().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    dpDatumPocetka.timePicker.setTime(lt);
    txtStadion.setText(u.getStadion());
}
    
    
    
    private void napuniModel(){
    var u = obrada.getEntitet();
   u.setDomaciKlub((Klub)cmbDomaciKlub.getSelectedItem());
   u.setGostiKlub((Klub)cmbGostiKlub.getSelectedItem());
   //u.setVrijemePocetka(dpDatumPocetka.datePicker.getDate().atStartOfDay(ZoneId.systemDefault()).toLocalDate();
   u.setVrijemePocetka(dpDatumPocetka.datePicker.getDate()!=null? 
   Date.from(dpDatumPocetka.datePicker.getDate()
   .atStartOfDay().atZone(ZoneId.systemDefault())
   .toInstant()): null);
  // u.setVrijemePocetka(dpDatumPocetka.timePicker.getTime()!=null? 
  // Date.from(dpDatumPocetka.timePicker.getTime()
   //.atDate(LocalDate.MAX)
   //.toInstant()): null);
  
     try {
       u.setMaksimalanBrojNavijaca(Integer.parseInt(txtBrojNavijaca.getText()));
     } catch (Exception e) {
         u.setMaksimalanBrojNavijaca( 0);
     }
     u.setStadion(txtStadion.getText());
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Klub> cmbDomaciKlub;
    private javax.swing.JComboBox<Klub> cmbGostiKlub;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Utakmica> lstPodaci;
    private javax.swing.JTextField txtBrojNavijaca;
    private javax.swing.JTextField txtStadion;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ball.png" )));

    }

    private void definirajDatumPocetka() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYY. ");
        dps.setTranslationClear("Očisti");
       dpDatumPocetka.datePicker.setSettings(dps);
    }
}
