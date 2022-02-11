package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_12 {
     /* Crear una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
      * el elemento de la posición [n][m] debe contener el valor 10 x n + m.
      * Después se debe mostrar su contenido.
      */

    public static void main(String [] args) {
        int tabla[][] = new int[5][5];
        int i = 0, j = 0;

        tabla = rellenar(i, j);
        System.out.println(Arrays.deepToString(tabla));
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static int [][]rellenar (int i, int j) {
        int dato[][] = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                dato[i][j] = 10 * i + j;
            }
        }
        return dato;
    }
}
