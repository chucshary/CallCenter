/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperUsuario;

import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author Lee
 */
public class Hilo_actulizar implements Runnable{
    private JList listas_administradores;
    private JFrame ventana;
    
    public Hilo_actulizar(JList lista, JFrame frame){
        this.listas_administradores=lista;
        this.ventana=frame;
    }
    public void run() {     
        //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
        
        while(ventana.isVisible())
        {
            new Base_de_datos_metodos().administradores_lista(listas_administradores);
            try{Thread.sleep( 500 );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado        
        }
    }
}
