package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.7
 * Repetir la actividad resuelta 12.6 usando métodos globales.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.Collection;

public class Act_07 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(Valores.generarAleatorio(1, 10));
        }
        System.out.println(lista);

        Collection<Integer> c = new ArrayList<>();
        c.add(5);
        lista.removeAll(c);
        System.out.println(lista);
    }
}
