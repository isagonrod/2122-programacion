package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int nota1;
		int nota2;
		double media;
		
		System.out.println("Introduce la nota 1:");
		nota1 = teclado.nextInt();
		
		System.out.println("Introduce la nota 2:");
		nota2 = teclado.nextInt();
		
		media = (nota1 + nota2) / 2.0;
		System.out.println("La media aritmetica es:" + media);
		
	}

}
