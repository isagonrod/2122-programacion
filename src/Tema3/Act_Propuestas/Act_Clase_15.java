package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_15 {
	
	// Dibujar una U con asteriscos

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int altura, fila=1, columna=1;
		
		System.out.println("Dame la altura de la U: ");
		altura = sc.nextInt();
		
		for (fila = 1; fila <= altura; fila++) {
			for (columna = 1; columna <= altura; columna++) {
				if ((columna == 1 && fila != altura) || 
						(columna == altura && fila != altura) || 
						(fila == altura && columna != 1 && columna != altura)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
