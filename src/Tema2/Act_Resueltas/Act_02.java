package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los dos numeros son iguales");
		}
		else {
			System.out.println("Los dos numeros son distintos");
		}

	}

}
