package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Xogo {

    public void adivinaNumero(int num, int numIntentos) {
        boolean respuesta = false;
        int cont = 0;
        while (respuesta != true) {
            if (cont == numIntentos) {
                JOptionPane.showMessageDialog(null, "Numero de intentos superado");
                respuesta = true;
                break;
            }
            int res = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
            if (res < num) {
                imprimir("Es mayor",0);
                imprimir("Es mayor",1);
            }
            if (res > num) {
                imprimir( "Es menor",0);
                imprimir("Es mayor",1);
            }
            if (res == num) {
                respuesta = true;
                JOptionPane.showMessageDialog(null, "has acertado");
            }
            cont++;
        }
    }
public void imprimir(String cadenaAImprimir,int opcion){

    switch (opcion){
        case 0:System.out.println(cadenaAImprimir);
            
        case 1: JOptionPane.showMessageDialog(null, cadenaAImprimir);
            
    }
}

}
