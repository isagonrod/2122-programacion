package Tema10.Act_Resueltas;

/* ACTIVIDAD RESUELTA 10.5
 * Crear con un editor un archivo de texto con un conjunto de números reales, uno por línea.
 * Abrirlo con un flujo de texto para lectura y leerlo línea a línea.
 * Convertir las cadenas leídas en números de tipo double por medio de Scanner, y mostrar al final la suma de todos ellos.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Act_05 {
    public static void main (String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/Numeros.txt"));
            Scanner s;
            double numero, suma = 0;
            String linea = in.readLine();
            while (linea != null) {
                s = new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("suma: " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
