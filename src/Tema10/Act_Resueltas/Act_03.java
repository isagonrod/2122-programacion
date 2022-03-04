package Tema10.Act_Resueltas;

/* ACTIVIDAD RESUELTA 10.3
 * Repetir la actividad resuelta 10.2 usando un flujo de texto con búfer.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act_03 {
    public static void main (String[] args) {
        String texto = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("Main.java"));
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
