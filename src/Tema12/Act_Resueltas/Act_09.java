package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.9
 * Crear una lista de números enteros positivos introducidos por consola hasta que se introduzca uno negativo.
 * A continuación recorrer la lista y mostrar por pantalla los índices de los elementos de valor par, que será
 * multiplicado por 100.
 */

import Utilidades.Teclado;

import java.util.ArrayList;
import java.util.List;

public class Act_09 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer n = Teclado.getNumber("Introducir número: ");

        while (n >= 0) {
            lista.add(n);
            n = Teclado.getNumber("Introducir número: ");
        }
        System.out.println(lista);

        System.out.print("Índices de valores pares: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.println(i + " ");
                lista.set(i, lista.get(i) * 100);
            }
        }
        System.out.println("");
        System.out.println(lista);
    }
}
