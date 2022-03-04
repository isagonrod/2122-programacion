package Tema10.Act_Resueltas;

/* ACTIVIDAD RESUELTA 10.1
 * Escribir el método Integer leerEntero(), que pide un entero por consola, lo lee del teclado y lo devuelve.
 * Si la cadena introducida por consola no tiene el formato correcto, muestra un mensaje de error y vuelve a pedirlo.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act_01 {
    static Integer leerEntero() {
        Integer resultado;
        while (true) {
            try {
                System.out.println("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
            }
        }
        return resultado;
    }
}
