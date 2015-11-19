package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin10_1 {

    
    public static void main(String[] args) {
     
      Xogo xogo1=new Xogo();
      
      int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 50"));
      
      xogo1.adivinaNumero(num);
     
    }
    
}
