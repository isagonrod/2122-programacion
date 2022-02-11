package Tema5.Anexo2;

import java.util.Arrays;

public class Act_05 {
    /* Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números aleatorios
     * entre 500 y 900. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina
     * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo y la media de los números que
     * hay en esa diagonal.
     */
    public static void main (String[] args) {
        int tabla[][] = new int[9][9];
        rellenar(tabla);
        mostrar(tabla);
        mostrarDiagonal(tabla);
    }

    static void rellenar (int tabla[][]) {
        int i, j;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int)(Math.random() * (900-500) + 500);
            }
        }
    }

    static void mostrar(int tabla[][]) {
        int i;
        System.out.println("Tabla completa:");
        for (i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }

    static void mostrarDiagonal (int tabla[][]) {
        int aux[] = new int[tabla.length];
        int i, j = 0, media = 0;
        for (i = tabla.length - 1; i >= 0; i--) {
            aux[j] = tabla[i][j];
            media += aux[j];
            j++;
        }
        System.out.println("\nDiagonal: " + Arrays.toString(aux));
        Arrays.sort(aux);
        System.out.println("Valor máximo: " + aux[aux.length - 1]);
        System.out.println("Valor mínimo: " + aux[0]);
        System.out.println("Valor medio: " + media/aux.length);
    }
}
