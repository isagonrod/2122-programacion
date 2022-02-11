package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número (negativo o positivo): ");
		int num = teclado.nextInt();
		
		int valorAbsoluto = num < 0 ? -1 * num : num;
		System.out.println("El valor absoluto del número introducido es: " + valorAbsoluto);
		
		int valorAbsoluto2 = Math.abs(num);
		System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto2);

	}

}
