package callcenter;

import Clases.VariablesCasos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Valencia
 */
public class ModificarBase extends javax.swing.JFrame {

    /**
     * Creates new form ModificarBase
     */
    
    public ModificarBase() {
        initComponents();
        setLocationRelativeTo(null);
        
        baset.setText(VariablesCasos.base);
        submenut.setText(VariablesCasos.submenu);
        EstructuraBD.conexion c= new EstructuraBD.conexion();
        texto1.setText(c.busquedaespecifica("menu", "descripcion", "idmenu="+VariablesCasos.submenu));
        texto2.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        baset = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submenut = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        boton3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la base:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 30));

        baset.setEditable(false);
        baset.setBackground(new java.awt.Color(0, 51, 51));
        baset.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        baset.setForeground(new java.awt.Color(255, 255, 255));
        baset.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(baset, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 190, 30));

        jLabel4.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Submenu a modificar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 30));

        submenut.setEditable(false);
        submenut.setBackground(new java.awt.Color(0, 51, 51));
        submenut.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        submenut.setForeground(new java.awt.Color(255, 255, 255));
        submenut.setToolTipText("Submenu a modificar sin puntos. Ejemplo Menu 122 (base 1, menu 2, submenu 3)");
        submenut.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(submenut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 180, 30));

        jScrollPane2.setBackground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        texto2.setBackground(new java.awt.Color(0, 51, 51));
        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setRows(5);
        jScrollPane2.setViewportView(texto2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 270, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        texto1.setEditable(false);
        texto1.setBackground(new java.awt.Color(0, 51, 51));
        texto1.setColumns(20);
        texto1.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        texto1.setForeground(new java.awt.Color(255, 255, 255));
        texto1.setRows(5);
        jScrollPane1.setViewportView(texto1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 250, -1));

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
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Texto nuevo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Texto anterior");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo1v2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(630, 410));
        jLabel2.setMinimumSize(new java.awt.Dimension(630, 410));
        jLabel2.setPreferredSize(new java.awt.Dimension(630, 410));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        // TODO add your handling code here:
        
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(0,51,51));
        UI.put("Panel.background",new ColorUIResource(0,51,51));
        String titulo, mensaje;
        if(texto2.getText().length()!=0)
        {
            EstructuraBD.conexion c= new EstructuraBD.conexion();
        try
        {
            c.actualizar("menu","descripcion","'"+texto2.getText()+"'" , "idmenu="+submenut.getText());
            titulo="Confirmacion!";
            mensaje="<html><font color=#FFFFFF>Submenu "+submenut.getText()+" actualizado!.";
        }
        catch (Exception e)
        {
            titulo="Error!";
            mensaje="<html><font color=#FFFFFF>No se ha podido realizar la actualizacion!.";
            
        }
        JOptionPane.showMessageDialog(null,mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
        this.hide();
        
        }
        else
        {
             titulo="Campos vacios!";
            mensaje="<html><font color=#FFFFFF>Debe colocar el nuevo texto del submenu.";
            texto2.setFocusable(true);
            JOptionPane.showMessageDialog(null,mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_boton3MouseClicked

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        // TODO add your handling code here:
        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/continuar2.png" )));
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        // TODO add your handling code here:

        boton3.setIcon(new ImageIcon(getClass().getResource( "/recursos/continuar1.png" )));
    }//GEN-LAST:event_boton3MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baset;
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField submenut;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    // End of variables declaration//GEN-END:variables
}
