package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_19 {
    /* Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, permita reemplazar todas
     * las ocurrencias de la palabra por otra.
     */
    public static void main (String[] args) {
        String texto = getString(" -- TEXTO -- ");
        String palabra = getString("\n¿Qué palabra quieres cambiar?");
        String ocurrencia = getString("\n¿Por qué otra palabra la quieres cambiar?");

        texto = texto.replace(palabra,ocurrencia);

        System.out.println("\n" + texto);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
