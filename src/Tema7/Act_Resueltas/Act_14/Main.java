package Tema7.Act_Resueltas.Act_14;

/* EJERCICIO RESUELTO 7.14.
 * Implementa el método no estático void insertarFinal(int nuevo) que inserta un número entero al final de tablaEnteros[],
 * que es un atributo no estático de la clase Main. Escribir un programa que inicialice la tabla con los números del
 * 1 al 10 y después la muestre por consola.
 */

import java.util.Arrays;

public class Main {
    int[] tablaEnteros = new int[0];

    public static void main (String[] args) {
        Main m = new Main();
        for (int i = 0; i < 10; i++) {
            m.insertarFinal(i + 1);
        }
        System.out.println("Tabla: " + Arrays.toString(m.tablaEnteros));
    }

    void insertarFinal(int nuevo) {
        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
        tablaEnteros[tablaEnteros.length - 1] = nuevo;
    }

}
