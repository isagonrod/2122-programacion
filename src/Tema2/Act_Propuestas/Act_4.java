package Tema2.Act_Propuestas;

import java.util.Scanner;

public class Act_4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		boolean mult;
		int num1, num2;
				
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		mult = (num1%num2) == 0;
		System.out.println("El numero " + num1 + " es multiplo de " + num2 + ": " + mult);

	}

}
