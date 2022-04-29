package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.29
 * Añade a la clase Contenedor para tipos genéricos los métodos:
 *      - int[] buscarTodos (Object e): devuelve una tabla con los índices de todas las ocurrencias de e.
 *      - boolean eliminarTodos (Object e): elimina todas las ocurrencias de e. Devuelve true si la lista queda alterada.
 */

import Tema12.Act_Resueltas.Act_02.Contenedor;

import java.util.Arrays;

public class Act_29 {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5, 5, 6, 7};
        Contenedor<Integer> contenedorNumeros = new Contenedor<>(numeros);

		System.out.println("Tabla original: " + contenedorNumeros);
		System.out.println("Índices buscados: " + Arrays.toString(contenedorNumeros.buscarTodos(5)));
        System.out.println("Eliminados: " + contenedorNumeros.eliminarTodos(7));
		System.out.println("Tabla con elementos eliminados: " + contenedorNumeros);
    }
}
