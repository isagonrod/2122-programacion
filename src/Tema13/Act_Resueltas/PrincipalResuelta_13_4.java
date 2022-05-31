package Tema13.Act_Resueltas;

/* ACTIVIDAD RESUELTA 13.4
 * Implementar un método estático al que se pasa como parámetro una tabla de tipo genérico y un predicado.
 * El método devuelve otra tabla con los elementos de la tabla original que verifique la condición del predicado.
 * Aplicarlo a una tabla de 50 enteros entre 1 y 100, que devuelva los múltiplos de 3.
 */

import Utilidades.Valores;

import java.util.Arrays;
import java.util.function.Predicate;

public class PrincipalResuelta_13_4 {
    public static void main(String[] args) {
        Integer[] t = new Integer[50];
        for (int i = 0; i < t.length; i++) {
            t[i] = Valores.generarAleatorio(1, 100);
        }
        Arrays.sort(t);
        Integer[] mult3 = filtrar(t, e -> e % 3 == 0);
        System.out.println("Original: " + Arrays.toString(t));
        System.out.println("Múltiplos de 3: " + Arrays.toString(mult3));
    }

    static <T> T[] filtrar(T[] original, Predicate<T> p) {
        T[] filtrada = Arrays.copyOf(original, 0);
        for (T t : original) {
            if (p.test(t)) {
                filtrada = Arrays.copyOf(filtrada, filtrada.length + 1);
                filtrada[filtrada.length - 1] = t;
            }
        }
        return filtrada;
    }
}
