/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperUsuario;

/**
 *
 * @author Lee
 */
public class Variables_globales {
    public static Case_base ventana;

    /**
     * @return the ventana
     */
    public static Case_base getVentana() {
        return ventana;
    }

    /**
     * @param aVentana the ventana to set
     */
    public static void setVentana(Case_base aVentana) {
        ventana = aVentana;
    }
    
    private static String serialBD;

    /**
     * @return the serialBD
     */
    public static String getSerialBD() {
        return serialBD;
    }

    /**
     * @param aSerialBD the serialBD to set
     */
    public static void setSerialBD(String aSerialBD) {
        serialBD = aSerialBD;
    }

    public static void getSerialBD(String registro_busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
