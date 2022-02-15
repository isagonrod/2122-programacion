package Tema9.Act_Resueltas.Act_01a04;

/* EJERCICIO 9.2
 * Utilizando la lista anterior, escribir un programa en el que se encolen números enteros introducidos por teclado,
 * hasta que se introduzca uno negativo.
 * A continuación, desencolarlos todos a medida que se muestran por pantalla.
 */

import Utilidades.Teclado;

public class PP2 {
    public static void main (String[] args) {
        Lista c = new Lista();
        Integer n = Teclado.getNumber("Introducir número: ");
        while (n >= 0) {
            c.encolar(n);
            n = Teclado.getNumber("Introducir número: ");
        }
        n = c.desencolar();
        while (n != null) {
            System.out.println(n + " ");
            n = c.desencolar(); //TODO : No funciona el desencolar
        }
        System.out.println("");
    }
}
