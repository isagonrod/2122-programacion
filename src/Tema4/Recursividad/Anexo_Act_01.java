package Tema4.Recursividad;

import java.util.Arrays;
import java.util.Scanner;

public class Anexo_Act_01 {
    /* Leer un número positivo y mostrar la secuencia numérica entre 1 y dicho número */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (positivo): ");

        int num = sc.nextInt();
        int[] resultado = new int[num];
        resultado = secuencia(num, resultado); //empezamos rellenando en cuenta atrás

        System.out.print("La secuencia es la siguiente: " + Arrays.toString(resultado));
    }

    static int[] secuencia(int num, int[] resultado) {
        if (num - 1 >= 0) { //comprobamos si es válido el índice, de lo contrario, hemos acabado y vamos al return sí o sí
            resultado[num - 1] = num; //el indice del array llega a -1 si empezamos desde 1 a x
            resultado = secuencia(num - 1, resultado);
        }
        return resultado;
    }
}
