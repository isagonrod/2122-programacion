package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.3
 * Pedir un entero n por consola y, a continuación, pedir n números de tipo double, que iremos insertando en una tabla.
 * Guarda la tabla en un archivo binario.
 */

import Utilidades.Teclado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act_03 {
    public static void main (String[] args) {
        ObjectOutputStream out;
        int nElementos, i;
        double tabla[];

        try {
            out = new ObjectOutputStream(new FileOutputStream("archivos_binary/datos.dat"));
            nElementos = Teclado.getNumber("Número de elementos: ");
            tabla = new double[nElementos];

            for (i = 0; i < tabla.length; i++) {
                tabla[i] = Teclado.getDouble("Introduzca un número real: ");
            }

            out.writeObject(tabla);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
