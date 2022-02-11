package Tema5.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {
    /* En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas representan
     * lugares (lugar 0, lugar 1, lugar 2, etc.) que estarán conectados.
     * Si desde el lugar X podemos ir hacia el
     * lugar Y, entonces la matriz en la posición [x][y] valdrá TRUE; en caso contrario, valdrá FALSE.
     * Escribe una función que, dada una matriz que representa el mapa y dos lugares, indique si es posible viajar
     * desde el primer lugar al segundo (directamente o pasando por lugares intermedios).
     */
    public static void main (String [] args) {
        boolean mapa[][] = {{false, true, true, true}, {true, false, true, false}, {true, true, false, false}, {true, false, false, false}};
        int coordenada1 = getNumber("Introduce el punto de origen: ");
        int coordenada2 = getNumber("Introduce el punto de destino: ");

        System.out.println("¿Es posible viajar desde el primer punto al segundo? " + coordenadas(mapa, coordenada1, coordenada2));
    }

    static boolean coordenadas (boolean[][] mapa, int coordenada1, int coordenada2) {
        boolean result = false;
        int j;  // j = columna

        if (!mapa[coordenada1][coordenada2]) {
            for (j = 0; j < mapa.length && !result; j++) {
                // buscamos dentro del origen solicitado todos los "true" para ver si desde ellos podemos ir al destino
                // si quiero ir de 1 a 3 no puedo directamente, pero resulta que si puedo ir desde 1 a 0, y desde 0 a 3
                if (mapa[coordenada1][j] && mapa[j][coordenada2]) {
                    result = true;
                }
            }
        } else {
            result = true;
        }

        return result;
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
