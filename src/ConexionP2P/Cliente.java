/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionP2P;

import java.net.Socket;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Shary
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            Socket w = new Socket("localhost", 4000);
            PrintStream envio = new PrintStream(w.getOutputStream());
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el path del archivo a enviar: ");
            String path = s.nextLine();
            FileInputStream origen = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = origen.read(buffer)) > 0) {
                envio.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
