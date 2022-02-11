package Juegos;

import java.util.Scanner;

public class Ahorcado {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0, i;
        String palabraSecreta;
        char[] palabraSinTerminar;
        char letra;

        palabraSecreta = getString("JUGADOR 1. Introduce la palabra secreta: ");
        palabraSinTerminar = new char[palabraSecreta.length()];

        rellenarPalabraIncompleta(palabraSinTerminar);
        imprimirPalabra(palabraSinTerminar);

        while (!String.valueOf(palabraSinTerminar).equals(palabraSecreta) && intentos <= 7) {
            letra = getString("JUGADOR 2. Introduce una letra: ").charAt(0);

            if (!comprobarLetra(letra, palabraSinTerminar, palabraSecreta)) {
                intentos++;
            }
            System.out.print(dibujarAhorcado(intentos));
            imprimirPalabra(palabraSinTerminar);
        }

        if (intentos >= 7) {
            System.out.println("LO SIENTO. HAS PERDIDO. SUERTE LA PRÓXIMA VEZ");
        } else {
            System.out.println("¡ENHORABUENA!¡HAS ACERTADO!");
        }
    }

    static boolean comprobarLetra(char letra, char[] palabraSinTerminar, String palabraSecreta) {
        boolean resultado = false;
        int i;

        for (i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraSinTerminar[i] = letra;
                resultado = true;
            }
        }

        return resultado;
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static void rellenarPalabraIncompleta(char[] palabraSinTerminar) {
        int i;
        for (i = 0; i < palabraSinTerminar.length; i++) {
            palabraSinTerminar[i] = '_';
        }
    }

    static void imprimirPalabra(char[] palabraSinTerminar) {
        int i;
        for (i = 0; i < palabraSinTerminar.length; i++) {
            System.out.print(palabraSinTerminar[i] + " ");
        }
        System.out.println("");
    }

    static String dibujarAhorcado(int intentos){
        String dibujo="";

        switch(intentos) {
            case 0:
                dibujo="_____\n";
                break;
            case 1:
                dibujo="|\n|\n|\n_____\n";
                break;
            case 2:
                dibujo="|\n|\n|\n|\n|\n_____\n";
                break;
            case 3:
                dibujo="____\n|\n|\n|\n|\n|\n_____\n";
                break;
            case 4:
                dibujo="____\n|      |\n|\n|\n|\n|\n_____\n";
                break;
            case 5:
                dibujo="____\n|      |\n|     O\n|\n|\n|\n_____\n";
                break;
            case 6:
                dibujo="____\n|      |\n|     O\n|      |\n|\n|\n_____\n";
                break;
            case 7:
                dibujo="____\n|      |\n|     O\n|      |\n|     /\\  \n|\n_____\n";
                break;
        }
        return dibujo;
    }
}
