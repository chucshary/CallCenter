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
        try
                {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                 
                }
        
        callcenter.ServerMain m= new callcenter.ServerMain();
        m.show();
        
    }
    
}
