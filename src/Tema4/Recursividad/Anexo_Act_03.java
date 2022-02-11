package Tema4.Recursividad;

import java.util.Scanner;

public class Anexo_Act_03 {
    /* Multiplicación de dos enteros, usando la suma */

    public static void main (String[] args) {
        int num1 = getNumber("PRIMER NÚMERO: ");
        int num2 = getNumber("SEGUNDO NÚMERO: ");

        int resultado = multiplicar(num1, num2);

        System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + resultado);
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static int multiplicar(int num1, int num2) {
        int resultado;
        if (num2 == 1) {
            resultado = num1;
        } else {
            resultado = multiplicar(num1, num2 - 1) + num1;
        }
        return resultado;
    }
}
