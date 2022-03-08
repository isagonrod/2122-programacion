package Tema10.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 10.4
 * Escribe un texto en un archivo de texto, línea a línea leída del teclado, hasta que introduzca la cadena "fin".
 */

import Utilidades.Teclado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Act_04 {
    public static void main (String[] args) throws IOException {
        String texto = "";
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/Texto.txt"));
            texto = Teclado.getString("Introduce una cadena de texto: ");
            while (texto != "fin") {
                out.write(texto);
                out.newLine();
                texto = Teclado.getString("Introduce otra cadena de texto: ");
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
