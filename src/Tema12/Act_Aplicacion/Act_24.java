package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.24
 * Implementa una función a la que se le pasen dos listas de enteros ordenadas en sentido creciente y nos devuelva una
 * única lista, también ordenada, fusión (sin elementos repetidos) de las dos anteriores.
 * Desarrolla el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros de entrada se
 * mantengan intactas.
 */

import java.util.Set;
import java.util.TreeSet;

public class Act_24 {
    public static void main(String[] args) {
        Set<Integer> listaEnteros1 = new TreeSet<>();
        Set<Integer> listaEnteros2 = new TreeSet<>();
        Set<Integer> listaFusion = new TreeSet<>();

        listaEnteros1.add(10);
        listaEnteros1.add(20);
        listaEnteros1.add(30);
        listaEnteros1.add(40);

        listaEnteros2.add(5);
        listaEnteros2.add(15);
        listaEnteros2.add(25);
        listaEnteros2.add(35);

        listaFusion = fusionar(listaEnteros1, listaEnteros2);

        System.out.println("Lista 1: " + listaEnteros1);
        System.out.println("Lista 2: " + listaEnteros2);
        System.out.println("Listas fusionadas: " + listaFusion);
    }

    public static <E> Set<E> fusionar(Set<E> lista1, Set<E> lista2) {
        Set<E> listaFusion = new TreeSet<>(lista1);
        listaFusion.addAll(lista2);
        return listaFusion;
    }
}
