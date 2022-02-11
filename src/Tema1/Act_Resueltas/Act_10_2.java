package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_10_2 {


	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int rangosup;
		
		System.out.println("Introduce el rango superior:");
		rangosup = teclado.nextInt();
		
		int rangoinf;
		System.out.println("Introduce el rango inferior:");
		rangoinf = teclado.nextInt();
		
		int num;
		System.out.println("Introduce un numero:");
		num = teclado.nextInt();
		
		boolean result = (num > rangoinf) && (num < rangosup);
		System.out.println("El numero pertenece al intervalo: " + result);

	}

}
