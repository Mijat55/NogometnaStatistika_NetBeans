/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import nogometnastatistika.controller.ObradaDogadjaj;
import nogometnastatistika.controller.ObradaIgrac;
import nogometnastatistika.controller.ObradaKlub;
import nogometnastatistika.controller.ObradaUtakmica;
import nogometnastatistika.controller.ObradaVrsta;
import nogometnastatistika.model.Dogadjaj;
import nogometnastatistika.model.Igrac;
import nogometnastatistika.model.Klub;
import nogometnastatistika.model.Utakmica;
import nogometnastatistika.model.Vrsta;
import nogometnastatistika.util.Aplikacija;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ProzorDogadjaj extends javax.swing.JFrame {
private ObradaDogadjaj obrada;
private ObradaIgrac obradaIg;
    /**
     * Creates new form ProzorDogadjaj
     */
    public ProzorDogadjaj() {
        initComponents();
        setIcon();
        obradaIg = new ObradaIgrac();
               obrada = new ObradaDogadjaj();
        setTitle(Aplikacija.NAZIV_APP + ": " + 
                Aplikacija.OPERATER.getImePrezime() +
                ": Dogadjaji");
        ucitajVrste();
        ucitajFilterUtakmice();
        ucitaj();
        ucitajIgraca();
    }
  
   
   
  private void ucitajIgraca(){
             DefaultListModel<Igrac> m = new DefaultListModel<>();
    m.addAll(new ObradaDogadjaj().readIgraciNaUtakmici((Utakmica)cmbFilterUtakmica.getSelectedItem()));
    lstIgraciPodaci.setModel(m);
    lstIgraciPodaci.repaint();
   }
    
     private void ucitaj(){
       DefaultListModel<Dogadjaj> m 
               = new DefaultListModel<>();
   m.addAll(obrada.read((Utakmica)cmbFilterUtakmica.getSelectedItem()));
   

    lstPodaci.setModel(m);
    lstPodaci.repaint();
     }
   
        private void ucitajFilterUtakmice(){
                 DefaultComboBoxModel<Utakmica> m 
                  = new DefaultComboBoxModel<>();
m.addAll(new ObradaUtakmica().read());
cmbFilterUtakmica.setModel(m);
cmbFilterUtakmica.repaint();
cmbFilterUtakmica.setSelectedIndex(0);
    
    
}
        private void ucitajVrste(){
        DefaultComboBoxModel<Vrsta> m
        = new DefaultComboBoxModel<>();
        Vrsta v = new Vrsta();
        v.setSifra(0);
        v.setNaziv("Nije odabrano");
        m.addElement(v);
        m.addAll(new ObradaVrsta().read());
        cmbVrste.setModel(m);
        cmbVrste.repaint();
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMinuta = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnTrazi = new javax.swing.JButton();
        cmbVrste = new javax.swing.JComboBox<>();
        cmbFilterUtakmica = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstIgraciPodaci = new javax.swing.JList<>();
        btnUtakmica = new javax.swing.JButton();
        btnVrsta = new javax.swing.JButton();
        btnIgrac = new javax.swing.JButton();
        btnIzbornik = new javax.swing.JButton();
        btnIzlaz = new javax.swing.JButton();
        btnKlub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lstPodaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstPodaci.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("~Unos Vrste~");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("~Minuta Događaja~");

        txtMinuta.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        txtMinuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMinuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutaActionPerformed(evt);
            }
        });
        txtMinuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinutaKeyPressed(evt);
            }
        });

        btnDodaj.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnTrazi.setText("🔍");
        btnTrazi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });
        btnTrazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTraziKeyPressed(evt);
            }
        });

        cmbVrste.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        cmbVrste.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbFilterUtakmica.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        cmbFilterUtakmica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lstIgraciPodaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstIgraciPodaci.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lstIgraciPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstIgraciPodaciValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstIgraciPodaci);

        btnUtakmica.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnUtakmica.setText("Utakmica");
        btnUtakmica.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUtakmica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtakmicaActionPerformed(evt);
            }
        });

        btnVrsta.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnVrsta.setText("Vrsta");
        btnVrsta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnVrsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVrstaActionPerformed(evt);
            }
        });

        btnIgrac.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnIgrac.setText("Igrač");
        btnIgrac.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnIgrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgracActionPerformed(evt);
            }
        });

        btnIzbornik.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnIzbornik.setText("Izbornik");
        btnIzbornik.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnIzbornik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzbornikActionPerformed(evt);
            }
        });

        btnIzlaz.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnIzlaz.setText("Izlaz");
        btnIzlaz.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });

        btnKlub.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnKlub.setText("Klub");
        btnKlub.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnKlub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMinuta)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbVrste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIzbornik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKlub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbFilterUtakmica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUtakmica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgrac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIzlaz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzbornik)
                    .addComponent(btnKlub)
                    .addComponent(btnUtakmica)
                    .addComponent(btnVrsta)
                    .addComponent(btnIzlaz)
                    .addComponent(btnIgrac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrazi)
                    .addComponent(cmbFilterUtakmica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodaj)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnObrisi)
                                .addComponent(btnPromjeni))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVrste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(txtMinuta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
    obrada.setEntitet(new Dogadjaj());
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
           JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite događaj :)");
           return;
       }
     if(JOptionPane.showConfirmDialog(getRootPane(),"Sigurno promjeniti 👀" + " " + obrada.getEntitet().getIgracVrstaMinutaUtakmica()+" " + "?" + " ","Brisanje"
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
          JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite događaj");
          return;
      }
          if(JOptionPane.showConfirmDialog(getRootPane(), "Sigurno obrisati" + " " + obrada.getEntitet().getIgracVrstaMinutaUtakmica()
                  + " " + "?"+"😱","Brisanje",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
          return;
      }
      
         try {
            obrada.delete();
            ucitaj();
        } catch (NogometnaStatistikaException ex) {
JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
        ucitajIgraca();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtMinutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutaActionPerformed

    private void lstIgraciPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstIgraciPodaciValueChanged
     
    }//GEN-LAST:event_lstIgraciPodaciValueChanged

    private void btnTraziKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTraziKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraziKeyPressed

    private void txtMinutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutaKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtMinuta.setEditable(true);
          JOptionPane.showMessageDialog(getRootPane(), "Možete unijeti samo broj");  
        }
    }//GEN-LAST:event_txtMinutaKeyPressed

    private void btnUtakmicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtakmicaActionPerformed
        new ProzorUtakmica().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUtakmicaActionPerformed

    private void btnVrstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVrstaActionPerformed
        new ProzorVrsta().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVrstaActionPerformed

    private void btnIgracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgracActionPerformed
        new ProzorIgrac().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIgracActionPerformed

    private void btnIzbornikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzbornikActionPerformed
        new ProzorIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIzbornikActionPerformed

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void btnKlubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlubActionPerformed
        new ProzorKlub().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlubActionPerformed
 private void napuniView(){
    var d = obrada.getEntitet();
    txtMinuta.setText(String.valueOf(d.getMinuta()));
    //cmbIgraci.setSelectedItem(d.getIgrac());
    //cmbUtakmice.setSelectedItem(d.getUtakmica());
    cmbVrste.setSelectedItem(d.getVrsta());
   
}
    
    private void napuniModel(){
    var d = obrada.getEntitet();
  d.setUtakmica((Utakmica)cmbFilterUtakmica.getSelectedItem());
   d.setIgrac(lstIgraciPodaci.getSelectedValue());
   d.setVrsta((Vrsta)cmbVrste.getSelectedItem());
          try {
       d.setMinuta(Integer.parseInt(txtMinuta.getText()));
     } catch (Exception e) {
         d.setMinuta(0);
     }
    
        
            DefaultListModel<Igrac> m = (DefaultListModel<Igrac>) lstIgraciPodaci.getModel();
            ;
            }
      

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIgrac;
    private javax.swing.JButton btnIzbornik;
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnKlub;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JButton btnUtakmica;
    private javax.swing.JButton btnVrsta;
    private javax.swing.JComboBox<Utakmica> cmbFilterUtakmica;
    private javax.swing.JComboBox<Vrsta> cmbVrste;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Igrac> lstIgraciPodaci;
    private javax.swing.JList<Dogadjaj> lstPodaci;
    private javax.swing.JTextField txtMinuta;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ball.png" )));
    }
}
