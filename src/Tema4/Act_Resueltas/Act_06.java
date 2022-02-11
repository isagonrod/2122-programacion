package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_06 {

	/* Diseñar una funcion con el siguiente prototipo:
	 * 		boolean esPrimo (int n)
	 * que devolvera true si n es primo y false en caso contrario.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		for (i = 1; i <= num; i++) {
			if (esPrimo(i)) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i + " no es primo");
			}
		}
	}
	
	static boolean esPrimo (int n) {
		boolean primo = true;
		int i = 2;
		if (n < 1) {
			primo = false;
		}
		while (i <= (int) Math.sqrt(n) && primo == true) {
			if (n % i == 0) {
				primo = false;
			}
			i++;
		}
		return (primo);
	}

}
