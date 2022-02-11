package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num, mult, suma;
		
		System.out.println("Introduce cualquier numero: ");
		num = teclado.nextInt();
		
		System.out.println("Indica de que numero quieres saber que es multiplo: ");
		mult = teclado.nextInt();
		
		suma = mult - num%mult;
		suma = (suma == mult) ? 0 : suma;
		
		System.out.println("Tienes que sumar " + suma + " para que " + num + " sea multiplo de " + mult);
		
	}

}
