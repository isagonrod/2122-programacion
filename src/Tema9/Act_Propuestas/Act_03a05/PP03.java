package Tema9.Act_Propuestas.Act_03a05;

/* ACTIVIDAD 9.3
 * Verifica que, para comparar números enteros, son equivalentes las dos implementaciones propuestas con los id de los
 * socios.
 */
/* ACTIVIDAD 9.4
 * Crea e inicializa una tabla de socios, ordénala por orden alfabético de nombres y muéstrala por consola.
 */

import Tema9.Act_Resueltas.Act_07a10.Socio;

import java.util.Arrays;

public class PP03 {
    public static void main (String[] args) {
        Socio socio1 = new Socio(5,"Miguel Ruiz","23-12-1986");
        Socio socio2 = new Socio(6,"Isa González","10-12-1985");

        System.out.println(socio1.compareTo(socio2));

        Socio[] tabla = new Socio[] {
            new Socio(2, "Rosa Marín", "10-03-1996"),
            new Socio(4, "Ana Guerra", "25-11-2001"),
            new Socio(1, "Juan Ortega", "05-03-1999"),
            new Socio(3, "Manuel Abad", "01-08-1989"),};

        Arrays.sort(tabla);

        System.out.println(Arrays.deepToString(tabla));
    }
}
