package Tema5.Anexo2;

import java.util.Arrays;

public class Act_03 {
    /* Realiza un programa que rellene un array de 6 filas y 10 columnas con números enteros positivos comprendidos
     * entre 0 y 1000 (ambos incluidos).
     * A continuación, el programa deberás dar la posición tanto del máximo como del mínimo.
     */
    public static void main (String[] args) {
        int array[][] = new int[6][10], i;

        rellenar(array);

        System.out.println("Array:");
        for (i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("El mínimo es: " + minimo(array));
        System.out.println("El máximo es: " + maximo(array));
    }

    static void rellenar (int tabla[][]) {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                tabla[i][j] = (int)(Math.random() * 1001);
            }
        }
    }

    static int minimo (int tabla[][]) {
        int i, j, min = 1001;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                }
            }
        }
        return min;
    }

    static int maximo (int tabla[][]) {
        int i, j, max = 0;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                }
            }
        }
        return max;
    }
}
