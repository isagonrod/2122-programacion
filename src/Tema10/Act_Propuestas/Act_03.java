package Tema10.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 10.3
 * Crea con un editor el fichero de texto Jugadores.txt en la carpeta del proyecto de NetBeans actual y escribe en él
 * los nombres, edades y estaturas de los jugadores de un equipo, cada uno en una línea.
 *
 * Implementa un programa que lea del fichero los datos, muestre los nombres y calcule la media de la edad y de las
 * estaturas, mostrándolas por pantalla.
 */

import java.io.*;
import java.util.Scanner;

public class Act_03 {
    public static void main (String[] args) {
        FileInputStream jugadores;
        String linea[];
        String nombre;
        int edad, nLineas = 0;
        double estatura, mediaEdad = 0, mediaEstatura = 0;

        try {
            jugadores = new FileInputStream("archivos_txt/Jugadores.txt");
            Scanner sc = new Scanner(jugadores);

            while (sc.hasNext()) {
                linea = sc.nextLine().split(" "); //solo una vez por cada jugador
                nLineas++;
                nombre = linea[0];
                edad = Integer.parseInt(linea[1]);
                estatura = Double.parseDouble(linea[2]);
                mediaEdad += edad;
                mediaEstatura += estatura;
                System.out.println("Nombre: " + nombre);
                System.out.println("Media de edad: " + mediaEdad + " | Media de estatura: " + mediaEstatura);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
