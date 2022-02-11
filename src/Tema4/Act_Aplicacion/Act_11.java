package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_11 {

	// Diseñar una funcion que calcule y muestre la superficie y el volumen de una esfera

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.println("Introduce el radio de la esfera: ");
		radio = sc.nextDouble();
		
		esfera (radio);
	}
	
	static void esfera (double radio) {
		double superficie;
		double volumen;
		
		superficie = 4 * Math.PI * Math.pow(radio, 2);
		volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		
		System.out.println("La superficie de la esfera es de: " + superficie);
		System.out.println("El volumen de la esfera es de: " + volumen);
	}
}
