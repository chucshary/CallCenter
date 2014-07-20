/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionP2P;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Shary
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor1 = new ServerSocket(4000);
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el path donde desea escribir el archivo: ");
            String path = s.nextLine();
            Socket w = servidor1.accept();
            InputStream llegada = w.getInputStream();
            FileOutputStream destino = new FileOutputStream(path);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = llegada.read(buffer)) > 0) {
                destino.write(buffer, 0, len);
            }
        } catch (IOException e) {
        }
    }

}
