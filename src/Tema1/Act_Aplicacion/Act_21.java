package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_21 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int a, b;
		boolean result;
		
		System.out.println("Introduce un numero: ");
		a = teclado.nextInt();
		System.out.println("Intruduce otro numero: ");
		b = teclado.nextInt();
		
		result = a == b;
		System.out.println("El resultado es: " + result);

	}

}
