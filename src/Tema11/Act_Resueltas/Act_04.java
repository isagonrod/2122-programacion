package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.4
 * Leer de un archivo datos.dat 10 números enteros, guardándolos en una tabla de tipo int.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Act_04 {
    public static void main (String[] args) {
        ObjectInputStream flujoEntrada;
        int[] t = new int[10];
        int i;

        try {
            flujoEntrada = new ObjectInputStream(new FileInputStream("archivos_binary/datos.dat"));
            for (i = 0; i < t.length; i++) {
                t[i] = flujoEntrada.readInt();
            }
            System.out.println(Arrays.toString(t));
        }
        catch (IOException ex) {
            System.out.println("error lectura");
        }
    }
}
