package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_02 {
    /* Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos
     * caracteres.
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Segunda frase: ");
        String frase2 = sc.nextLine();

        int longFrase1 = frase1.length();
        int longFrase2 = frase2.length();

        if (longFrase1 == longFrase2) {
            System.out.println("Son de idéntica longitud");
        } else if (longFrase1 < longFrase2) {
            System.out.println(frase1 + " es más corta que " + frase2);
        } else {
            System.out.println(frase2 + " es más corta que " + frase1);
        }
    }
}
