package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_12 {

	/* Implementa la funcion:
	 * 		static double distancia (double x1, double y1, double x2, double y2)
	 * que calcula y devuelve la distancia euclidea que separa los puntos (x1 y y1) y (x2, y2).
	 */

	public static void main(String[] args) {
		double x1, x2;
		double y1, y2;
		
		x1 = getNumber("Introduce el punto x1: ");
		x2 = getNumber("Introduce el punto x2: ");
		y1 = getNumber("Introduce el punto y1: ");
		y2 = getNumber("Introduce el punto y2: ");
		
		System.out.println("La distancia euclidea que separa a estos puntos es de: " + distancia(x1, y1, x2, y2));
	}
	
	static double distancia (double x1, double y1, double x2, double y2) {
		double distancia;
		distancia = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		return distancia;
	}
	
	static double getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextDouble();
	}
}
