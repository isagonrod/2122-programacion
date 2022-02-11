package Tema5.Anexo;

import java.util.Arrays;
import java.util.Scanner;

public class Act_02 {

    /* Crear un vector tamaño 10 con valores aleatorios entre 0 y 100.
     * Pedir por teclado un número de posiciones que se desea rotar dicho vector hacia la derecha.
     * El último elemento pasará a la primera posición.
     */

    public static void main (String args[]) {

        int vector[] = new int[10], posicion;
        rellenar(vector);

        do {
            posicion = getNumber("Posición a rotar hacia la derecha: ");
        } while (posicion < 1);

        System.out.println("Tabla original: " + Arrays.toString(vector));
        rotarDerecha(vector, posicion);
        System.out.println("Tabla rotada: " + Arrays.toString(vector));
    }

    static void rellenar (int vector[]) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            aux = (int)(Math.random()* 101);
            vector[i] = aux;
        }
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static void rotarDerecha (int vector[], int posicion) {
        int aux, i;

        if (posicion > vector.length) { //calculamos, no vamos a mover 16 posiciones, sino 16%length para saber el hueco final en el que cae
            posicion = vector.length % posicion;
        }

        if (posicion != 0) { //si después del cálculo anterior sale 0, no hacemos nada porque quedarían en su posición original
            for (i = vector.length -1; i >= posicion; i--) {
                aux = vector[i - posicion];
                vector[i - posicion] = vector[i];
                vector[i] = aux;
            }
        }
    }
}

/* public static int[] rotar (int[] numero, int pos) {
 *      int primero = numero[];
 *      int j;
 *      for (int t = 0; t < pos; t++) {
 *          primero = numero[numero.length-1];
 *          for (j = numero.length - 1; j > 0; j--) {
 *              numero[j] = numero[j-1];
 *          }
 *          numero[j] = numero;
 *      }
 *      return numero;
 * }
 */