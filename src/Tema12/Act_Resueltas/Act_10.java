package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.10
 * Insertar en una lista 20 enteros aleatorios entre 1 y 10.
 * A partir de ella, crear un conjunto con los elementos de la lista sin repetir, otro con los repetidos y otros con los
 * elementos que aparecen una sola vez en la lista original.
 */

import Utilidades.Valores;

import java.util.*;

public class Act_10 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(Valores.generarAleatorio(1, 10));
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println("Lista original: " + lista + "\n");

        Set<Integer> sinRepeticiones = new TreeSet<>();
        sinRepeticiones.addAll(lista);
        System.out.println("Lista sin repeticiones: " + sinRepeticiones + "\n");

        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e : sinRepeticiones) {
            lista.remove(e);
        }
        repetidos.addAll(lista);
        System.out.println("Lista de repetidos: " + repetidos);

        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(repetidos);
        System.out.println("Lista de elementos no repetidos: " + unicos);
    }
}
