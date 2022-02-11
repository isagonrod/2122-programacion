package Tema3.Anexo;

import java.util.Scanner;

public class Act_11 {

	// Pintar una L con asteriscos

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int altura, i, j;
		
		System.out.println("Dame la altura de la L: ");
		altura = sc.nextInt();
		
		for	(i = 0; i < altura-1; i++) {
			System.out.println("*");
		}
			
		for (j = 0; j <= (altura / 2); j++) {
			System.out.print("*");
			}
	}
}
