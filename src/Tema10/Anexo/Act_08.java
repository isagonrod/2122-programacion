package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 8
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de texto: nombres.txt
 * El nombre del fichero resultado es nombresSort.txt
 * Suponemos que cada palabra ocupa una línea.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.*;
import java.util.Arrays;

public class Act_08 {
    public static void main (String[] args) {
        Lista listaNombres = leerFichero();
        listaNombres.ordenar();
        guardarFichero(listaNombres);
    }

    static Lista leerFichero() {
        BufferedReader in = null;
        String linea;
        Lista contenido = new Lista();

        try {
            in = new BufferedReader(new FileReader("archivos_txt/nombres.txt"));
            linea = in.readLine();

            while (linea != null) {
                contenido.encolar(linea);
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

    static void guardarFichero(Lista contenido) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/nombresSort.txt"));
            while (contenido.getLength() > 0) {
                out.write((String)contenido.desencolar());
                out.newLine();
            }
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
