package Tema11.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 11.1
 * Repite la actividad resuelta 11.1 escribiendo la tabla de enteros en el archivo datos.dat,
 * y no los enteros individualmente.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act_01 {
    public static void main (String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream out;

        try {
            out = new ObjectOutputStream(new FileOutputStream("archivos_binary/datos.dat"));
            out.writeObject(t);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
