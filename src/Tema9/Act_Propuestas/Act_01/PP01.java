package Tema9.Act_Propuestas.Act_01;

/* ACTIVIDAD 9.1
 * Utilizando la lista anterior, escribe un programa en el que se apilen números enteros introducidos por teclado, hasta
 * que se introduzca uno negativo.
 * A continuación, desapílalos todos mientras se muestran por pantalla.
 */

import Tema9.Act_Resueltas.Act_01a04.Lista;
import Utilidades.Teclado;

public class PP01 {
    public static void main (String[] args) {
        Lista lista = new Lista();
        Integer num = Teclado.getNumber("Introduce número: ");

        while (num >= 0) {
            lista.apilar(num);
            num = Teclado.getNumber("Introduce número: ");
            System.out.println(lista);
        }
        num = lista.desapilar();
        while (num != null) {
            System.out.println(num + " ");
            num = lista.desapilar(); // TODO : No funciona el desapilar
        }
        System.out.println("");
    }
}
