package Tema5.Act_Propuestas;

import java.util.Scanner;

public class Act_03 {

	/* Introduce por teclado un número n; a continuación, solicita al usuario que teclee n números.
	 * Realiza la media de los números positivos, la media de los números negativos y cuenta el número de ceros introducidos.
	 */

	public static void main(String[] args) {
		
		int num = getNumber("Introduce un número: ");
		int tabla[] = new int [num];
		int positivos = 0, mediaPositivos = 0, negativos = 0, mediaNegativos = 0, ceros = 0;
		
		for (int i = 0; i < num; i++) {
			tabla[i] = getNumber("Introduce un valor: ");
			if (tabla[i] > 0) {
				positivos++;
				mediaPositivos += tabla[i];
			}
			else if (tabla[i] < 0) {
				negativos++;
				mediaNegativos += tabla[i];
			}
			else {
				ceros++;
			}
		}
		mediaPositivos /= positivos;
		mediaNegativos /= negativos;
		
		System.out.println("La media de los números positivos es: " + mediaPositivos);
		System.out.println("La media de los números negativos es: " + mediaNegativos);
		System.out.println("La cantidad de ceros introducida es de: " + ceros);
		
	}

	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
}
