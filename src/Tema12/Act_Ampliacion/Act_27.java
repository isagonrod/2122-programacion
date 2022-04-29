package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.27
 * Implementa la función leeCadena(), con el siguiente prototipo:
 *      List<Character> leeCadena(),
 * que lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada elemento.
 */

import Utilidades.Teclado;

import java.util.LinkedList;
import java.util.List;

public class Act_27 {
    public static void main(String[] args) {
        String cadena = Teclado.getString("Introduce una cadena: ");
        List<Character> letras = leeCadena(cadena);
        System.out.println("Lista de caracteres: " + letras);
    }

    public static List<Character> leeCadena(String cadena) {
        char[] letras = cadena.toCharArray();
        List<Character> listaCaracteres = new LinkedList<>();

        for (char letra : letras) {
            listaCaracteres.add(letra);
        }

        return listaCaracteres;
    }
}
