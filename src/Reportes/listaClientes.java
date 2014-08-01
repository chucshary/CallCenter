/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author Shary
 */
public class listaClientes {

    private String ip;
    private String nombre;
    private String telefono;
    private String id_caso;
    private String comentario;

    public listaClientes(String ip, String nombre, String telefono, String id_caso, String comentario) {
        this.ip = ip;
        this.nombre = nombre;
        this.telefono = telefono;
        this.id_caso = id_caso;
        this.comentario = comentario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId_caso() {
        return id_caso;
    }

    public void setId_caso(String id_caso) {
        this.id_caso = id_caso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    

}
