package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {

	// Calcular y mostrar el area o el volumen de un cilindro, segun se especifique
	// Opcion 1: area
	// Opcion 2: volumen
	// Pedir radio de la base y altura

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio;
		double altura;
		int tipoCalculo;
		
		System.out.println("Introduce el radio de la base del cilindro: ");
		radio = sc.nextDouble();
		System.out.println("Introduce la altura del cilindro: ");
		altura = sc.nextDouble();
		System.out.println("Qué desea calcular? Indicar: 1 (para area) o 2 (para volumen) ");
		tipoCalculo = sc.nextInt();
		
		System.out.println();
		cilindroAreaVolumen (radio, altura, tipoCalculo);
	}
	
	static void cilindroAreaVolumen (double radio, double altura, int tipoCalculo) {
		double volumen;
		double area;
		switch (tipoCalculo) {
			case 1 -> {
				area = 2 * Math.PI * radio * (altura + radio);
				System.out.println("El area del cilindro es de: " + area);
			}
			case 2 -> {
				volumen = Math.PI * Math.pow(radio, 2) * altura;
				System.out.println("El volumen del cilindro es de: " + volumen);
			}
			default -> {
				System.out.println("La opcion elegida no es valida");
			}
		}
	}
}
