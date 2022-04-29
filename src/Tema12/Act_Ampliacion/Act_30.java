package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.30
 * Implementa una función
 *      <T> List<T> eliminaRepetidos(List<T> lista)
 * a la que se pase una lista de objetos y devuelva una copia sin elementos repetidos.
 */

import Utilidades.Valores;

import java.util.*;

public class Act_30 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaSinRepetidos;

        for (int i = 0; i < 10; i++) {
            lista.add(Valores.generarAleatorio(1, 5));
        }
        System.out.println("Lista original: " + lista);

        listaSinRepetidos = eliminaRepetidos(lista);
        System.out.println("Lista sin repetidos: " + listaSinRepetidos);
    }

    public static <T> List<T> eliminaRepetidos(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        List<T> sinRepetidos = new ArrayList<>();
        sinRepetidos.addAll(conjunto);
        return sinRepetidos;
    }
}
