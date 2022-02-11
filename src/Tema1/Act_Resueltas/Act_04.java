package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num;
		int nac;
		
		System.out.println("Introduce el a�o actual:");
		num = teclado.nextInt();
		
		System.out.println("Introduce tu a�o de nacimiento:");
		nac = teclado.nextInt();
		
		System.out.println("Tu edad es: " + (num - nac));
	}

}
