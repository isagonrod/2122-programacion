package Tema10.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 10.28
 * Diseña un programa al que se le proporcione el nombre de un fichero de texto y una cadena.
 * Debemos buscar todas las ocurrencias de la cadena en el fichero.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_28 {
    public static void main (String[] args) {
        String cadena = "que";
        Integer encontrados = leerCadenaEnFichero("carta.txt", cadena);
        System.out.println("Se ha encontrado la cadena " + cadena + " " + encontrados + " veces en el fichero leído.");
    }

    static Integer leerCadenaEnFichero (String fichero, String cadena) {
        BufferedReader in = null;
        Integer encontrados = 0;
        String lineaActual;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + fichero));

            lineaActual = in.readLine();
            while (lineaActual != null) {
                if (lineaActual.contains(cadena)) {
                    encontrados++;
                }
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

        return encontrados;
    }
}
