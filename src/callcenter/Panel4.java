package callcenter;


import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Valencia
 */
public class Panel4 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Panel1
     */
    public Panel4() {
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

        boton1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JLabel();
        boton3 = new javax.swing.JLabel();
        PanelContenido = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(null);
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(820, 400));
        setMinimumSize(new java.awt.Dimension(820, 400));
        setPreferredSize(new java.awt.Dimension(820, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/base11.png"))); // NOI18N
        boton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 170, -1));

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/base21.png"))); // NOI18N
        boton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton2MouseExited(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 170, -1));

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/base31.png"))); // NOI18N
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
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 170, -1));

        PanelContenido.setMaximumSize(new java.awt.Dimension(630, 430));
        PanelContenido.setMinimumSize(new java.awt.Dimension(630, 430));
        PanelContenido.setOpaque(false);
        getContentPane().add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -30, 630, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo1v2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(630, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(630, 400));
        jLabel2.setPreferredSize(new java.awt.Dimension(630, 400));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 640, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondopaneles.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 200, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseEntered
        // TODO add your handling code here:
        boton1.setIcon(new ImageIcon(getClass().getResource( "/recursos/base12.png" )));
    }//GEN-LAST:event_boton1MouseEntered

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        // TODO add your handling code here:
        boton1.setIcon(new ImageIcon(getClass().getResource( "/recursos/base11.png" )));
    }//GEN-LAST:event_boton1MouseExited

    private void boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseEntered
        // TODO add your handling code here:
        boton2.setIcon(new ImageIcon(getClass().getResource( "/recursos/base22.png" )));
    }//GEN-LAST:event_boton2MouseEntered

    private void boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseExited
        // TODO add your handling code here:
        boton2.setIcon(new ImageIcon(getClass().getResource( "/recursos/base21.png" )));
    }//GEN-LAST:event_boton2MouseExited

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        // TODO add your handling code here:
        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/base32.png" )));
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        // TODO add your handling code here:
        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/base31.png" )));
    }//GEN-LAST:event_boton3MouseExited

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        // TODO add your handling code here:
        Contenido41 p= new Contenido41();
        PanelContenido.add(p);
        p.setVisible(true);
        
        
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        // TODO add your handling code here:
        Contenido42 p= new Contenido42();
        PanelContenido.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        // TODO add your handling code here:
        Contenido43 p= new Contenido43();
        PanelContenido.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_boton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane PanelContenido;
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel boton2;
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
