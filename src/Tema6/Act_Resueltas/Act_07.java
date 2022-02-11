package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_07 {
    /* Diseñar un programa que solicite al usuario una frase y una palabra.
     * A continuación buscará cuántas veces aparece la palabra en la frase.
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int veces = 0, pos;

        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        System.out.println("Introduzca una palabra: ");
        palabra = sc.nextLine();

        pos = frase.indexOf(palabra);

        while (pos != -1) {
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
        }
        if (veces == 0) {
            System.out.println("\"" + palabra + "\" no se encuentra en la frase");
        } else {
            System.out.println("\"" + palabra + "\" está " + veces + " veces");
        }
    }
}
