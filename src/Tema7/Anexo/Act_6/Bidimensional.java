package Tema7.Anexo.Act_6;

/* Crea una clase Bidimensional que resuelva las siguientes operaciones para arrays bidimensionales de números enteros
 * (generar números aleatorios entre 1 y 99):
 *      1. Mostrar matriz.
 *      2. filaN: devuelve la fila n-ésima del array.
 *      3. columnaN: devuelve la columna n-ésima del array.
 *      4. get: devuelve el elemento que ocupa una fila y columna.
 *      5. esPuntoDeSilla: dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
 *      6. diagonal: devuelve la diagonal principal del array.
 *
 * En el constructor poner el número de filas y columnas, y rellenar con números aleatorios.
 */

import java.util.Arrays;

public class Bidimensional {
    Integer[][] bidimensional;

    public Bidimensional(int fila, int columna) {
        this.bidimensional = new Integer[fila][columna];
    }

    void rellenarMatriz() {
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                bidimensional[i][j] = (int)(Math.random() * 99 + 1);
            }
        }
    }

    void mostrarMatriz() {
        System.out.println(Arrays.deepToString(this.bidimensional));
    }

    void filaN(int num) {
        Integer[] aux = new Integer[bidimensional.length];
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (i == num) {
                    aux = bidimensional[i];
                }
            }
        }
        System.out.println(Arrays.toString(aux));
    }

    void columnaN(int num) {
        Integer[] aux = new Integer[bidimensional.length];
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (j == num) {
                    aux[i] = bidimensional[i][num];
                }
            }
        }
        System.out.println(Arrays.toString(aux));
    }

    Integer get(int fila, int columna) {
        Integer valor = 0;
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (i == fila && j == columna) {
                    valor = bidimensional[i][j];
                }
            }
        }
        return valor;
    }

    boolean esPuntoDeSilla(int num) {
        boolean resultado = false;
        int i, j, puntoSilla = 0;
        for (i = 0; i < bidimensional.length; i++) {
            bidimensional[i][bidimensional.length - 1] = bidimensional[i][0];
            for (j = 0; j < bidimensional[i].length; j++) {
                if (bidimensional[i][j] > bidimensional[bidimensional.length - 1][i]) {
                    bidimensional[bidimensional.length - 1][i] = bidimensional[i][j];
                }
            }
        }
        for (i = 0; i < bidimensional.length; i++) {
            for (j = 0; j < bidimensional[i].length; j++) {
                if (bidimensional[i][bidimensional.length - 1] == bidimensional[bidimensional.length - 1][j]) {
                    puntoSilla = bidimensional[i][bidimensional.length - 1];
                }
            }
        }
        if (puntoSilla == num) {
            resultado = true;
        }
        return resultado;
    }

    void diagonal() {
        Integer[] aux = new Integer[bidimensional.length];
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (i == j) {
                    aux[i] = bidimensional[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(aux));
    }
}
