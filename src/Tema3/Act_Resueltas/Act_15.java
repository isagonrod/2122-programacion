package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_15 {

	public static void main(String[] args) {
		
		// Resolucion pizarra
		
		int i, j, num = 4;
		
		for (i = 0; i < num; i++) {
			for (j = 1; j <= num-i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		// Resolucion libro
		
		int fila, columna, numero = 4;
				
		for (fila = 0; fila <= numero; fila++) {
			for (columna = fila; columna <= numero; columna++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
				
	}
}


