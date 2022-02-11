package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El primer numero es mayor que el segundo");
		}
		else {
			System.out.println("El segundo numero es mayor que el primero");
		}

	}

}
