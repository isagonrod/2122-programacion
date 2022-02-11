package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_06 {
    /* Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
     * (mayúsculas, minúsculas y acentuadas).
     * Por ejemplo, "Álvaro Pérez" se mostrará "lvr Prz".
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales = "";
        char c;
        int i;

        System.out.println("Escriba su nombre completo: ");
        nombre = sc.nextLine();

        for (i = 0; i < nombre.length(); i++) {
            c = nombre.charAt(i);
            if (!esVocal(c)) {
                sinVocales = sinVocales + c;
            }
        }
        System.out.println(sinVocales);
    }

    static boolean esVocal (char c) {
        boolean result;
        String vocales = "aeiouáéíóúü";
        c = Character.toLowerCase(c);
        if (vocales.indexOf(c) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
