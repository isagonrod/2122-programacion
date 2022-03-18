package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 4
 * Eliminar las vocales del contenido de un fichero de texto.
 */

import Utilidades.Teclado;

import java.io.*;

public class Act_04 {
    public static void main (String[] args) {
        String contenido = leerFichero(Teclado.getString("¿Qué fichero quieres leer?"));
        guardarFichero(contenido);
    }

    static String leerFichero(String fichero) {
        String contenido = "", linea;
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + fichero));
            linea = in.readLine();

            while (linea != null) {
                contenido += linea;
                linea = in.readLine();
            }
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

        return contenido;
    }

    static void guardarFichero(String texto) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/ficheroSinVocales.txt"));
            texto = texto.replaceAll("[aeiouAEIOU]", "");
            out.write(texto);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
