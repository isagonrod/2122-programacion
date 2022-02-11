package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_13 {
    /* Diseñar un algoritmo que lea del teclado una frase o indique, para cada letra que aparece en la frase,
     * cuántas veces se repite.
     * Se consideran iguales las letras mayúsculas y las minúsculas para realizar la cuenta.
     * Un ejemplo sería:
     *      Frase: En un lugar de la Mancha.
     *      Resultado:
     *          a: 4 veces
     *          c: 1 vez
     *          d: 1 vez
     *          e: 2 veces
     *          ...
     */
    public static void main (String[] args) {
        String frase;
        int[] numVeces;

        frase = getString("Introduce una frase: ");
        frase = frase.toLowerCase();

        numVeces = new int['z' - 'a' + 1];

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                numVeces[frase.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 'z' - 'a' + 1; i++) {
            if (numVeces[i] != 0) {
                System.out.println("La letra " + (char)(i + 'a') + " se repite " + numVeces[i] + " veces");
            }
        }
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
