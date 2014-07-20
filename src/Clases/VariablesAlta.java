/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana Valencia
 */
public class VariablesAlta {
    
   public String base="", descripcion="";
    public int menuprincipal=0;
    
    
    public void altasbase()
    {
        String campos="id_caso,nombre,numeromenus,descripcion";
        String tabla="casos";
        int id=1;
        EstructuraBD.conexion C= new EstructuraBD.conexion();
        C.registro_busqueda="";
        C.busqueda_gral(tabla,"id_caso");
        if(C.registro_busqueda.length()!=0)
        {
        C.registro_busqueda="";
        C.busquedaalta1(tabla,"id_caso");
        id=Integer.parseInt(C.registro_busqueda);
        id=id+1;
        }
        
        String valores=Integer.toString(id)+","+base+","+menuprincipal+","+descripcion;
        C.agregar(tabla, campos, valores);
    }
}
