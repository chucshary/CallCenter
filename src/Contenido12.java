
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
public class Contenido12 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Contenido11
     */
    public Contenido12() {
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
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        boton1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 190, 30));

        jPasswordField3.setBackground(new java.awt.Color(0, 51, 51));
        jPasswordField3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 190, 30));

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alta1.png"))); // NOI18N
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
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, -1));

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmar Contraseña:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, 30));

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 160, 30));

        jLabel4.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del empleado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 30));

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, 30));

        jTextField2.setBackground(new java.awt.Color(0, 51, 51));
        jTextField2.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 190, 30));

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
        boton1.setIcon(new ImageIcon(getClass().getResource( "alta2.png" )));
    }//GEN-LAST:event_boton1MouseEntered

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        // TODO add your handling code here:
        boton1.setIcon(new ImageIcon(getClass().getResource( "alta1.png" )));
    }//GEN-LAST:event_boton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
