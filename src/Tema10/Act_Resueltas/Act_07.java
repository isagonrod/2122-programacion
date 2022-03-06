package Tema10.Act_Resueltas;

/* ACTIVIDAD RESUELTA 10.7
 * Como ejemplo, vamos a guardar en un fichero de texto,
 *      "En un lugar de La Mancha,
 *      de cuyo nombre no quiero acordarme"
 * La primera línea, carácter a carácter, y la segunda, en una sola sentencia.
 */

import java.io.*;

public class Act_07 {
    public static void main (String[] args) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/quijote.txt"));
            String cad = "En un lugar de La Mancha,";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no quiero acordarme.";
            out.newLine();
            out.write(cad);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
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
