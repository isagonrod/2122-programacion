package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.1
 * Escribir en un archivo datos.dat los valores de una tabla de diez enteros.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act_01 {
    public static void main (String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoSalida = null;

        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("archivos_binary/datos.dat"));
            for (int n : t) {
                flujoSalida.writeInt(n);
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
