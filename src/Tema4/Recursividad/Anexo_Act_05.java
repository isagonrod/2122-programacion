package Tema4.Recursividad;

import java.util.Arrays;
import java.util.Scanner;

public class Anexo_Act_05 {
    /* Búsqueda Binaria Recursiva */

    public static void main (String[] args) {
        int vector [] = new int [10], valor = 0, clave;
        generarArrayOrdenado(vector);

        clave = getNumber("¿Qué elemento quieres buscar?");

        System.out.println("El elemento " + clave + " está en el índice " + buscarElemento(vector, clave, 0, vector.length - 1));
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static void generarArrayOrdenado(int vector[]) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 69) + 1;
        }
        Arrays.sort(vector);

        System.out.println("El array generado es: " + Arrays.toString(vector));
    }

    static int buscarElemento (int vector[], int clave, int posInicial, int posFinal) {
        int posActual, posLocalizada = -1;

        if (posInicial <= posFinal) {
            posActual = (posInicial + posFinal) / 2;
            if (vector[posActual] == clave) { //fin de la recursion
                posLocalizada = posActual;
            } else if (posInicial >= posFinal) { //para cuando no encuentra el número
                posLocalizada = -1;
            } else if (vector[posActual] < clave) { //esto y el else deciden hacia qué lado del array hay que ajustar la búsqueda
                posLocalizada = buscarElemento(vector, clave, posActual + 1, posFinal);
            } else {
                posLocalizada = buscarElemento(vector, clave, posInicial, posActual - 1);
            }
        }

        return posLocalizada;
    }
}
