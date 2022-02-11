package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int a, b, c, x;
		double y;
		
		System.out.println("Introduce el valor de a: ");
		a = teclado.nextInt();
		
		System.out.println("Introduce el valor de b: ");
		b = teclado.nextInt();
		
		System.out.println("Introduce el valor de c: ");
		c = teclado.nextInt();
		
		System.out.println("Introduce el valor de x: ");
		x = teclado.nextInt();
		
		y = (a * Math.pow(x, 2)) + (b * x) + c;
		System.out.println("El valor de y es: " + y);
		
		
	}

}
