package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {
    /* Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios
     * en blanco tiene.
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlanco = 0, i;
        char c;

        System.out.println("Escriba una frase: ");
        frase = sc.nextLine();

        for (i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)) {
                numEspaciosBlanco++;
            }
        }
        System.out.println("Tiene " + numEspaciosBlanco + " espacios en blanco");
    }
}
