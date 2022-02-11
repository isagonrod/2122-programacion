package Tema5.Anexo;

import java.util.Arrays;
import java.util.Scanner;

public class Act_04 {

    /* Crear un vector tamaño 20 con valores aleatorios entre 0 y 10.
     * Pedir por teclado dos números y sustituir el primero por el segundo.
     */

    public static void main (String args[])
    {
        int vector[] = new int[20], numero1, numero2;

        rellenar(vector, 11);

        System.out.println("Tabla original: " + Arrays.toString(vector));

        numero1 = getNumber("Introduce el número a buscar: ");
        numero2 = getNumber("Introduce el número con el que sustituir al anterior: ");

        sustituir(vector, numero1, numero2);

        System.out.println("Tabla nueva: " + Arrays.toString(vector));
    }

    static void rellenar (int vector[], int valorMaximo) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * valorMaximo);
        }
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static int sustituir (int vector[], int numero1, int numero2) {
        boolean encontrado = false;
        int i;
        for (i = 0; i < vector.length; i++) {
            if (numero1 == vector[i]) {
                vector[i] = numero2;
            }
        }
        if (encontrado) {
            return i-1;
        } else {
            return -1;
        }
    }
}
