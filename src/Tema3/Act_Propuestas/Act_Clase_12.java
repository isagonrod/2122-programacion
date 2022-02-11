package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_12 {
	
	// Exponentes de base fija

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int base, exponente, i;
		
		System.out.println("Dame un numero: ");
		base = sc.nextInt();
		System.out.println("Dame su exponente: ");
		exponente = sc.nextInt();
		
		for (i = 1; i <= exponente; i++) {
			System.out.println("Base " + base + ", exponente " + i); // El caracter ^ no es admitido en java
		}
	}
}
