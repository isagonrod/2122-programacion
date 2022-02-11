package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_11 {
    /* Escribe un programa descodificador que muestre un texto codificado con el programa realizado en la
     * Actividad resuelta 6.11.
     */
    public static void main (String[] args) {
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char descodificado[];
        String texto;

        texto = getString("Introduce un texto a descodificar: ");
        texto = texto.toLowerCase();

        descodificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            descodificado[i] = descodifica(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(descodificado);
        System.out.println(texto);
    }

    static char descodifica(char[] conjunto1, char[] conjunto2, char c) {
        final String conj2 = String.valueOf(conjunto2);
        char descodificado;
        int pos = conj2.indexOf(c);
        if (pos == -1) {
            descodificado = c;
        } else {
            descodificado = conjunto1[pos];
        }
        return descodificado;
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
