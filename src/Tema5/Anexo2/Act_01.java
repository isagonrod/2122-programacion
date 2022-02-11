package Tema5.Anexo2;

public class Act_01 {
    /* Escribe un programa que genere de forma aleatoria 20 valores entre 100 y 999.
     * Estos números se deben introducir en un array de 4 filas y 5 columnas.
     * El programa mostrará todos los datos junto a las sumas parciales por filas y columnas
     * como si de una hoja de cálculo se tratara.
     * La suma total debe aparecer en la esquina inferior derecha.
     */
    public static void main (String[] args) {
        int tabla[][] = new int[4][5];
        rellenar(tabla);
        sumaFila(tabla);
        sumaColumna(tabla);
    }

    static void rellenar (int tabla[][]) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                tabla[i][j] = (int)(Math.random() * (999-100) + 100);
            }
        }
    }

    static void sumaFila (int tabla[][]) {
        int i, j, sumaFila;
        for (i = 0; i < 4; i++) {
            sumaFila = 0;
            for (j = 0; j < 5; j++) {
                System.out.print(" " + tabla[i][j]);
                sumaFila += tabla[i][j];
            }
            System.out.println(" " + sumaFila);
        }
    }

    static void sumaColumna (int tabla[][]) {
        int i, j, sumaColumna, sumaTotal = 0;
        for (j = 0; j < 5; j++) {
            sumaColumna = 0;
            for (i = 0; i < 4; i++) {
                sumaColumna += tabla[i][j];
                sumaTotal += sumaColumna;
            }
            System.out.print(" " + sumaColumna);
        }
        System.out.println(" " + sumaTotal);
    }
}
