package Tema4.Recursividad;

import java.util.Locale;
import java.util.Scanner;

public class Act_Resuelta_10 {
    /* Diseña una función que calcule a elevado a n, donde a es real y n es entero no negativo.
     * Realizar una versión iterativa y otra recursiva.
     */

    public static void main (String[] args) {
        double base = getNumber("Introduce la base (real): ");
        int exponente = getOtherNumber("Introduce el exponente (entero no negativo): ");
        double res = aElevadoN(base,exponente);

        System.out.println(base + " elevado a " + exponente + " = " + res);
    }

    static double aElevadoN(double a, int n) {
        double res;
        if (n == 0) {
            res = 1;
        } else {
            res = a * aElevadoN(a, n-1);
        }
        return res;
    }

    static double getNumber(String mesagge) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println(mesagge);
        return sc.nextDouble();
    }

    static int getOtherNumber(String mesagge) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mesagge);
        return sc.nextInt();
    }
}
