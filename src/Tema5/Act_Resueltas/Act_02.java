package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Act_02 {

	/* Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales.
	 * A continuación, mostrar los números en el mismo orden que se han introducido.
	 */

	public static void main(String[] args) {		
		
		double tabla [] = new double [5];
		
		for (int i = 0; i < 5; i++) {
			tabla[i] = getNumber("Introduce un número: ");
		}
		System.out.println(Arrays.toString(tabla));
	}
	
	static double getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println(message);
		return sc.nextDouble();
	}

}
