package Tema3.Anexo;

import java.util.Scanner;

public class Act_12 {

	// Dibujar una torre o rectangulo levantado

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int base, altura, i, j;
		
		System.out.println("Dame la base: ");
		base = sc.nextInt();
		System.out.println("Dame la altura: ");
		altura = sc.nextInt();
		
		for (i = 0; i < altura; i++) {
			for (j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
