package Tema2.Act_Propuestas;

import java.util.Scanner;

public class Act_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		boolean result; 
		int num1, num2;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		result = (num1 != num2) || (num1 == 0 || num2 == 0);
		System.out.println("El resultado es: " + result);		

	}

}
