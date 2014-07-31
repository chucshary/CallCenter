/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexionSocket;

import java.io.*;
import java.net.*;
import java.util.logging.*;

public class Hilo_Servidor extends Thread {

    private Socket socket;
    private DataOutputStream envio;
    private DataOutputStream envio2;
    private DataInputStream recibo;
    private int idSession;
    public boolean bandera_datos_clientes=false;

    public Hilo_Servidor(Socket socket, int id) {
        this.socket = socket;
        this.idSession = id;
        try {
            envio = new DataOutputStream(socket.getOutputStream());
            envio2 = new DataOutputStream(socket.getOutputStream());
            recibo = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Hilo_Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Hilo_Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        String accion = "";
        int tiempo=700;
        try {
            while (!socket.isClosed()) {
                if(!bandera_datos_clientes){
                    envio.writeUTF("Bienvenido al call-center geek call");
                    sleep(tiempo);
                    envio.writeUTF("Es usted el cliente numero " + idSession + " del dia de hoy");
                    sleep(tiempo);
                    envio.writeUTF("Por favor de ingresar su nombre");
                    sleep(tiempo);
                    accion=recibo.readUTF();
                    while(accion.length()<3){
                        envio.writeUTF("Su nombre es muy corto especifique algun alias mas extenso");
                        sleep(tiempo);
                        accion=recibo.readUTF();
                    }
                    envio.writeUTF("Muchas Gracias");
                    sleep(tiempo);
                    envio.writeUTF("Por favor de ingresar su numero telefonico");
                    sleep(tiempo);
                    accion=recibo.readUTF();
                    while(accion.length()<10){
                        envio.writeUTF("Su telefono debe ser mayor a 10 digitos");
                        sleep(tiempo);
                        accion=recibo.readUTF();
                    }
                    envio.writeUTF("end");
                    bandera_datos_clientes=true;
                    //funcion de casos
                    String casos="";
                    String opciones="";
                    envio.writeUTF(casos);
                    envio2.writeUTF(opciones);
                }
                else{
                    accion=recibo.readUTF();
                    if(accion.equals("end")){
                        desconnectar();
                    }
                    //funcion de busqueda de solucion
                    String mensaje="";
                    String opciones="";
                    envio.writeUTF(mensaje);
                    envio2.writeUTF(opciones);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Hilo_Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InterruptedException ex) {
            Logger.getLogger(Hilo_Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconnectar();
    }
}
