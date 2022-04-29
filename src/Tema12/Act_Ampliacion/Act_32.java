package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.32
 * Implementa la función
 *      static <E> List<E> clonaLista(List<E>)
 * que realice una copia exacta de una lista.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.List;

public class Act_32 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();
        List<Integer> copia = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            original.add(Valores.generarAleatorio(1, 5));
        }
        System.out.println("Lista original: " + original);

        copia = clonaLista(original);
        System.out.println("Lista clonada: " + copia);
    }

    public static <E> List<E> clonaLista(List<E> lista) {
        return new ArrayList<>(lista);
    }
}
