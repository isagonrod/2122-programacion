package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_14 {
	
	// Buscar cuantos numeros primos hay entre 1 y num
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i, j, restos, result = 0;
		
		// El 1 y el 2 se consideran primos
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i=1; i <= num; i++) { //numeros desde 1 hasta x que pueden ser primos
			restos = 0;
			for (j=1; j <= num; j++) { //numeros desde 1 hasta x para comprobar si i es primo
				if (i % j == 0) {
					restos++;
				}
			}
			if (restos <= 2) { //si hay dos o menos resto 0 (1 y si mismo) era primo
				result++;
			}
		}
		System.out.println("Hay " + result + " numero(s) primo(s)");
	}
}
