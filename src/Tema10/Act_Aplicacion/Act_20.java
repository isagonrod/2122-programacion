package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.20
 * Algunos sistemas operativos disponen de la orden comp, que compara dos archivos y nos dice si son iguales o distintos.
 * Diseña esta orden de forma que, además, nos diga en qué línea y carácter se encuentra la primera diferencia.
 * Utiliza los ficheros texto1.txt y texto2.text
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_20 {
    public static void main (String[] args) {
        int nLinea;
        String texto1 = "", texto2 = "";

        comparaFicheros(texto1,texto2);
    }

    static void comparaFicheros(String fichero1, String fichero2) {
        BufferedReader in1 = null, in2 = null;

        try {
            in1 = new BufferedReader(new FileReader("archivos_txt/" + fichero1));
            in2 = new BufferedReader(new FileReader("archivos_txt/" + fichero2));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
