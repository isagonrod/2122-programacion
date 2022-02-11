package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_16 {
	
	// Mostrar 5 numeros consecutivos y decir cuales son primos y cuales no

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i, j, resto;
		boolean primo;
				
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i = num; i <= num+5; i++) {
			resto = 0;
			primo = false;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					resto++;
				}
			}
			if (resto <= 2) { //si hay dos o menos resto 0 (1 y si mismo) era primo
				primo = true;
			}
			System.out.println(i + " es primo: " + primo);
		}
	}
}
