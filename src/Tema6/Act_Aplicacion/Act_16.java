package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {
    /* Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye por otro símbolo no alfabético.
     * Por ejemplo el carácter 'a' se podría sustituir por el carácter '@', la 'e' por '€', la 'i' por '1', etc.
     */
    public static void main (String[] args) {
        final char[] original = {'a','e','i','o','u'};
        final char[] sustituto = {'@','€','%','\u2661','#'};
        char[] cadena;
        String palabra = getString("Introduce una palabra o frase: ");

        palabra = palabra.toLowerCase();
        cadena = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            cadena[i] = modifica(original, sustituto, palabra.charAt(i));
        }
        palabra = String.valueOf(cadena);
        System.out.println(palabra);
    }

    static char modifica(char[] original, char[] sustituto, char c) {
        final String conj1 = String.valueOf(original);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = sustituto[pos];
        }
        return codificado;
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
