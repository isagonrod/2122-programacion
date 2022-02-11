package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {
    /* Diseña el juego "Acierta la contraseña".
     * La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación, el segundo
     * jugador debe teclear palabras hasta que la acierte.
     * Realizar dos versiones:
     *  1.- En la primera se facilita el juego indicando si la palabra introducida es mayor o menor alfabéticamente
     *      que la contraseña.
     *  2.- En la segunda, el programa mostrará la longitud de la contraseña y una cadena con los caracteres
     *      acertados en sus lugares respectivos y asteriscos en los no acertados.
     */
    public static void main (String[] args) {

        /* VERSIÓN 1 */

        Scanner sc = new Scanner(System.in);

        String password, palabra;
        int comparacion;

        System.out.println("JUGADOR 1. Introduce la contraseña: ");
        password = sc.nextLine();

        do {
            System.out.println("JUGADOR 2. Introduce palabra: ");
            palabra = sc.nextLine();
            comparacion = password.compareTo(palabra);
            if (comparacion == 0) {
                System.out.println("¡Acertaste!");
            } else if (comparacion < 0) {
                System.out.println("La contraseña es menor que " + palabra);
            } else {
                System.out.println("La contraseña es mayor que " + palabra);
            }
        } while (!password.equals(palabra));
    }

    /* VERSIÓN 2 */

    public static void solutionTwo (String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, palabra, pista;
        int i;

        System.out.println("JUGADOR 1. Introduce la contraseña: ");
        password = sc.nextLine();
        System.out.println("La contraseña tiene " + password.length() + " caracteres\n");

        System.out.println("JUGADOR 2. Introduce palabra: ");
        palabra = sc.nextLine();

        while (!palabra.equals(password)) {
            pista = "";
            for (i = 0; i < password.length(); i++) {
                if (password.charAt(i) == palabra.charAt(i)) {
                    pista += password.charAt(i);
                } else {
                    pista += '*';
                }
            }
            System.out.println(pista);
            System.out.println("\nJUGADOR 2. Introduzca palabra de nuevo: ");
            palabra = sc.nextLine();
        }
        System.out.println("\n¡Acertaste!");
    }
}
