package Tema5.Anexo;

import java.util.Arrays;

public class Act_06 {
    /* Dado un vector de números enteros, escriba un método que ordene los
     * elementos del vector de tal forma que los números pares aparezcan
     * antes que los números impares. Además, los números pares deberán
     * estar ordenados de forma ascendente, mientras que los números impares
     * deberán estar ordenados de forma descendente.
     * Esto es, el vector {1,2,3,4,5,6} quedará como {2,4,6,5,3,1}.
     */

    public static void main (String args[]) {
        int vector[] = new int[10];
        int vectorOrdenado[] = new int[10];
        int pares[], impares[];

        rellenar(vector, 10);
        Arrays.sort(vector);

        System.out.println("Tabla original: " + Arrays.toString(vector));

        pares = buscarPares(vector);
        impares = buscarImpares(vector);

        System.arraycopy(pares, 0, vectorOrdenado, 0, pares.length);
        System.arraycopy(impares, 0, vectorOrdenado, pares.length, impares.length);

        System.out.println("Tabla nueva: " + Arrays.toString(vectorOrdenado));
    }

    static void rellenar (int vector[], int valorMaximo) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * valorMaximo + 1);
        }
    }

    static int[] buscarPares (int vector[]) {
        int pares[] = new int[0];
        int i;
        for (i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length-1] = vector[i];
            }
        }
        return pares;
    }

    static int[] buscarImpares (int vector[]) {
        int impares[] = new int[0];
        int i;
        for (i = vector.length - 1; i >= 0; i--) {
            if (vector[i] % 2 != 0) {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length-1] = vector[i];
            }
        }
        return impares;
    }
}
