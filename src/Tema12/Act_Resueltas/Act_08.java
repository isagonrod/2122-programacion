package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.8
 * Implementar un programa en el que se insertan 20 números aleatorios en una colección.
 * Esta se ordenará de menor a mayor convirtiéndola antes en tabla y volviéndola a convertir en colección.
 * Repetir el proceso para ordenarla de mayor a menor.
 */

import Utilidades.Teclado;
import Utilidades.Valores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Act_08 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(Valores.generarAleatorio(1, 10));
        }
        System.out.println("Lista original: " + lista);

        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);

        Collection<Integer> listaCreciente = new ArrayList<>();
        listaCreciente.addAll(Arrays.asList(tabla));
        System.out.println("Lista ordenada de menor a mayor: " + listaCreciente);

        Comparator<Integer> ordenDecreciente = new Comparator<>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
        };
        Comparator<Integer> ordenEnteros = Comparator.naturalOrder();
        ordenDecreciente = ordenEnteros.reversed();

        Arrays.sort(tabla, ordenDecreciente);

        Collection<Integer> listaDecreciente = new ArrayList<>();
        listaDecreciente.addAll(Arrays.asList(tabla));
        System.out.println("Lista ordenada de mayor a menor: " + listaDecreciente);
    }
}
