package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		double num;
		
		System.out.println("Introduce un numero (con decimales): ");
		num = teclado.nextDouble();
		
		if (num < 1 && num > -1 && num != 0) {
			System.out.println("El numero introducido es un casi-cero");
		}
		else {
			System.out.println("El numero introducido no es un casi-cero");
		}

	}

}
