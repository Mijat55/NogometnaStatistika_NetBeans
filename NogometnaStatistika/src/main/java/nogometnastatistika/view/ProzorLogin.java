/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import nogometnastatistika.controller.ObradaOperater;
import nogometnastatistika.model.Operater;
import nogometnastatistika.util.Aplikacija;

/**
 *
 * @author Marko
 */
public class ProzorLogin extends javax.swing.JFrame {
private ObradaOperater obrada;
    /**
     * Creates new form ProzorLogin
     */
    public ProzorLogin() {
        initComponents();
        setIcon();
        obrada = new ObradaOperater();
        setTitle(Aplikacija.NAZIV_APP + " Login");
    }
    

    


    private void login (){
        lblPoruka.setText("");
        if(txtEmail.getText().isEmpty()){
            lblPoruka.setText("Obavezan Email");
            return;
        }
        if(pswLozinka.getPassword().length==0){
            lblPoruka.setText("Obavezna Lozinka");
            return;
        }
        
        Operater o = obrada.login(txtEmail.getText(), pswLozinka.getPassword());
        if(o==null){
            lblPoruka.setText("Neispravna kombinacija Email-a i Lozinke");
            return;
        }
        Aplikacija.OPERATER=o;
        
        new ProzorIzbornik().setVisible(true);
        dispose();
                
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
        btnLogin = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(153, 153, 153));
        btnLogin.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, -1));
        jPanel1.add(lblPoruka, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 382, 40));

        pswLozinka.setBackground(new java.awt.Color(204, 204, 204));
        pswLozinka.setText("edunova");
        pswLozinka.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pswLozinka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswLozinkaActionPerformed(evt);
            }
        });
        pswLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswLozinkaKeyPressed(evt);
            }
        });
        jPanel1.add(pswLozinka, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 250, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 3, 12)); // NOI18N
        jLabel2.setText("Lozinka:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 73, 20));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("mijat5555@gmail.com");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 3, 12)); // NOI18N
        jLabel1.setText("Email:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 20));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setText("Nogometna Statistika");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 237, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPic.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
       lblPoruka.setText("");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(txtEmail.getText().isEmpty()){
               lblPoruka.setText("Obavezno Email");
               return;
           }
       
        if(pswLozinka.getPassword().length==0){
            pswLozinka.requestFocus();
            lblPoruka.setText("Obavezna Lozinka");
            return;
        }
        login();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void pswLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswLozinkaKeyPressed
      lblPoruka.setText("");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(pswLozinka.getPassword().length==0){
            lblPoruka.setText("Obavezna Lozinka");
            return;
            
        }
            if(txtEmail.getText().isEmpty()){
            lblPoruka.setText("Obavezna Email");
            txtEmail.requestFocus();
            return;
            }
            login();
        }
    }//GEN-LAST:event_pswLozinkaKeyPressed

    private void pswLozinkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswLozinkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswLozinkaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

 

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        
  
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ball.png" )));

    }
}
