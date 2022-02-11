package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num, suma;
		
		System.out.println("Introduce cualquier numero que no sea multiplo de 7: ");
		num = teclado.nextInt();
		
		suma = 7 - num%7;
		suma = (suma == 7) ? 0 : suma;
		
		System.out.println("Tienes que sumar " + suma + " para que " + num + " sea multiplo de 7.");

	}

}
