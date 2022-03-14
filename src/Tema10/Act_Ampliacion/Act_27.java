package Tema10.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 10.27
 * Repite la Actividad de aplicación 10.14, pero sabiendo que una palabra puede no estar separada de otra solo por un
 * espacio en blanco; también puede ser un tabulador, punto, coma o punto y coma.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_27 {
    public static void main (String[] args) {
        BufferedReader in = null;
        Integer lineas = 0, palabras = 0, caracteres = 0;
        String lineaActual;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/carta.txt"));

            lineaActual = in.readLine();
            while (lineaActual != null) {
                lineas++;
                caracteres += lineaActual.length();
                palabras += lineaActual.split("[^(,\\s)][\\s\\t.;,]").length;

                lineaActual = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println("Líneas: " + lineas);
        System.out.println("Palabras: " + palabras);
        System.out.println("Caracteres (incluyendo espacios): " + caracteres);
    }
}
