package Tema2.Act_Resueltas;

import java.util.Locale;
import java.util.Scanner;

public class Act_08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		teclado.useLocale (Locale.US);
		
		double a, b, c;
		double x1, x2, d;
		
		System.out.println("Primer coeficiente (a): ");
		a = teclado.nextDouble();
		System.out.println("Segundo coeficiente (b): ");
		b = teclado.nextDouble();
		System.out.println("Tercer coeficiente (c): ");
		c = teclado.nextDouble();
		
		d = (b*b) - (4*a*c);
		if (d < 0) {
			System.out.println("No existen soluciones posibles");
		} else {
			if (a == 0) {
				System.out.println("No es una ecuacion de segundo grado");
			} else {
				x1 = -b + Math.sqrt(d) / 2*a;
				x2 = -b - Math.sqrt(d) / 2*a;
				System.out.println("Solucion 1: " + x1);
				System.out.println("Solucion 2: " + x2);
			}
		}

	}

}
