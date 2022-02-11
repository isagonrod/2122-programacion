package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_11 {
    /* Se dispone de la siguiente relación de letras:
     *      conjunto 1: e, i, k, m, p, q, r, s, t, u, v
     *      conjunto 2: p, v, i, u, m, t, e, r, k, q, s
     *
     * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente del
     * conjunto 2.
     * El resto de las letras no se modifican.
     * Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación
     * en minúsculas.
     * Un ejemplo: la palabra << PaquiTo >> se codifica como << matqvko >>.
     *
     * Realiza un programa que codifique un texto. Para ello implementa la siguiente función:
     *      char codifica (char conjunto1[], char conjunto2[], char c)
     * que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
     */
    public static void main (String[] args) {
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char codificado[];
        String texto;

        texto = getString("Introduce un texto a codificar: ");
        texto = texto.toLowerCase();

        codificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(codificado);
        System.out.println(texto);
    }

    static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        final String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
