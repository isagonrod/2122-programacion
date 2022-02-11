package Juegos;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {

    public static void main (String[] args) {
        int tablero[][] = new int[3][3];
        int ganador;

        do {
            pedirCoordenadas(tablero);
            coordenadasOrdenador(tablero);
            imprimirTablero(tablero);
        } while (!hayGanador(tablero) && !matrizLlena(tablero));

        ganador = darGanador(tablero);

        if (ganador == 1) {
            System.out.println("El ganador es el JUGADOR");
        } else if (ganador == 2){
            System.out.println("El ganador es el ORDENADOR");
        } else {
            System.out.println("No hay ningún ganador");
        }
    }

    static void imprimirTablero(int[][] matriz) {
        int i;
        System.out.println("Tablero:");
        for (i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    static void coordenadasOrdenador(int[][] matriz) {
        int x, y;
        boolean seguir = false;

        do {
            x = (int)(Math.random()* matriz.length);
            y = (int)(Math.random()* matriz.length);
            if (!coordenadasLlenas(matriz, x, y)) {
                matriz[y][x] = 2;
                seguir = true;
            }
        } while(!seguir);
    }

    static void pedirCoordenadas(int[][] matriz) {
        int x, y;
        boolean seguir = false;

        do {
            System.out.println("Pon ficha. Para ello tendrás que dar las coordenadas X,Y de la casilla");
            x = getNumber("Coordenada X: ");
            y = getNumber("Coordenada Y: ");
            if (!coordenadasLlenas(matriz, x, y)) {
                matriz[y][x] = 1;
                seguir = true;
            }
        } while(!seguir);
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static boolean matrizLlena(int matriz[][]) {
        int i, j, huecosLlenos = 0;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    huecosLlenos++;
                }
            }
        }
        return huecosLlenos == matriz.length * matriz[0].length;
    }

    static boolean hayGanador(int matriz[][]) {

        return darGanador(matriz) != 0;
    }

    static int darGanador(int matriz[][]) {
        int winner;
        if ((matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1) || (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1) ||
                (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1) || (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1) ||
                (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1) || (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1) ||
                (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1) || (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1))
        {
            winner = 1;
        }
        else if ((matriz[0][0] == 2 && matriz[1][0] == 2 && matriz[2][0] == 2) || (matriz[0][1] == 2 && matriz[1][1] == 2 && matriz[2][1] == 2) ||
                (matriz[0][2] == 2 && matriz[1][2] == 2 && matriz[2][2] == 2) || (matriz[0][0] == 2 && matriz[0][1] == 2 && matriz[0][2] == 2) ||
                (matriz[1][0] == 2 && matriz[1][1] == 2 && matriz[1][2] == 2) || (matriz[2][0] == 2 && matriz[2][1] == 2 && matriz[2][2] == 2) ||
                (matriz[0][0] == 2 && matriz[1][1] == 2 && matriz[2][2] == 2) || (matriz[0][2] == 2 && matriz[1][1] == 2 && matriz[2][0] == 2)) {
            winner = 2;
        }
        else {
            winner = 0;
        }
        return winner;
    }

    static boolean coordenadasLlenas (int matriz[][], int x, int y) {

        return matriz[y][x] != 0;
    }

}
