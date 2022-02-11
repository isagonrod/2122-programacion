package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num;
				
		System.out.println("Introduce tu edad: ");
		num = teclado.nextInt();
		
		boolean mayorEdad = num >= 18;
		System.out.println("Mayor de edad: " + mayorEdad);
		
	}

}
