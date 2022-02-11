package Tema4.Recursividad;

import java.util.Scanner;

public class Anexo_Act_06 {
    /* Escribir una cadena al revés */

    public static void main (String[] args) {
        String cadena = getString("CADENA: ");
        System.out.println(alReves(cadena));
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static String alReves (String cadena) {
        String resultado;
        if (cadena.length() == 1) {
            resultado = cadena;
        } else {
            resultado = alReves(cadena.substring(1)) + cadena.charAt(0);
        }
        return resultado;
    }
}
