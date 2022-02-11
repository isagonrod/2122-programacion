package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_14 {
    /* Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y la aplicación muestra
     * un anagrama (cambio del orden de los caracteres) generado al azar.
     * A continuación, otro jugador tiene que acertar cuál es el texto original.
     * La aplicación no debe permitir que el texto introducido por el jugado 1 sea la cadena vacía.
     * Por ejemplo, si el jugador 1 escribe << teclado >>, la aplicación muestra como pista un anagrama al azar,
     * como por ejemplo: << etcloda >>.
     */
    public static void main (String[] args) {
        String original, intento;

        do {
            original = getString("JUGADOR 1. Introduce una palabra: ");
        } while (original.isEmpty());

        String anagrama = creaAnagrama(original);
        System.out.println("¿A qué palabra corresponde el anagrama " + anagrama + "?");

        do {
            intento = getString("JUGADOR 2. ¿Cuál es el original?");
        } while (!original.equals(intento));
        System.out.println("¡HAS ACERTADO!");
    }

    static String creaAnagrama(String original) {
        char anagrama[] = original.toCharArray();
        int numCambios, i, j;
        char aux;

        for (numCambios = 0; numCambios < anagrama.length; numCambios++) {
            i = (int)(Math.random() * anagrama.length);
            j = (int)(Math.random() * anagrama.length);
            aux = anagrama[i];
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
