package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.11
 * Utilizando la clase Contenedor definida en la actividad resuelta 12.2, implementa una aplicación donde se guardan
 * 30 enteros aleatorios entre 1 y 10 y luego se ordenan de menor a mayor.
 * La aplicación debe mostrar el contenedor antes y después de ordenar.
 */

import Tema12.Act_Resueltas.Act_02.Contenedor;
import Utilidades.Valores;

public class Act_11 {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        for (int i = 0; i < 30; i++) {
            c.insertarAlFinal(Valores.generarAleatorio(1, 10));
        }
        System.out.println("Sin ordenar: " + c);

        c.ordenar();
        System.out.println("Ordenado: " + c);
    }
}
