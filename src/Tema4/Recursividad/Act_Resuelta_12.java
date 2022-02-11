package Tema4.Recursividad;

import java.util.Scanner;

public class Act_Resuelta_12 {

    /* Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci.
     * En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie.
     * Es decir: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
     *      fibonacci(0) = 1
     *      fibonacci(1) = 1
     */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular FIBONACCI(n)");
        System.out.println("Introduce n (se recomienda n<40): ");

        int n = sc.nextInt();
        int resultado = fibo(n);

        System.out.println("\nFIBONACCI(" + n + ") = " + resultado);
    }

    static int fibo(int n) {
        int res;
        if (n == 0 || n == 1) {
            res = 1;
        } else {
            res = fibo(n-1) + fibo(n-2);
        }
        return res;
    }
}
