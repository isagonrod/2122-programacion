package Tema6.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_12 {
    /* Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
     * Ejemplos de anagramas para la palabra ROMA son: AMOR, RAMO o MORA.
     * Construir un programa que solicite al usuario dos palabras e indique si son anagramas una de otra.
     */
    public static void main (String[] args) {
        String palabra1, palabra2;

        palabra1 = getString("Escribe una palabra: ");
        palabra1 = palabra1.toLowerCase();

        palabra2 = getString("Escribe otra palabra: ");
        palabra2 = palabra2.toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagramas");
        } else {
            char p1[] = palabra1.toCharArray();
            char p2[] = palabra2.toCharArray();
            Arrays.sort(p1);
            Arrays.sort(p2);

            if (Arrays.equals(p1,p2)) {
                System.out.println("Son anagramas");
            } else {
                System.out.println("No son anagramas");
            }
        }
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
