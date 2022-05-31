package Tema13.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 13.1
 * Implementa un método estático al que se pasa como parámetro una lista de tipo genérico y un predicado.
 * El método devuelve otra lista con los elementos de la lista original que verifiquen la condición del predicado.
 * Aplicarlo a una lista de 50 enteros entre 1 y 100, que devuelva los múltiplos de 3.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class PrincipalPropuesta_13_1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            lista.add(Valores.generarAleatorio(1, 100));
        }
        Set<Integer> listaOrdenada = new TreeSet<>(lista);
        lista = new ArrayList<>(listaOrdenada);

        List<Integer> mult3 = filtrar(lista, e -> e % 3 == 0);
        System.out.println("Original: " + lista);
        System.out.println("Múltiplos de 3: " + mult3);
    }

    static <T> List<T> filtrar(List<T> original, Predicate<T> p) {
        List<T> filtrada = new ArrayList<>();
        for (T t : original) {
            if (p.test(t)) {
                filtrada.add(t);
            }
        }
        return filtrada;
    }
}
