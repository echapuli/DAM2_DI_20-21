/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dialog;

/**
 *
 * @author Eduardo
 */
public class VentanaSecundaria2 extends javax.swing.JDialog {

    /**
     * Creates new form VentanaSecundaria2
     */
    public VentanaSecundaria2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabelNumeroVentana2 = new javax.swing.JLabel();
        jButtonVolver2 = new javax.swing.JButton();
        jButtonAbrirVentana2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNumeroVentana2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelNumeroVentana2.setForeground(new java.awt.Color(255, 0, 51));
        jLabelNumeroVentana2.setText("Ventana 2");

        jButtonVolver2.setText("Volver");
        jButtonVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver2ActionPerformed(evt);
            }
        });

        jButtonAbrirVentana2.setText("Abrir Ventana");
        jButtonAbrirVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirVentana2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelNumeroVentana2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButtonAbrirVentana2)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonVolver2)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelNumeroVentana2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver2)
                    .addComponent(jButtonAbrirVentana2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButtonVolver2ActionPerformed

    private void jButtonAbrirVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirVentana2ActionPerformed
        VentanaSecundaria4 Ventana4=new VentanaSecundaria4(this,false);
        Ventana4.setModalityType(Dialog.ModalityType.MODELESS  );
        Ventana4.setVisible(true);
    }//GEN-LAST:event_jButtonAbrirVentana2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirVentana2;
    private javax.swing.JButton jButtonVolver2;
    private javax.swing.JLabel jLabelNumeroVentana2;
    // End of variables declaration//GEN-END:variables
}
