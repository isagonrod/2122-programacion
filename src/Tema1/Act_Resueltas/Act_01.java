package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_01 {

	public static void main(String[] args) {
	
		System.out.println("Introduce un numero:");
		Scanner teclado = new Scanner (System.in);
		int num;
		num = teclado.nextInt();
		System.out.println("El numero tecleado es: " + num);
		
		double raiz = Math.sqrt(num);
		System.out.println("La raiz del numero " + num + " es: " + raiz);
		System.out.println("La raiz del numero " + num + " es: " + Math.sqrt(num));
		
		double numDec;
		System.out.println("Introduce un numero con coma decimal:");
		numDec = teclado.nextDouble();
		System.out.println("El numero tecleado es: " + numDec);
	}

}
