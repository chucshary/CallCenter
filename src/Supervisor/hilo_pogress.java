/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Supervisor;

/**
 *
 * @author Lee
 */
import javax.swing.JProgressBar;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class hilo_pogress implements Runnable{

    private JProgressBar jProgressBar;
    private int i = 1;
    private int value = 50;//retardo en milisegundos

    /**
 * Constructor de clase
 */
    public hilo_pogress( JProgressBar jProgressBar , int value )
    {
        this.jProgressBar = jProgressBar;
        this.value = value;
    }

    @Override
    public void run() {
        i=1;        
        //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
        while(i!=100)
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            jProgressBar.setValue(i);
            jProgressBar.repaint();
            i++;
            //retardo en milisegundos
            try{Thread.sleep( this.value );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado        
        }
        jProgressBar.setValue(0);
    }

}
