package Tema6.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_03 {
    /* Eliminar repetidos: void eliminarRepe (String[] conjunto) */

    public static void main (String[] args) {
        String cadena = getString(" -- CADENA -- ");
        String[] conjunto = cadena.split(" ");

        conjunto = eliminarRepetidos(conjunto);
        cadena = Arrays.toString(conjunto);

        System.out.println("\n -- CADENA FINAL -- \n" + cadena);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static String[] eliminarRepetidos (String[] conjunto) {
        Arrays.sort(conjunto);
        int i;
        for (i = conjunto.length-1; i > 0; i--) {
            if (conjunto[i].equals(conjunto[i-1])) {
                System.arraycopy(conjunto, i + 1, conjunto, i, conjunto.length - i - 1);
                conjunto = Arrays.copyOf(conjunto,conjunto.length-1);
            }
        }
        return conjunto;
    }
}
