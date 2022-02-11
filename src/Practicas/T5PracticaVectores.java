package Practicas;

import java.util.Arrays;
import java.util.Scanner;

public class T5PracticaVectores {

    /* Crear un programa modular para jugar a las 7 y media.
     * Se trata de un juego de cartas (con baraja española)
     * en el que el objetivo es alcanzar una puntuación de 7.5.
     * Cada carta del 1 al 7 tiene su valor nominal y cada figura
     * (sota, caballo y rey) vale 0.5 puntos.
     *
     * NOTA: Para barajar, mezcle los elementos de un vector de cartas
     * intercambiando en repetidas ocasiones cartas elegidas al azar con
     * la ayuda de la función Math.random().
     */

    public static void main (String[] args) {
        int[] barajaMonton = { //baraja de 40 cartas
                1 ,2 ,3 ,4 ,5 ,6 ,7 ,10,11,12, //oros
                21,22,23,24,25,26,27,30,31,32, //copas
                41,42,43,44,45,46,47,50,51,52, //espadas
                61,62,63,64,65,66,67,70,71,72  //bastos
        };
        int[] barajaPropia = new int[0];
        int masCartas = 0;
        double suma = 0.0;

        do {
            barajaPropia = darCarta(barajaPropia, barajaMonton);
            barajaMonton = Arrays.copyOf(barajaMonton, barajaMonton.length - 1);

            suma += darValorCarta(barajaPropia[barajaPropia.length - 1]);

            barajaToString(barajaPropia);
            System.out.println("Tus puntos: " + suma);

            if (suma < 7.5) {
                masCartas = getNumber("¿Quieres más cartas? 1 para sí, 0 para no");
            }
        }
        while (masCartas != 0 && suma < 7.5);

        if (suma == 7.5) {
            System.out.println("¡ENHORABUENA! ¡HAS GANADO!");
        } else if (suma > 7.5) {
            System.out.println("LO SIENTO. ¡HAS PERDIDO!");
        } else {
            System.out.println("LO SIENTO. TE HAS QUEDADO CORTO.");
        }
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static int[] darCarta(int[] barajaPropia, int[] barajaMonton) {
        int indiceCarta, barajaPropiaNueva[];

        do {
            indiceCarta = (int) (Math.random() * barajaMonton.length);
        } while (indiceCarta < 0 || indiceCarta > barajaMonton.length - 1);

        barajaPropiaNueva = Arrays.copyOf(barajaPropia, barajaPropia.length + 1);
        barajaPropiaNueva[barajaPropiaNueva.length - 1] = barajaMonton[indiceCarta];

        System.arraycopy(barajaMonton, indiceCarta + 1, barajaMonton, indiceCarta, barajaMonton.length - indiceCarta - 1);

        return barajaPropiaNueva;
    }

    static void barajaToString (int[] baraja) {
        int i;

        System.out.print("Tus cartas: ");
        for (i = 0; i < baraja.length; i++) {
            System.out.print(darNombreCarta(baraja[i]) + ", ");
        }
    }

    static String darNombreCarta (int valor) {
        String resultado = "";

        if (valor > 1 && valor <= 12) {
            resultado = valor + " de oros";
        }
        else if (valor > 12 && valor <= 32) {
            resultado = (valor - 20) + " de copas";
        }
        else if (valor > 32 && valor <= 52) {
            resultado = (valor - 40) + " de espadas";
        }
        else if (valor > 52 && valor <= 72) {
            resultado = (valor - 60) + " de bastos";
        }

        return resultado;
    }

    static double darValorCarta (int valor) {
        double resultado;

        if (valor > 12 && valor <= 32) {
            valor = valor - 20;
        }
        else if (valor > 32 && valor <= 52) {
            valor = valor - 40;
        }
        else if (valor > 52 && valor <= 72) {
            valor = valor - 60;
        }

        if (valor == 10 || valor == 11 || valor == 12) {
            resultado = 0.5;
        }
        else {
            resultado = valor;
        }

        return resultado;
    }
}
