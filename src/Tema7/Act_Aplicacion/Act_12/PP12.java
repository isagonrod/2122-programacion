package Tema7.Act_Aplicacion.Act_12;

import java.util.Arrays;
import java.util.Scanner;

public class PP12 {

    public static void main(String[] args) {
        int a = getNumber("Introduce el valor de A: ");
        int b = getNumber("Introduce el valor de B: ");
        int c = getNumber("Introduce el valor de C: ");

        Ecuaciones ec = new Ecuaciones(a, b, c);
        double[] resultado;

        if (ec.discriminanteEsPositivo()) {
            resultado = ec.solucion();

            System.out.println("El resultado de la ecuación " + ec + " es: " + Arrays.toString(resultado));
        } else {
            System.out.println("La ecuación no tiene resultado real");
        }
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
