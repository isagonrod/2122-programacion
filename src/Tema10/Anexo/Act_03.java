package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 3
 * Pasar a mayúsculas el contenido de un fichero de texto.
 */

import java.io.*;

public class Act_03 {
    public static void main (String[] args) {
        guardarFichero(leerFichero());
    }

    static String leerFichero() {
        BufferedReader in = null;
        String contenido = "", linea;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/fichero.txt"));
            linea = in.readLine();
            while (linea != null) {
                contenido += linea + '\n';
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

    static void guardarFichero(String contenido) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/ficheroMayusculas.txt"));
            out.write(contenido.toUpperCase());
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
