package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 6
 * Programa que sustituye los tabuladores de un fichero de texto por dos espacios en blanco.
 * Recuerda: método replace de la clase String.
 */

import java.io.*;

public class Act_06 {
    public static void main (String[] args) {
        String linea;
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/fichero.txt"));
            out = new BufferedWriter(new FileWriter("archivos_txt/ficheroConEspacios.txt"));
            linea = in.readLine();

            while (linea != null) {
                linea = linea.replace("\t","\s\s");
                out.write(linea);
                out.newLine();
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
}
