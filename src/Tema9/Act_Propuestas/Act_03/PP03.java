package Tema9.Act_Propuestas.Act_03;

/* ACTIVIDAD 9.3
 * Verifica que, para comparar números enteros, son equivalentes las dos implementaciones propuestas con los id de los
 * socios.
 */

import Tema9.Act_Resueltas.Act_07.Socio;

public class PP03 {
    public static void main (String[] args) {
        Socio socio1 = new Socio(2, "Rosa Marín", "10-03-1996");
        Socio socio2 = new Socio(4, "Ana Guerra", "25-11-2001");

        System.out.println(socio1.compareTo(socio2));
        System.out.println(socio1.compareToTwo(socio2));
    }
}
