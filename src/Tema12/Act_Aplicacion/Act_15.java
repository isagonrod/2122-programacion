package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.15
 * Implementa un método genérico al que se le pasa una lista de valores de la clase genérica T y devuelve otra donde
 * se han eliminado las repeticiones.
 */

import Utilidades.Valores;

import java.util.*;

public class Act_15 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(Valores.generarAleatorio(1, 5));
        }
        System.out.println("Lista original: " + lista);
        lista = sinRepeticiones(lista);
        System.out.println("Lista sin repeticiones: " + lista);
    }

    public static List<Integer> sinRepeticiones(List<Integer> lista) {
        Set<Integer> conjunto = new HashSet<>((List)lista);
        List<Integer> lista2 = new ArrayList<>((Set)conjunto);
        return lista2;
    }
}
