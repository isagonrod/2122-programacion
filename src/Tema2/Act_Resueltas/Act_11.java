package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un numero del 1 al 7: ");
		num = teclado.nextInt();
		
		switch (num) {
			case 1 -> System.out.println("Lunes");
			case 2 -> System.out.println("Martes");
			case 3 -> System.out.println("Miercoles");
			case 4 -> System.out.println("Jueves");
			case 5 -> System.out.println("Viernes");
			case 6 -> System.out.println("Sabado");
			case 7 -> System.out.println("Domingo");
		}

	}

}
