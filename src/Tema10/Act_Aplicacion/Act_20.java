package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.20
 * Algunos sistemas operativos disponen de la orden comp, que compara dos archivos y nos dice si son iguales o distintos.
 * Diseña esta orden de forma que, además, nos diga en qué línea y carácter se encuentra la primera diferencia.
 * Utiliza los ficheros texto1.txt y texto2.text
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Act_20 {
    public static void main (String[] args) {
        int[] diferencia;
        char[][] texto1, texto2;

        texto1 = leeFicheroCaracteres("texto1.txt");
        texto2 = leeFicheroCaracteres("texto2.txt");

        diferencia = comparaFicheros(texto1, texto2);

        if (diferencia[0] == -1) {
            System.out.println("Los archivos son iguales");
        }
        else {
            System.out.println("Los archivos son diferentes, línea " + diferencia[0] + ", carácter " + diferencia[1]);
        }
    }

    static char[][] leeFicheroCaracteres(String fichero) {
        FileInputStream in;
        Scanner sc;
        int i;
        char[][] contenido = new char[0][0];

        try {
            in = new FileInputStream("archivos_txt/" + fichero);
            sc = new Scanner(in);

            for (i = 0; sc.hasNextLine(); i++) {
                contenido = Arrays.copyOf(contenido, contenido.length + 1);
                contenido[i] = sc.nextLine().toCharArray();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return contenido;
    }

    static int[] comparaFicheros(char[][] texto1, char[][] texto2) {
        int[] diferencia = {-1, -1};
        int i, j;

        for (i = 0; i < texto1.length; i++) {
            if (diferencia[0] == -1 && i < texto2.length) {
                for (j = 0; j < texto1[i].length; j++) {
                    if (diferencia[0] == -1 && j < texto2[i].length && texto1[i][j] != texto2[i][j]) {
                        diferencia[0] = i + 1;
                        diferencia[1] = j + 1;
                    }
                }
            }
        }

        return diferencia;
    }
}
