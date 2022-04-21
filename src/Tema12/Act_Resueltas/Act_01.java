package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.1
 * Implementar un método genérico estático que realice la inserción de un objeto al final de una tabla, ambos del mismo
 * tipo genérico, que se pasan como parámetro.
 * Devuelve una nueva tabla con el resultado de la inserción.
 */

import java.util.Arrays;

public class Act_01 {
    public static void main(String[] args) {
        String[] cadenas = new String[0];
        System.out.println(Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas);
        cadenas = guardar("avión", cadenas);
        System.out.println(Arrays.toString(cadenas));
    }

    static <E> E[] guardar (E elem, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
}
