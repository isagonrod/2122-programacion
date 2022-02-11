package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_15 {
    /* Modifica la Actividad Resuelta 6.14 para que el programa indique al jugador 2 cuántas letras coinciden
     * (son iguales y están en la misma posición) entre el texto introducido por él y el original
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
            System.out.println("Letras correctas: " + letrasCorrectas(original, intento));
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

    static int letrasCorrectas(String original, String intento) {
        int longitudMinima = Math.min(original.length(), intento.length());
        int contadorLetrasCorrectas = 0, i;
        for (i = 0; i < longitudMinima; i++) {
            if (original.charAt(i) == intento.charAt(i)) {
                contadorLetrasCorrectas++;
            }
        }
        return contadorLetrasCorrectas;
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
