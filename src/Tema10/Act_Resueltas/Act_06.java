package Tema10.Act_Resueltas;

/* ACTIVIDAD RESUELTA 10.6
 * Crear con un editor un fichero de texto Enteros.txt en la carpeta del proyecto actual de NetBeans y escribir en él
 * una serie de enteros separados por secuencias de espacios y tabuladores, incluso en líneas distintas.
 * Implementar un programa que acceda a Enteros.txt con un objeto Scanner a través de un flujo de entrada, lea los
 * números y calcule la suma y su media aritmética, mostrando los resultados por pantalla.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Act_06 {
    public static void main (String[] args) {
        FileInputStream flujo = null;

        try {
            flujo = new FileInputStream("archivos_txt/Enteros.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        Scanner s = new Scanner(flujo);
        int contador = 0, suma = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            System.out.print(n + " ");
            suma += n;
            contador++;
        }
        double media = (double) suma / contador;
        System.out.println("\nsuma: " + suma + "\nmedia: " + media);
    }
}
