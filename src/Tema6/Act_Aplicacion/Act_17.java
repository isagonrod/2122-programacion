package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_17 {
    /* Construir un programa que convierta una palabra en secuencia de n letras.
     * Por ejemplo, la palabra <<destornillador>>, dividida en secuencias de 4 letras, se mostrará de la siguiente forma:
     *      dest
     *      orni
     *      llad
     *      or
     */
    public static void main (String[] args) {
        String palabra = getString("Introduce una palabra o frase: ");
        int nLetras = getNumber("Introduce un número para dividir la palabra o frase en secuencias de esa cantidad de letras: ");

        palabra = palabra.replace(" ", ""); //quitamos de en medio los espacios de las frases

        for (int i = 0; i < palabra.length(); i += nLetras) { //sumamos nLetras en vez de 1 para poder trabajar con substring
            if (i + nLetras > palabra.length()) { //comprobar si nos hemos pasado de tamaño a recortar (da una excepción)
                nLetras = palabra.length() - i;
            }
            System.out.println(palabra.substring(i, i + nLetras));
        }
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
