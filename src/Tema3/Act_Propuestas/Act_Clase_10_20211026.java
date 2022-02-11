package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_10_20211026 {

	// Dibujar una piramide invertida

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int altura, i, j, espacio, k;
		
		System.out.println("Dame la altura de la piramide: ");
		altura = sc.nextInt();
		
		espacio = 0;
		
		for (i=altura; i >= 1; i--) { 			// i = fila
			for (j=0; j < espacio; j++) { 		// j = contador de espacios
				System.out.print(" ");
			}
			espacio++;
			for (k=((altura-espacio)*2); k >= 0; k--) { 	// k = columna, cuenta los asteriscos
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
