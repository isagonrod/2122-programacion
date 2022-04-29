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
		Comparator<String> comparator = Comparator.naturalOrder();
		System.out.println("Lista original: " + listaOriginal + "\n");

		Set<String> sinRepeticiones = new TreeSet<>(listaOriginal);
		System.out.println("Lista sin repeticiones: " + sinRepeticiones);

		Set<String> repetidas = new TreeSet<>();
		for (String palabra : sinRepeticiones) {
			listaOriginal.remove(palabra);
		}
		repetidas.addAll(listaOriginal);
		System.out.println("Lista de palabras repetidas: " + repetidas);

		Set<String> unicas = new TreeSet<>();
		unicas.addAll(sinRepeticiones);
		unicas.removeAll(repetidas);
		System.out.println("Lista de palabras no repetidas: " + unicas);
    }
}
