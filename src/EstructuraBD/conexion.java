package EstructuraBD;

import java.sql.*;

public class conexion {

    private int registros;
    private String registro_busqueda;

    Connection con = null;
    variablesBD vBD = new variablesBD();

    public conexion() {
        String bd, user, pass,ax;
        bd = vBD.baseDeDatos;
        user = vBD.usuarioMysql;
        pass = vBD.passMysql;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bd, user, pass);
            if (con != null) {
                System.out.println("Conectados");
            }
        } catch (Exception e) {
            System.out.println("Error en la conexion:\n" + e);
        }
    }

    public Connection conectar() {
        return con;
    }

    public void desconectar() {
        con = null;
    }
//    
//     public void mostrarReporte_ejemplo() {
//        try {
//            JasperReport reporte;
//            reporte = JasperCompileManager.compileReport("primerReporte.jrxml");
//            JasperPrint p = JasperFillManager.fillReport(reporte, null, con);
//            JasperViewer view = new JasperViewer(p, false);
//            view.setTitle("Primer Reporte");
//            view.setExtendedState(Frame.MAXIMIZED_BOTH);
//            view.setVisible(true);
//        } catch (JRException e) {
//        }
//        
//    }

    public void busqueda_serial() {
        try {
            PreparedStatement pstm = (PreparedStatement) conectar().prepareStatement("SELECT " + " serial " + " FROM superusuario;");
            ResultSet res = pstm.executeQuery();
            res.next();
            registro_busqueda = res.getString("serial");
            //Variables_globales.getSerialBD(registro_busqueda);
            res.close();
        } catch (Exception e) {
        }
    }

    public void busqueda_gral(String tabla, String campo) {
        try {
            PreparedStatement pstm = (PreparedStatement) conectar().prepareStatement("SELECT " + campo + " FROM " + tabla + ";");
            ResultSet res = pstm.executeQuery();
            res.next();
            registro_busqueda = res.getString(campo);
            res.close();
        } catch (Exception e) {

        }
    }

    public void agregar(String tabla, String campos, String valores) {
        String query = "INSERT INTO " + tabla;
        String[] camp = campos.split(",");
        int max = camp.length;

        query += campos(max, camp);
        query += valores(max);

        if (prepararEstados(query, valores)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public void actualizar(String tabla, String campos, String valores, String clausula) {
        String[] camp = campos.split(",");
        int max = camp.length;
        String c;
        String query = "UPDATE " + tabla + " SET ", aux = "";
        if (clausula == null) {
            c = "1";
        } else {
            c = clausula;
        }
        for (int i = 0; i < max; i++) {
            aux += camp[i] + "=?";
            if (i != max - 1) {
                aux += ",";
            }
        }
        query += aux + " WHERE " + c;

        if (prepararEstados(query, valores)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public void eliminar(String tabla, String clausula) {
        String query = "DELETE FROM " + tabla + " WHERE " + clausula;
        if (prepararEstados(query, null)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public boolean prepararEstados(String query, String values) {
        boolean r = true;
        String[] val = null;
        int max;
        if (values != null) {
            val = values.split(",");
            max = val.length;

            try {
                PreparedStatement pstm = (PreparedStatement) conectar().prepareStatement(query);
                for (int i = 0; i < max; i++) {
                    pstm.setString(i + 1, val[i]);
                }
                r = pstm.execute();
                System.out.println(pstm);
                pstm.close();
            } catch (Exception e) {
                System.out.println("Problemas de sincronizacion con la base de datos:\n " + e);
            }
        } else {
            try {
                PreparedStatement pstm = (PreparedStatement) conectar().prepareStatement(query);
                r = pstm.execute();
                pstm.close();
            } catch (Exception e) {
                System.out.println("PREPARAR ESTADOS. " + e);
            }
        }
        desconectar();
        return r;
    }

    private String campos(int max, String[] camp) {
        String str = "(";
        for (int i = 0; i < max; i++) {
            str += camp[i];
            if (i != max - 1) {
                str += ",";
            }
        }
        return str;
    }

    private String valores(int max) {
        String str = ") VALUES (";
        for (int i = 0; i < max; i++) {
            str += "?";
            if (i != max - 1) {
                str += ",";
            }
        }
        str += ")";
        return str;
    }
}
