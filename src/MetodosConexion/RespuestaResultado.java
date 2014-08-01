/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MetodosConexion;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mariana Valencia
 */

//mientras no se acaben los menus
public class RespuestaResultado {
    
    public String [] respuesta(int opcion)
    {
        String [] respuestas= new String [2];
        EstructuraBD.conexion c = new EstructuraBD.conexion();
        String respuesta;
        respuesta = c.busquedaespecifica("menu","descripcion", "idmenu="+opcion);
        String opciones=c.busquedaespecifica("menu", "numero_opciones", "idmenu="+opcion);
        if(opciones==null||respuesta==null)
        {
        respuestas[0]="Estamos presentando problemas con el servidor. intente llamar mas tarde";
        respuestas[1]="0";
        }
        else
        {
        respuestas[0]=respuesta;
        respuestas[1]=opciones;
        }
        return respuestas;
        
    }
    
        public String [] respuestacaso(int opcion)
    {
        String [] respuestas= new String [2];
        EstructuraBD.conexion c = new EstructuraBD.conexion();
        String respuesta;
        respuesta = c.busquedaespecifica("caso","descripcion", "idmenu="+opcion);
        String opciones=c.busquedaespecifica("caso", "numeromenus", "idmenu="+opcion);
        if(opciones==null||respuesta==null)
        {
        respuestas[0]="Estamos presentando problemas con el servidor. intente llamar mas tarde";
        respuestas[1]="0";
        }
        else
        {
        respuestas[0]=respuesta;
        respuestas[1]=opciones;
        }
        return respuestas;
        
    }
    
    //Al empezar la comunicacion el servidor envia el primer menu
    
    public String [] inicio () 
    {
        String [] respuestas= new String [2];
        EstructuraBD.conexion c = new EstructuraBD.conexion();
        String respuesta="Bienvenidoacallcenter. ";
        String opciones;
        ResultSet resultado;
        
        try
        {
            resultado = c.busquedacasos("caso","nombre");
        
        int i=0;
        while (resultado.next())
        {
            i++;
            respuesta=respuesta+"Para "+resultado.getString(0)+"marque"+i;
            resultado.next();
        }
        respuestas[0]=respuesta;
        respuestas[1]=Integer.toString(i);
        return respuestas;
       }
        
        catch (SQLException e)
        {
            respuestas[0]="Estamos presentando problemas con el servidor. intente llamar mas tarde";
            respuestas[1]="0";
            return respuestas;
            
        }
        
    }
    
    
    
    
    //Donde se ingresan los datos del cliente a la base de datos
    public void fin(int idmenu, String nombrecliente, String contacto, String resultado, String comentario)
    {
        EstructuraBD.conexion c = new EstructuraBD.conexion();
        String valores="0"+","+"'"+nombrecliente+"','"+contacto+"',"+idmenu+",'"+resultado+"','"+comentario+"'";
        c.agregar("consultante", "id_consultante, nombre_consultante, telefono_consultante, id_caso, resultado, comentario", valores);
    }
    
    
    
    
    
    
    
}
