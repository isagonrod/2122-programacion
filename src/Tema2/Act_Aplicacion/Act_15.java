package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int b, h;
		
		System.out.println("Introduce la base del triangulo: ");
		b = teclado.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		h = teclado.nextInt();
		
		if ((b <= 0) || (h <= 0)) {
			System.out.println("Error: Las medidas de un triangulo no pueden ser negativas");
		} else {
			System.out.println("El area del triangulo es: " + b*h/2);
		}

	}

}
