package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_09 {
    /* Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras
     * introducidas con espacios en blanco.
     * Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena << fin >> escrita con cualquier
     * combinación de mayúsculas y minúsculas.
     * La cadena << fin >> no aparecerá en la frase final.
     */
    public static void main (String[] args) {
        String frase = "", palabra;
        palabra = getString("Escriba una palabra: ");

        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;
            palabra = getString("Escriba una palabra: ");
        }
        System.out.println(frase);
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
