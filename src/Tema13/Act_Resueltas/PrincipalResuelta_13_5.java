package Tema13.Act_Resueltas;

/* ACTIVIDAD RESUELTA 13.5
 * Implementar el método estático "static <T, V> V[] transformar(T[] original, V[] transf, Function<T, V> t)" al que se
 * pasan dos tablas de tipo T y V respectivamente, y devuelve la segunda tabla con los elementos de la primera transformados
 * mediante la función que va en el tercer parámetro.
 * Escribir un programa donde se usa este método para obtener uan tabla con las raíces cuadradas de los elementos de otra.
 */

import Utilidades.Valores;

import java.util.Arrays;
import java.util.function.Function;

public class PrincipalResuelta_13_5 {
    public static void main(String[] args) {
        Integer[] tablaEnt = new Integer[20];
        for (int i = 0; i < tablaEnt.length; i++) {
            tablaEnt[i] = Valores.generarAleatorio(1, 100);
        }
        Double[] tablaR = transformar(tablaEnt, new Double[0], y -> Math.sqrt(y));
        System.out.println(Arrays.toString(tablaR));
    }

    static <T, V> V[] transformar(T[] original, V[] transf, Function<T, V> f) {
        transf = Arrays.copyOf(transf, original.length);
        for (int i = 0; i < original.length; i++) {
            transf[i] = f.apply(original[i]);
        }
        return transf;
    }
}
