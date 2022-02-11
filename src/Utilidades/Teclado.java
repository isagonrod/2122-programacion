package Utilidades;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase con métodos de utilidad para pedir valores por teclado.
 */
public class Teclado {

    /** Muestra un mensaje por consola para pedir un número por teclado.
     *
     * @param message mensaje a mostrar
     * @return int - el número insertado por teclado
     */
    public static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    /** Muestra un mensaje por consola para pedir una cadena por teclado.
     *
     * @param message mensaje a mostrar
     * @return String - la cadena insertada por teclado
     */
    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    /** Genera un array de números enteros pedidos por teclado.
     *
     * @param message mensaje a mostrar
     * @param numFinal número a considerar como el que finaliza el bucle de solicitud
     * @return Integer[] - el array construido
     */
    public static Integer[] getIntegerArray(String message, Integer numFinal) {
        Integer[] resultado = new Integer[0];
        Integer numActual;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(message);
            numActual = sc.nextInt();
            if (numActual != numFinal) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = numActual;
            }
        } while(numActual != numFinal);

        return resultado;
    }

    /** Pide escribir una opción por teclado.<br>
     * Repite la petición hasta que el valor esté entre el mínimo y el máximo.
     *
     * @param opcionMin valor mínimo de la opción
     * @param opcionMax valor máximo de la opción
     * @return int - la opción insertada si es válida
     */
    public static int leerOpcion (int opcionMin, int opcionMax) {
        int opcionValida;
        do {
            opcionValida = getNumber("Elige una opción: ");
        } while (opcionValida < opcionMin || opcionValida > opcionMax);
        return opcionValida;
    }
}
