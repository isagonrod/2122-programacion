package Tema5.Anexo;

import java.util.Arrays;
import java.util.Scanner;

public class Act_05_1 {

    public static void main (String args[]) {
        int vector[] = {1,2,3,4,1,2,3,4,5,7,8,10};
        int secuencia[] = new int[0];
        int numero;
        boolean encontrado;

        /* TODO: Hacerlo con un vector que no esté ordenado.
         *   Si se meten números salteados, estando en orden en la tabla, sale 'TRUE' aunque no sean números seguidos
         *   (ej. 1,2,3... si no están seguidos en la tabla, sale 'FALSE', aunque estén todos los números en el vector).
         *   Habría que meter los números directamente en la tabla y no hacerlo de forma aleatoria.
         */

        System.out.println("Tabla generada: " + Arrays.toString(vector));

        do {
            numero = getNumber("Introduce un número a buscar (para parar, escribir -1): ");
            if (numero != -1) {
                secuencia = Arrays.copyOf(secuencia, secuencia.length + 1);
                secuencia[secuencia.length - 1] = numero;
            }
        } while(numero != -1);

        encontrado = buscarSecuencia(vector, secuencia);

        System.out.println("¿Secuencia encontrada?: " + encontrado);
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static void rellenar (int vector[], int valorMaximo) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * valorMaximo + 1);
        }
    }

    static boolean buscarSecuencia (int vector[], int secuencia[]) {
        int i, j, encontrado = 0;
        boolean resultado = false;

        for (i = 0; i < vector.length - secuencia.length; i++) {
            for (j = 0; j < secuencia.length && encontrado != secuencia.length; j++) {
                if (vector[i + j] == secuencia[j]) {
                    encontrado++;
                } else {
                    encontrado = 0;
                }
            }
        }
        if (encontrado == secuencia.length) {
            resultado = true;
        }
        return resultado;
    }
}
