package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_11_20211026 {

	// Dibuja un ROMBO
	// Altura impar

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int altura, fila, columna, espFila, espacio;
		
		do {
			System.out.println("Dame la altura del rombo: ");
			altura = sc.nextInt();
		} while (altura % 2 == 0);
		
		espFila = (altura-1)/2;
		
		for (fila=1; fila <= (altura-1)/2; fila++) {
			for (espacio=0; espacio < espFila; espacio++) {
				System.out.print(" ");
			}
			espFila--;
			for (columna=0; columna < ((((altura-1)/2)-espFila)*2)-1; columna++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		espFila = 0;
		
		for (fila=(altura+1)/2; fila >= 1; fila--) {
			for (espacio=0; espacio < espFila; espacio++) {
				System.out.print(" ");
			}
			espFila++;
			for (columna=((((altura+1)/2)-espFila)*2); columna >= 0; columna--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
