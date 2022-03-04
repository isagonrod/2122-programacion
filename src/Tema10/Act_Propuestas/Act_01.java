package Tema10.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 10.1
 * Crea un fichero de texto con un editor e implementa un programa que lo abra y lo lea, mostrando su contenido por
 * pantalla.
 *
 * NOTA: No olvides escribir la ruta de acceso al fichero completa si este no se encuentra en la carpeta del proyecto
 * actual.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_01 {
    public static void main (String[] args) {
        String texto = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/prueba.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + '\n';
                linea = in.readLine();
            }
        } catch (IOException ex) {
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
        System.out.println(texto);
    }
}
