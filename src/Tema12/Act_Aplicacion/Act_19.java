package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.19
 * Escribe un programa donde se introduzca por consola una frase que conste exclusivamente de palabras separadas por
 * espacios.
 * Las palabras de la frase se almacenarán en una lista.
 * Finalmente, se mostrarán por pantalla las palabras que estén repetidas y, a continuación, las que no lo estén.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Act_19 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        String frase = "Hola mi nombre es un nombre bastante largo y bonito pero un nombre también bastante común";

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            lista.add(palabra);
        }

        System.out.println("Lista: " + lista);
    }
}
