package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_07 {

	public static void main(String[] args) {		

		Scanner teclado = new Scanner (System.in);
		double radio;
		double longitud;
		double area;
		
		System.out.println("Introduce el radio: ");
		radio = teclado.nextDouble();
		
		longitud = 2.0 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2.0);
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		
	}

}
