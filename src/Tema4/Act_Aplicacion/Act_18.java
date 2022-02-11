package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_18 {
	
	/* ENUNCIADO:
	 * Crea una función que muestre por consola una serie de números aleatorios enteros.
	 * Los parámetros de la función serán: la cantidad de números aleatorios que se mostrarán 
	 * y los valores mínimos y máximos que estos pueden tomar.
	 */

	/*	Función: void mostrarAleatorios (int cantidad, int rangoInf, int rangoSup)
	 * 				int numAleatorio;
	 * 				for (int i=0; i<cantidad; i++)
	 * 				numAleatorio= ... Math.random();
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cantidad, rangoInf, rangoSup;
		
		System.out.println("Introduce la cantidad de números que quieres que se muestre: ");
		cantidad = sc.nextInt();
		
		System.out.println("Introduce el rango inferior de números que quieres que se muestre: ");
		rangoInf = sc.nextInt();
		
		System.out.println("Introduce el rango superior que quieres que se muestre: ");
		rangoSup = sc.nextInt();
		
		mostrarAleatorios(cantidad, rangoInf, rangoSup);
		System.out.println();
		mostrarAleatorios(cantidad);
	}

	static void mostrarAleatorios (int cantidad, int rangoInf, int rangoSup) {
		int i, num;

		for (i = 0; i < cantidad; i++) {
			num = (int) (Math.random() * rangoSup + rangoInf);
			if (num >= rangoInf && num <= rangoSup) {
				System.out.println(num);
			}
			else {
				num--; // si el numero no vale, descontar para que no acabe antes de tiempo el bucle
			}
		}
	}
	
	static void mostrarAleatorios (int cantidad) {
		int i;

		for (i = 0; i < cantidad; i++) {
			System.out.println(Math.random());
		}
	}
}
