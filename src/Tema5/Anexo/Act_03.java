package Tema5.Anexo;

import java.util.Arrays;
import java.util.Scanner;

public class Act_03 {

    /* Crear un vector tamaño 10 con valores aleatorios entre 0 y 100.
     * Pedir por teclado un número de posiciones que se desea rotar dicho vector hacia la izquierda.
     * El primer elemento pasará a la última posición.
     */

    public static void main(String args[]) {
        int vector[] = new int[10], posicion;

        rellenar(vector);

        do {
            posicion = getNumber("Posicion a rotar hacia la izquierda: ");
        } while (posicion < 1);

        System.out.println("Tabla original: " + Arrays.toString(vector));
        vector = rotarIzquierda(vector, posicion);
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

    static int[] rotarIzquierda (int vector[], int saltos) {
        int resultado[] = new int[vector.length], i;

        if (saltos > vector.length) { //calculamos, no vamos a mover 16 posiciones, sino 16%length para saber el hueco final en el que cae
            saltos = vector.length % saltos;
        }

        if (saltos != 0) { //si después del cálculo anterior sale 0, no hacemos nada porque quedarían en su posición original
            for (i = 0; i < saltos; i++) { //recolocamos los elementos que se mueven X posiciones
                resultado[vector.length - saltos + i] = vector[i];
            }

            for (i = saltos; i < vector.length; i++) { //los elementos que empiezan a partir de 0 (no han ido al final) los hacemos aquí
                resultado[i - saltos] = vector[i];
            }
        }

        return resultado;
    }
}