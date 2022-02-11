package Tema6.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_20 {
    /* Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética.
     * Suponemos que cada palabra de la frase se separa de otra por un único espacio.
     */
    public static void main (String[] args) {
        String frase = getString("Introduce una frase: ");
        String[] orden = frase.split(" ");
        Arrays.sort(orden);
        System.out.println(Arrays.toString(orden));
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
