package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.19
 * Escribe un programa donde se introduzca por consola una frase que conste exclusivamente de palabras separadas por
 * espacios.
 * Las palabras de la frase se almacenarán en una lista.
 * Finalmente, se mostrarán por pantalla las palabras que estén repetidas y, a continuación, las que no lo estén.
 */

import java.util.*;

public class Act_19 {
    public static void main(String[] args) {
        String frase = "Hola mi nombre es un nombre bastante largo y bonito pero un nombre también bastante común";
        String[] palabras = frase.split(" ");

        List<String> listaOriginal = new ArrayList<>(Arrays.asList(palabras));
        List<String> listaRepetidos = new ArrayList<>(listaOriginal);
        Set<String> listaNoRepetidos = new HashSet<>();

        System.out.println("Original: " + listaOriginal);

        for (String palabra : listaOriginal) {
            if (listaNoRepetidos.contains(palabra)) {
                listaNoRepetidos.remove(palabra);
            } else {
                listaNoRepetidos.add(palabra);
                listaRepetidos.remove(palabra);
            }
        }

        System.out.println("No Repetidos: " + listaNoRepetidos);
        System.out.println("Repetidos: " + listaRepetidos);
    }
}
