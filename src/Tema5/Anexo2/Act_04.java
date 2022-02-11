package Tema5.Anexo2;

import java.util.Arrays;

public class Act_04 {
    /* Modifica el programa anterior de tal forma que no se repita ningún número en el array.
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
        int i, j, numero;
        boolean parar;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                parar = false;
                do {
                    numero = (int)(Math.random() * 1001);
                    if (!esRepetido(tabla, numero)) {
                        tabla[i][j] = numero;
                        parar = true;
                    }
                } while(!parar);
            }
        }
    }

    static boolean esRepetido (int tabla[][], int numero) {
        int i, j;
        boolean resultado = false;
        for (i = 0; i < tabla.length && !resultado; i++) {
            for (j = 0; j < tabla[i].length && !resultado; j++) {
                if (tabla[i][j] == numero) {
                    resultado = true;
                }
            }
        }
        return resultado;
    }

    static int minimo (int tabla[][]) {
        int i, j, min = 1001;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                }
            }
        }
        return min;
    }

    static int maximo (int tabla[][]) {
        int i, j, max = 0;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                }
            }
        }
        return max;
    }
}
