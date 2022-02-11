package Tema4.Recursividad;

import java.util.Arrays;
import java.util.Scanner;

public class Anexo_Act_02 {
    /* Leer un número positivo y mostrar la secuencia numérica entre dicho número y 1 */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (positivo): ");

        int num = sc.nextInt();
        int[] resultado = new int[num];
        resultado = secuencia(num, num, resultado); //empezamos rellenando en cuenta atrás

        System.out.print("La secuencia es la siguiente: " + Arrays.toString(resultado));
    }

    static int[] secuencia(int objetivo, int actual, int[] resultado) { //necesitamos saber la posición actual del "contador" de la secuencia
        if (actual > 0) { //comprobamos si es válido el índice, de lo contrario, hemos acabado y vamos al return sí o sí
            resultado[objetivo - actual] = actual; //el índice lo construimos calculando la posición actual con la deseada (ej.: 5 - 5 nos da el índice 0)
            resultado = secuencia(objetivo, actual - 1, resultado);
        }
        return resultado;
    }
}
