package Tema4.Recursividad;

import java.util.Scanner;

public class Act_Clase_01 {
    /* Escribir un método recursivo que recibe un número y lo muestre al revés */

    public static void main (String[] args) {
        int num = getNumber("NÚMERO: ");
        System.out.println(darVuelta(num));
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static String darVuelta(int num) {
        String result;
        if (num < 10) {
            result = String.valueOf(num);
        } else {
            result = String.valueOf(num%10) + darVuelta(num/10);
        }
        return result;
    }
}
