package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 1
 * Invertir fichero de texto
 */

import java.io.*;

public class Act_01 {
    public static void main (String[] args) {
        String contenidoOrigen;
        String contenidoDestino;

        contenidoOrigen = leerFichero();
        contenidoDestino = procesarFichero(contenidoOrigen);
        guardarFichero(contenidoDestino);
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

    static String procesarFichero(String contenido) {
        String invertido = "";

        for (int i = contenido.length() - 1; i >= 0; i--) {
            invertido += contenido.charAt(i);
        }

        return invertido;
    }

    static void guardarFichero(String contenido) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/ficheroInvertido.txt"));
            out.write(contenido);
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
