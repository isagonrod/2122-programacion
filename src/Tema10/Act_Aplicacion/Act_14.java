package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.14
 * Escribe un programa que lea un fichero de texto llamado carta.txt
 * Tenemos que contar los caracteres, las líneas y las palabras.
 * Para simplificar supondremos que cada palabra está separada de otra por un único espacio en blanco
 * o por un cambio de línea.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_14 {
    public static void main (String[] args) {
        BufferedReader in = null;
        Integer lineas = 0, palabras = 0, caracteres = 0, i;
        String lineaActual;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/carta.txt"));

            lineaActual = in.readLine();
            while (lineaActual != null) {
                lineas++;
                caracteres += lineaActual.length();
                palabras += lineaActual.split(" ").length;

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
