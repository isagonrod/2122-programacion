package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_09_3 {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		boolean multiplo = (num%5) == 0;
		System.out.println("El numero es multiplo de 5: " + multiplo);
		
	}

}
