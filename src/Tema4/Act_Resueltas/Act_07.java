package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_07 {

	// Escribir una funcion a la que se le pase un numero entero y devuelva el numero de divisores primos que tiene

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		System.out.println("Los divisores primos de " + num + " son: " + divisoresPrimos(num));
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
	
	static int divisoresPrimos (int div) {
		int j = 0;
		for (int i = 1; i <= div; i++) {
			if (esPrimo(i) && div % i == 0) {
				j++;
			}
		}
		return j;
	}
}
