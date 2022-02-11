package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {
	
	// Triangulo de base y altura X

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i, j, k, espacio;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		espacio = num;
		
		for (i=1; i <= num; i++) { 				// i = fila
			for (j=0; j < espacio-1; j++) { 	// j = contador de espacios
				System.out.print(" ");
			}
			espacio--;
			for (k=0; k < num-espacio; k++) { 	// k = columna, cuenta los asteriscos
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
