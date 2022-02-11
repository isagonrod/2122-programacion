package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_05 {
    /* Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
     * Un ejemplo: la cadena "Hola mundo" quedaría "odnum aloH".
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String antes, después;

        System.out.println("Escriba una cadena: ");
        antes = sc.nextLine();
        después = alReves(antes);

        System.out.println(después);
    }

    static String alReves (String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }
}
