package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num; 
		
		System.out.println("Introduce un numero comprendido entre el 0 y el 99.999: ");
		num = teclado.nextInt();
		
		if (num < 10) {
			System.out.println("El numero tiene 1 cifra");
		} else if (num < 100) {
			System.out.println("El numero tiene 2 cifras");
		} else if (num < 1000) {
			System.out.println("El numero tiene 3 cifras");
		} else if (num < 10000) {
			System.out.println("El numero tiene 4 cifras");
		} else if (num < 100000) {
			System.out.println("El numero tiene 5 cifras");
		} else if (num < 1000000) {
			System.out.println("El numero tiene 6 cifras");
		}
	}
}
