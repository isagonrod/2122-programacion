package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {

	/* Implementa la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número
	 * que se le pasa como parámetro.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		divisoresPrimos (num);
	}

	static void divisoresPrimos (int num) {
		int i;
		for (i = 2; i < num; i++) {
			if (esPrimo(i) && num % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	static boolean esPrimo (int divisor) {
		int i, j, restos;
		boolean result=true;
		for (i = 1; i <= divisor; i++) {
			restos = 0;
			for (j = 1; j <= divisor; j++) {
				if (i % j == 0) {
					restos++;
				}
			}
			if (restos <= 2) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
}
