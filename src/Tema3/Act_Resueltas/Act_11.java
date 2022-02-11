package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i, factorial=1;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i=num; i>0; i--) {
			factorial = factorial*i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
	}
}
