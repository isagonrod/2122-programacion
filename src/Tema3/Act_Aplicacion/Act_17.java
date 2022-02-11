package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_17 {
	
	// Maximo Comun Divisor de a y b

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int a, b, i, result=0, menor;
		
		System.out.println("Dame un numero: ");
		a = sc.nextInt();
		System.out.println("Dame otro numero: ");
		b = sc.nextInt();
		
		if (a < b) {
			menor = a;
		} else {
			menor = b;
		}

		for (i = menor; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				result = i;
				break;
			}
		}
		System.out.println("El maximo comun divisor de " + a + " y " + b + " es " + result);
	}
}
