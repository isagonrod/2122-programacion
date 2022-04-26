package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.12
 * Añade a la clase Contenedor el método void ordenar (Comparator<T> c), que ordena los elementos del contenedor según
 * el criterio de c.
 */
/* ACTIVIDAD DE APLICACIÓN 12.13
 * Repite la actividad de aplicación 12.11 ordenando los números de mayor a menor.
 */
/* ACTIVIDAD DE APLICACIÓN 12.14
 * Añade a la clase Contenedor el método T get (int indice), que devuelve el elemento que ocupa el lugar indice dentro
 * del contenedor.
 */

import Tema12.Act_Resueltas.Act_02.Contenedor;
import Utilidades.Valores;

import java.util.Comparator;

public class Act_12a14 {
    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        for (int i = 0; i < 30; i++) {
            contenedor.insertarAlFinal(Valores.generarAleatorio(1, 10));
        }
        System.out.println("Sin ordenar: " + contenedor);

        contenedor.ordenar(Comparator.reverseOrder());
        System.out.println("Ordenado: " + contenedor);

        System.out.println("Índice: " + contenedor.get(1));
    }
}
