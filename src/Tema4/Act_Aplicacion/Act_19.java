package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_19 {

	/* ENUNCIADO:
	 * Sobrecarga la función realizada en la Act_18 para que el único parámetro sea la cantidad de números aleatorios que se muestra por consola.
	 * Los números aleatorios serán reales y estarán comprendidos entre 0 y 1.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cantidad;
		
		System.out.println("Introduce la cantidad de números que quieres que se muestre: ");
		cantidad = sc.nextInt();
		
		mostrarAleatorios(cantidad);
	}

	static void mostrarAleatorios (int cantidad) {
		int i;

		for (i = 0; i < cantidad; i++) {
			System.out.println(Math.random());
		}
	}
}
