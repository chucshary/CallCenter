/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;


import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Shary
 */
public class Reporte {

    Connection conn = null;

    public Reporte() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "softshary");
//            if (conn != null) {
//                System.out.println("Conectado a base de datos matriz");
//            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

    }

    public void mostrarReporte() {
        try {
            JasperReport reporte;
            reporte = JasperCompileManager.compileReport("primerReporte.jrxml");
            JasperPrint p = JasperFillManager.fillReport(reporte, null, conn);
            JasperViewer view = new JasperViewer(p, false);
            view.setTitle("Primer Reporte");
            view.setSize(500, 500);
            view.setLocationRelativeTo(null);
            view.setVisible(true);

            //            JasperPrint reporte_view;
//            URL in = this.getClass().getResource("primerReporte.jasper");
//            reporte = (JasperReport) JRLoader.loadObject(in);
//            reporte_view = JasperFillManager.fillReport(reporte, new HashMap(), conn);
//            JasperViewer.viewReport(reporte_view);
        } catch (JRException | HeadlessException e) {
        }
    }
}
