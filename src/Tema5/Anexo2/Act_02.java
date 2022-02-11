package Tema5.Anexo2;

public class Act_02 {
    /* Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla
     * con un pequeño retardo (Thread.sleep(500)), dando la impresión de que el ordenador se queda "pensando"
     * antes de mostrar los números.
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
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" " + sumaColumna);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" " + sumaTotal);
    }
}
