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
        MetodosConexion.RespuestaResultado metodo=new MetodosConexion.RespuestaResultado();
        String accion = "";
        String [] opciones = metodo.inicio();
        int tiempo=700;
        try {
            while (!socket.isClosed()) {
                if(!bandera_datos_clientes){
                    envio.writeUTF(opciones[0]);
                    sleep(tiempo);
                    bandera_datos_clientes=true;
                }
                else{
                    accion=recibo.readUTF();
                    opciones = metodo.respuesta(Integer.valueOf(accion));
                    envio.writeUTF(opciones[0]);
                    envio2.writeUTF(opciones[1]);
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
