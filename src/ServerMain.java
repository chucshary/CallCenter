
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Valencia
 */
public class ServerMain extends javax.swing.JFrame {

    /**
     * Creates new form ServerMain
     */
   


    public ServerMain() {
     
        initComponents();
        setLocationRelativeTo(null);
        Date dia = new Date(System.currentTimeMillis()); 
        fecha.setText(dia.getDay() + "/" +dia.getMonth() + "/"+dia.getYear());
        hora.setVisible(false);
}


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pestana1 = new javax.swing.JLabel();
        Pestana2 = new javax.swing.JLabel();
        Pestana3 = new javax.swing.JLabel();
        Pestana5 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        tapa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(817, 519));
        setMinimumSize(new java.awt.Dimension(817, 519));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(817, 519));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pestana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P1.png"))); // NOI18N
        Pestana1.setToolTipText("");
        Pestana1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pestana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pestana1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pestana1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pestana1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pestana1MouseExited(evt);
            }
        });
        getContentPane().add(Pestana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, 43));

        Pestana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P2.png"))); // NOI18N
        Pestana2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pestana2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pestana2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pestana2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pestana2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pestana2MouseExited(evt);
            }
        });
        getContentPane().add(Pestana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, -1));

        Pestana3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P3.png"))); // NOI18N
        Pestana3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pestana3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pestana3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pestana3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pestana3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pestana3MouseExited(evt);
            }
        });
        getContentPane().add(Pestana3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 180, -1));

        Pestana5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P5.png"))); // NOI18N
        Pestana5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pestana5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pestana5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pestana5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pestana5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pestana5MouseExited(evt);
            }
        });
        getContentPane().add(Pestana5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 180, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x2.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 110, 30));

        tapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo paneles.png"))); // NOI18N
        tapa.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Courier New", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(tapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tapa2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 640, 50));

        PanelBotones.setMaximumSize(new java.awt.Dimension(820, 400));
        PanelBotones.setMinimumSize(new java.awt.Dimension(820, 400));
        PanelBotones.setOpaque(false);
        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 810, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 832, 420));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logito.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        hora.setBackground(new java.awt.Color(255, 255, 255));
        hora.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("\"\"");
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 20));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("\"\"");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo1v2.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(832, 520));
        jLabel1.setMinimumSize(new java.awt.Dimension(832, 520));
        jLabel1.setPreferredSize(new java.awt.Dimension(832, 520));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pestana1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana1MouseEntered
        // TODO add your handling code here:
        
        Pestana1.setIcon(new ImageIcon(getClass().getResource( "pestaña1.png" )));
    }//GEN-LAST:event_Pestana1MouseEntered

    private void Pestana1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana1MouseExited
        // TODO add your handling code here:
        Pestana1.setIcon(new ImageIcon(getClass().getResource( "P1.png" )));
    }//GEN-LAST:event_Pestana1MouseExited

    private void Pestana2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana2MouseEntered
        // TODO add your handling code here:
        Pestana2.setIcon(new ImageIcon(getClass().getResource( "pestaña2.png" )));
    }//GEN-LAST:event_Pestana2MouseEntered

    private void Pestana2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana2MouseExited
        // TODO add your handling code here:
        Pestana2.setIcon(new ImageIcon(getClass().getResource( "P2.png" )));
    }//GEN-LAST:event_Pestana2MouseExited

    private void Pestana3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana3MouseEntered
        // TODO add your handling code here:
        Pestana3.setIcon(new ImageIcon(getClass().getResource( "pestaña3.png" )));
    }//GEN-LAST:event_Pestana3MouseEntered

    private void Pestana3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana3MouseExited
        // TODO add your handling code here:
        Pestana3.setIcon(new ImageIcon(getClass().getResource( "P3.png" )));
    }//GEN-LAST:event_Pestana3MouseExited

    private void Pestana5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana5MouseEntered
        // TODO add your handling code here:
        Pestana5.setIcon(new ImageIcon(getClass().getResource( "pestaña5.png" )));
    }//GEN-LAST:event_Pestana5MouseEntered

    private void Pestana5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana5MouseExited
        // TODO add your handling code here:
        Pestana5.setIcon(new ImageIcon(getClass().getResource( "P5.png" )));
        
    }//GEN-LAST:event_Pestana5MouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setIcon(new ImageIcon(getClass().getResource( "x1.png" )));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setIcon(new ImageIcon(getClass().getResource( "x2.png" )));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setIcon(new ImageIcon(getClass().getResource( "5.png" )));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setIcon(new ImageIcon(getClass().getResource( "6.png" )));
    }//GEN-LAST:event_logoutMouseExited

    private void Pestana1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana1MouseClicked
        // TODO add your handling code here:
        Panel1 p1= new Panel1();
        PanelBotones.add(p1);
        p1.setVisible(true);
    }//GEN-LAST:event_Pestana1MouseClicked

    private void Pestana2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana2MouseClicked
        // TODO add your handling code here:
        Panel2 p2= new Panel2();
        PanelBotones.add(p2);
        p2.setVisible(true);
    }//GEN-LAST:event_Pestana2MouseClicked

    private void Pestana3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana3MouseClicked
        // TODO add your handling code here:
         Panel3 p3= new Panel3();
        PanelBotones.add(p3);
        p3.setVisible(true);
    }//GEN-LAST:event_Pestana3MouseClicked

    private void Pestana5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestana5MouseClicked
        // TODO add your handling code here:
        Panel4 p4= new Panel4();
        PanelBotones.add(p4);
        p4.setVisible(true);
    }//GEN-LAST:event_Pestana5MouseClicked

   
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
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ServerMain().setVisible(true);
                
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelBotones;
    private javax.swing.JLabel Pestana1;
    private javax.swing.JLabel Pestana2;
    private javax.swing.JLabel Pestana3;
    private javax.swing.JLabel Pestana5;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel tapa;
    // End of variables declaration//GEN-END:variables
}
