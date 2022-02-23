package Tema9.Act_Ampliacion.Act_36;

/* ACTIVIDAD DE AMPLIACIÓN 9.36
 * Escribir la interfaz Funcion con un único método abstracto: double aplicar(double).
 * Implementar en la clase Main el método: static double[] funcionTabla(double[] t, Funcion f)
 * al que se le pasa una tabla de números reales y un objeto cuya clase implementa la interfaz Funcion.
 * Devolverá una nueva tabla cuyos elementos son el resultado de aplicar el método aplicar(), que se haya definido en f,
 * a cada uno de los elementos de la tabla original.
 * Utilizar funcionTabla() para calcular la raíz cuadrada de los elementos de una tabla de números reales.
 */

import Utilidades.Vectores;

import java.util.Arrays;

public class PP36 {
    public static void main (String[] args) {
        double[] tabla1 = new double[5];
        double[] tabla2;
        Vectores.rellenarVector(tabla1, 1.0, 999.0);

        System.out.println(Arrays.toString(tabla1));

        tabla2 = funcionTabla(tabla1, new ClaseFuncion());

        System.out.println(Arrays.toString(tabla2));
    }

    static double[] funcionTabla(double[] tabla, Funcion funcion) {
        double[] resultado = new double[tabla.length];
        int i;
        for (i = 0; i < tabla.length; i++) {
            resultado[i] = funcion.aplicar(tabla[i]);
        }
        return resultado;
    }
}
