package Tema4.Recursividad;

import java.util.Scanner;

public class Anexo_Act_04 {
    /* Escribir un número decimal en binario.
     *      a) Caso Base si n<2 el binario es él mismo, luego: escribir n.
     *      b) Si n>=2, en binario es el resultado de la división entera entre n y 2, seguido del resto de dividir n entre 2
     */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NÚMERO DECIMAL: ");
        int decimal = sc.nextInt();
        String resultado;

        resultado = pasarABinario(decimal);

        System.out.println(decimal + " en binario es: " + resultado);
    }

    static String pasarABinario(int decimal) {
        String resultado;
        if (decimal < 2) {
            resultado = "" + decimal;
        } else {
            resultado = "" + pasarABinario(decimal / 2) + (decimal % 2);
        }

        return resultado;
    }
}
