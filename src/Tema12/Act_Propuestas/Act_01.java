package Tema12.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 12.1
 * Implementa un método genérico estático al que se le pasan como parámetro dos tablas con elementos del mismo tipo
 * genérico y devuelve una nueva tabla con los elementos de ambas concatenados (los de la segunda después de los de
 * la primera).
 */

import java.util.Arrays;

public class Act_01 {
    public static void main(String[] args) {
        Integer[] tabla1 = {1, 2, 3, 4, 5};
        Integer[] tabla2 = {6, 7, 8, 9, 10};
        Integer[] tabla3 = concatenar(tabla1, tabla2);
        System.out.println(Arrays.toString(tabla3));
    }

    static <E> E[] concatenar (E[] tabla1, E[] tabla2) {
        E[] nuevaTabla = tabla1;
        nuevaTabla = Arrays.copyOf(nuevaTabla, tabla1.length + tabla2.length);
        System.arraycopy(tabla2, 0, nuevaTabla, tabla1.length, tabla2.length);
        return nuevaTabla;
    }
}
