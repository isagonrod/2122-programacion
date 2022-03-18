package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 5
 * Dados dos flujos de lectura, crear uno de escritura.
 * Observa que se declaran en total tres manejadores de fichero (dos para lectura y uno para escritura).
 * El programa va leyendo, de forma alterna, una línea de cada fichero -una línea de fichero1.txt y otra línea de
 * fichero2.txt- mientras queden líneas por leer en alguno de los ficheros; y al mismo tiempo va guardando esas líneas,
 * de forma alternativa, en otro fichero con nombre mezcla.txt
 */

import java.io.*;

public class Act_05 {
    public static void main (String[] args) {
        String linea1, linea2;
        BufferedReader in1 = null, in2 = null;
        BufferedWriter out = null;

        try {
            in1 = new BufferedReader(new FileReader("archivos_txt/fichero1.txt"));
            in2 = new BufferedReader(new FileReader("archivos_txt/fichero2.txt"));
            out = new BufferedWriter(new FileWriter("archivos_txt/mezcla.txt"));

            linea1 = in1.readLine();
            linea2 = in2.readLine();

            while (linea1 != null && linea2 != null) {
                out.write(linea1);
                out.newLine();
                out.write(linea2);
                out.newLine();
                linea1 = in1.readLine();
                linea2 = in2.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in1 != null && in2 != null) {
                try {
                    in1.close();
                    in2.close();
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
