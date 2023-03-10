/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nogometnastatistika.view;

import javax.swing.JOptionPane;
import nogometnastatistika.controller.ObradaOperater;
import nogometnastatistika.util.HibernateUtil;
import org.hibernate.Session;


/**
 *
 * @author Marko
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        ucitaj();
    }
    private void ucitaj(){
        new Ucitanje().start();
        
    }
    
    private class Ucitanje extends Thread{

        @Override
        public void run() {
            Session s = HibernateUtil.getSession();
            if(!s.getMetamodel().getEntities().isEmpty()){
                ObradaOperater op = new ObradaOperater();
                if(op.read().isEmpty()){
                    op.unosAdminOperatera();
                           
                }
                new ProzorLogin().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(getRootPane(), "Problem s bazom podataka");
            }
            
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        JLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NogometnaStatistika.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    // End of variables declaration//GEN-END:variables
}
