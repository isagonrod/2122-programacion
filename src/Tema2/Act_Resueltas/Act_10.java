package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int nota;
		
		System.out.println("Introducir nota: ");
		nota = teclado.nextInt();
		
		switch (nota) {
			case 0, 1, 2, 3, 4 -> System.out.print("Insuficiente");
			case 5 -> System.out.println("Suficiente");
			case 6 -> System.out.println("Bien");
			case 7, 8 -> System.out.println("Notable");
			case 9 -> System.out.println("Sobresaliente");
			default -> System.out.println("Error: Nota no valida");
		}

	}

}
