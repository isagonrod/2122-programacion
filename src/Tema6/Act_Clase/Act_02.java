package Tema6.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_02 {
    /* Actualizar una matriz con un vector: void actualizarMat (int[][] matriz, int[] posicion)
     * NOTA: La matriz es un 5x5 y el rango de números debe de estar comprendido entre 1 y 7.
     * EJEMPLO:
     *      1   4   7   3   1
     *      2   7   6   5   2
     *      2   1   3   3   7
     *      1   2   3   4   5
     *      1   2   3   4   5
     * Si busco la posición (2,3):
     *      1   4   7   3   1
     *      2   7   7   6   3
     *      2   1   4   0   8
     *      1   2   4   5   6
     *      1   2   3   4   5
     * La posición que buscamos deberá de ser 0, y tendremos que sumar 1 a las posiciones adyacentes a esa
     */

    public static void main (String[] args) {
        int[][] matriz = new int[5][5];
        int[] posicion = new int[2];

        rellenar(matriz);

        System.out.println("¿Qué posición de la matriz quieres cambiar?");
        posicion[1] = getNumber("Introduce coordenada X de la posición: ");
        posicion[0] = getNumber("Introduce coordenada Y de la posición: ");

        actualizarMatriz(matriz, posicion);
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static void rellenar (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 7 + 1);
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    static void actualizarMatriz(int[][] matriz, int[] posicion) {
        int[] posicionBuscada = new int[2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                posicionBuscada[0] = i;
                posicionBuscada[1] = j;

                if (posicion[0] == posicionBuscada[0] && posicion[1] == posicionBuscada[1]) {
                    matriz[i][j] = 0;
                } else if (esAdyacente(posicion, posicionBuscada)) {
                    matriz[i][j]++;
                }
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    static boolean esAdyacente (int[] posicionCentral, int[] posicionBuscada) {
        return posicionBuscada[0] >= posicionCentral[0] - 1 && posicionBuscada[0] <= posicionCentral[0] + 1 //comprobar si es adyacente
                && posicionBuscada[1] >= posicionCentral[1] - 1 && posicionBuscada[1] <= posicionCentral[1] + 1
                && posicionBuscada[0] >= 0 && posicionBuscada[0] <= 4 //comprobar si lo que preguntamos está fuera del límite
                && posicionBuscada[1] >= 0 && posicionBuscada[1] <= 4;
    }
}
