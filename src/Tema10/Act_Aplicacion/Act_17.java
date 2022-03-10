package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.17
 * En Linux disponemos del comando "more", al que se le pasa un fichero y lo muestra poco a poco: cada 24 líneas.
 * Implementa un programa que funcione de forma similar.
 */

import Utilidades.Teclado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_17 {
    public static void main (String[] args) {
        String linea;
        int nLinea = 0;
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/carta.txt"));
            do {
                do {
                    linea = in.readLine();
                    if (linea != null) {
                        System.out.println(linea);
                        nLinea++;
                    }
                } while (linea != null && nLinea % 24 != 0);

                if (linea != null) {
                    Teclado.getString("\nPulse INTRO (dos veces) para continuar listando...\n");
                }
            } while (linea != null);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
