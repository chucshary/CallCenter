package callcenter;


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
public class Contenido43 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Contenido11
     */
    public Contenido43() {
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
        boton3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
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
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 190, 30));

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la base:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, 30));

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/continuar1.png"))); // NOI18N
        boton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        boton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton3MouseExited(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Submenu a modificar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 30));

        jTextField2.setBackground(new java.awt.Color(0, 51, 51));
        jTextField2.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("Submenu a modificar sin puntos. Ejemplo Menu 122 (base 1, menu 2, submenu 3)");
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo1v2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(630, 410));
        jLabel2.setMinimumSize(new java.awt.Dimension(630, 410));
        jLabel2.setPreferredSize(new java.awt.Dimension(630, 410));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        // TODO add your handling code here:
        
        //Si la base existe y el submenu
        ModificarBase m= new ModificarBase();
        m.show();
        
        //si no
        //mandar mensaje de que no existe x cosa
    }//GEN-LAST:event_boton3MouseClicked

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        // TODO add your handling code here:
        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/continuar2.png" )));
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        // TODO add your handling code here:

        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/continuar1.png" )));
    }//GEN-LAST:event_boton3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
