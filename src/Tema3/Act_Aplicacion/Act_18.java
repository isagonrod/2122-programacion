package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_18 {
	
	// Minimo Comun Multiplo de a y b

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int a, b, i, j, mayor, menor, n1, n2;
		
		System.out.println("Dame un numero: ");
		a = sc.nextInt();
		System.out.println("Dame otro numero: ");
		b = sc.nextInt();
		
		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
		}

		for (i = 1; i != 0; i++) {
			n1 = mayor * i;
			n2 = 0;
			for (j = 1; n2 < n1; j++) {
				n2 = menor * j;
				if (n1 == n2) {
					System.out.println("El minimo comun multiplo de " + a + " y " + b + " es " + n1);
					i = -1; //al dar la siguiente vuelta del for exterior, hace un i++ y nunca acaba el bucle
					break;
				}
			}
		}
		
		/* System.out.println("Escriba a: ");
		 * int a = new Scanner(System.in).nextInt();
		 * System.out.println("Escriba b: ");
		 * int b = new Scanner(System.in).nextInt();
		 * 
		 * int mayor = a > b ? a : b;
		 * int mcm = mayor;
		 * while (mcm % a != 0 || mcm % b != 0) {
		 * 		mcm += mayor;
		 * }
		 * System.out.println("Minimo comun multimo: " + mcm);
		 */
		
	}
}
