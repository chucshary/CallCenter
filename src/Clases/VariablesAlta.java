/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Mariana Valencia
 */
public class VariablesAlta {
    
   public String base="", descripcion="";
    public int menuprincipal=0;
    
    
    public void altasbase()
    {
        String campos="";
        String valores="";
        String tabla="casos";
        
        EstructuraBD.conexion C= new EstructuraBD.conexion();
        C.busqueda_gral(tabla,"*");
        
        String par2=")";
        String par1="(";
        String aux="MAX"+par1+"id_casos"+par2+"AS id_casos";
        C.busqueda_gral(tabla,aux);
            
        
    }
}
