package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.5
 * Leer una tabla de enteros de un archivos datos.dat
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Act_05 {
    public static void main (String[] args) {
        int[] tabla;

        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("archivos_binary/datos.dat"))) {
            tabla = (int[]) flujoEntrada.readObject();
            System.out.println(Arrays.toString(tabla));
        }
        catch (IOException ex1) {
            System.out.println("Error de entrada/salida");
        }
        catch (ClassNotFoundException ex2) {
            System.out.println("El fichero no almacena un objeto tabla");
        }
    }
}
