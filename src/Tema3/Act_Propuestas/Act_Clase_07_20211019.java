package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_07_20211019 {

	public static void main(String[] args) {
		
		// Pedir un numero mayor o igual a 3
		// Dibujar un cuadrado relleno con asteriscos
		
		Scanner sc = new Scanner (System.in);
		int i, j, num;
		
		do {
			System.out.println("Dame un numero que sea mayor o igual a 3: ");
			num = sc.nextInt();
		} while (num < 3);
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		// Pedir un numero mayor o igual a 3
		// Dibujar un cuadrado hueco con asteriscos
		
		do {
			System.out.println("Dame un numero que sea mayor o igual a 3: ");
			num = sc.nextInt();
		} while (num < 3);
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				if (!(i==1 && j==1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}
}
