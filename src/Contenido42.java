
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Valencia
 */
public class Contenido42 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Contenido11
     */
    public Contenido42() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boton1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(630, 430));
        setMinimumSize(new java.awt.Dimension(630, 430));
        setPreferredSize(new java.awt.Dimension(630, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de base:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 250, 30));

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baja1.png"))); // NOI18N
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton1MouseExited(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo1v2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(630, 410));
        jLabel2.setMinimumSize(new java.awt.Dimension(630, 410));
        jLabel2.setPreferredSize(new java.awt.Dimension(630, 410));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1MouseClicked

    private void boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseEntered
        // TODO add your handling code here:
        boton1.setIcon(new ImageIcon(getClass().getResource( "baja2.png" )));
    }//GEN-LAST:event_boton1MouseEntered

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        // TODO add your handling code here:
        boton1.setIcon(new ImageIcon(getClass().getResource( "baja1.png" )));
    }//GEN-LAST:event_boton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}