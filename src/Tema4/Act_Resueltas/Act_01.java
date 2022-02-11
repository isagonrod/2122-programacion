package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_01 {
	
	// Aparece "ECO..." un numero X de veces por pantalla

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un numero: ");
		n = sc.nextInt();
		
		System.out.println();
		eco(n);
	}
	
	static void eco (int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Eco...");
		}
	}
}
