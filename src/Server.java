
import Clases.Music;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariana Valencia
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Clases.Music m = new Music();
            m.reproduccion();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {

        }
//        SuperUsuario.Serial m= new SuperUsuario.Serial();
        callcenter.ServerMain m = new callcenter.ServerMain();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }

}
