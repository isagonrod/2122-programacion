package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El numero introducido es par");
		}

	}

}
