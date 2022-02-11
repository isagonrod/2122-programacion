package Tema3.Anexo;

import java.util.Scanner;

public class Act_10 {
	
	// Dibuja una piramide hueca

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i, j, k, espacio;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		espacio = num;
		
		for (i=1; i <= num; i++) { 				// i = fila
			for (j=0; j < espacio-1; j++) { 	// j = contador de espacios delante
				System.out.print(" ");
			}
			espacio--;
			for (k=0; k < ((num-espacio)*2)-1; k++) { 	// k = columna, cuenta los asteriscos - contador hasta -1 para evitar espacio sobrante al final
				if (k == 0 || (k > 1 && k == ((num-espacio)*2)-2) || i == num) { //si estamos en la primera columna, en la ultima, o en la ultima fila
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
