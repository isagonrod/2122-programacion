package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce tu edad: ");
		num = teclado.nextInt();
		
		System.out.println("Tu edad es: " + num);
		
		num++;
		System.out.println("Tu edad el año que viene sera: " + num);
	}
}
