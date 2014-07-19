/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperUsuario;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author Lee
 */
public class Base_de_datos_metodos {
   Conector con;
   public Base_de_datos_metodos(){
   con = new Conector();
   }
   
   
   public int serial(){
       int serial2=0;
        try{
           PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("SELECT " + " serial " + " FROM superusuario");
           ResultSet res = pstm.executeQuery();
           res.next();
           serial2 = res.getInt("serial");
           res.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return serial2;
   }
   
   public String serial_code(){
       String serial="";
       try{
           PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("SELECT " + " serial_code " + " FROM superusuario");
           ResultSet res = pstm.executeQuery();
           res.next();
           serial = res.getString("serial_code");
           res.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return serial;
   }
   
   public void superusuario(String name, String password){
       String serial_codigo=serial_code();
       try{
           PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("UPDATE superusuario SET nombre_su=?, password_su=? WHERE serial_code=? ");
           pstm.setString(1, name);
           pstm.setString(2, password);
           pstm.setString(3, serial_codigo);
           pstm.executeQuery();
           pstm.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
   }
   
   public boolean usuarioexiste(int tipo, String usu){
        int row=0;
        String tipo_usu="",usu_tipo="";
        if(tipo==0){
            tipo_usu="supervidores";
            usu_tipo="nombre_supervisor";
        }else{
            tipo_usu="administradores";
            usu_tipo="nombre_admin";
        }
        try{
            PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("SELECT * FROM " + tipo_usu + " WHERE " + usu_tipo + "=? ");
            pstm.setString(1, usu);
            ResultSet res = pstm.executeQuery(); 
            res.getRow();
            res.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(row==0){
           return true;
       }
       else{
           return false;
       }
   }
   public boolean administradores(){
       int row=0;
       try{
           PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("SELECT * FROM administradores");
           ResultSet res = pstm.executeQuery();
           row=res.getRow();
           res.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       if(row==0){
           return true;
       }
       else{
           return false;
       }
   }
    public boolean log(int tipo, String usu, int pass){
        int row=0;
        String tipo_usu="",usu_tipo="",pass_tipo="";
        if(tipo==0){
            tipo_usu="supervidores";
            usu_tipo="nombre_supervisor";
            pass_tipo="password_supervisor";
        }else{
            tipo_usu="administradores";
            usu_tipo="nombre_admin";
            pass_tipo="password_admin";
        }
        try{
            PreparedStatement pstm = (PreparedStatement)con.getConnection().prepareStatement("SELECT * FROM " + tipo_usu + " WHERE " + usu_tipo + "=? AND " + pass_tipo + "=? ");
            pstm.setString(1, usu);
            pstm.setInt(2, pass);
            ResultSet res = pstm.executeQuery(); 
            res.getRow();
            res.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(row==1){
           return true;
       }
       else{
           return false;
       }
   }
}
