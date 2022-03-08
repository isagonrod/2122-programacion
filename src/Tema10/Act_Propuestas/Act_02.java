package Tema10.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 10.2
 * Pide por teclado el nombre, la edad (int) y la estatura en metros (double) de un deportista.
 * Introduce los datos en una sola línea y léelos con un objeto Scanner.
 * Muestra los resultados por pantalla.
 */

import java.util.Scanner;

public class Act_02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir datos del deportista: ");
        String nombre = sc.next();

        System.out.println("Introduce edad del deportista: ");
        Integer edad = Integer.parseInt(sc.next());

        System.out.println("Introduce estatura del deportista (en metros): ");
        Double estatura = Double.valueOf(sc.next());

        System.out.println("NOMBRE: " + nombre + " | EDAD: " + edad + " | ESTATURA: " + estatura + " m");
    }
}
