package Tema13.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 13.2
 * Implementa el método estático "static <T, V> List<V> transformar(List<T> original, Function<T, V> f)" similar al de
 * la actividad resuelta 13.5, al que se pasa una lista de tipo T y devuelve otra de tipo V con los elementos de la primera
 * transformados mediante la función que va en el segundo parámetro.
 * Escribe un programa donde se usa este método para obtener una lista con las raíces cuadradas de los elementos de otra.
 * Observa que la segunda lista se puede crear dentro del método, a diferencia de lo que pasaba con las tablas.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PrincipalPropuesta_13_2 {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaEnteros.add(Valores.generarAleatorio(1, 100));
        }
        List<Double> raicesCuadradas = transformar(listaEnteros, y -> Math.sqrt(y));
        System.out.println(raicesCuadradas);
    }

    static <T, V> List<V> transformar(List<T> original, Function<T, V> f) {
        List<V> transf = new ArrayList<>();
        for (T t : original) {
            transf.add(f.apply(t));
        }
        return transf;
    }
}
