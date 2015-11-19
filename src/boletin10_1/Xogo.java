package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Xogo {

    public void adivinaNumero(int num) {
        boolean respuesta = false;
        while (respuesta != true) {
            int res = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
            if(res<num){
                JOptionPane.showMessageDialog(null, "Es mayor");
            }
            if(res>num){
                  JOptionPane.showMessageDialog(null, "Es menor");
            }
            if (res == num) {
                respuesta = true;
                JOptionPane.showMessageDialog(null, "has acertado");
            }
        }
    }

}
