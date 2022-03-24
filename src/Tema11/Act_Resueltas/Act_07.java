package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.7
 * Grabar en el fichero numeros.dat una serie de números enteros no negativos introducidos por teclado.
 * La serie acabará cuando escribamos -1.
 * Abrir de nuevo numeros.dat para lectura y leer todos los números hasta el final del fichero, mostrándolos
 * por pantalla y copiándolos en un segundo fichero numerosCopia.dat
 */

import Utilidades.Teclado;

import java.io.*;

public class Act_07 {
    public static void main (String[] args) {
        int numero;
        ObjectOutputStream salida;
        ObjectInputStream entrada;

        try {
            salida = new ObjectOutputStream(new FileOutputStream("archivos_binary/numeros.dat"));
            numero = Teclado.getNumber("Introduce entero: ");

            while (numero >= 0) {
                salida.writeInt(numero);
                salida.writeObject("\n");
                numero = Teclado.getNumber("Introduce entero: "); // TODO : Este no lo está pillando
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            entrada = new ObjectInputStream(new FileInputStream("archivos_binary/numeros.dat"));
            salida = new ObjectOutputStream(new FileOutputStream("archivos_binary/numerosCopia.dat"));
            System.out.println("[");

            while (true) {
                numero = entrada.readInt();
                System.out.println(numero + " ");
                salida.writeInt(numero);
            }
        }
        catch (EOFException ex1) {
            System.out.println("] \nFin de fichero");
        }
        catch (IOException ex2) {
            System.out.println(ex2);
        }
    }
}
