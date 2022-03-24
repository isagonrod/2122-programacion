package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.6
 * Recuperar la estrofa del archivo cancionPirata.dat de la actividad resuelta 11.2 y mostrarla por consola.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Act_06 {
    public static void main (String[] args) {
        ObjectInputStream in;
        String cancion;

        try {
            in = new ObjectInputStream(new FileInputStream("archivos_binary/cancionPirata.dat"));
            cancion = (String) in.readObject();
            System.out.println(cancion);
        }
        catch (IOException ex1) {
            System.out.println(ex1);
        }
        catch (ClassNotFoundException ex2) {
            System.out.println(ex2);
        }
    }
}
