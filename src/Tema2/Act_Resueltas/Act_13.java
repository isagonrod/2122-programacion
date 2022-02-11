package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int h, min, seg;
		
		System.out.println("Introduce la hora: ");
		h = teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		min = teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		seg = teclado.nextInt();
		
		seg++;
		
		if (seg > 59) {
			seg = 0;
			min++;
		} 
		
		if (min > 59) {
			min = 0;
			h++;			
		}
		
		if (h > 23) {
			h = 0;
		}
		
		System.out.println("Hora actual + 1 segundo: " + h + " : " + min + " : " + seg);
		
	}

}
