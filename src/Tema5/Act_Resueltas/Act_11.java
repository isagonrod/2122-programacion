package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_11 {

	/* Desarrollar el juego "la cámara secreta", que consiste en abrir una cámara mediante su combinación secreta, que está
	 * formada por una combinación de dígitos del 1 al 5. El jugador especificará cuál es la longitud de la combinación:
	 * a mayor longitud, mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación secreta
	 * que el usuario tendrá que acertar. En cada intento se muestra como pista, para cada dígito de la combinación introducido
	 * por el jugador, si es mayor, menor o igual que el correspondiente en la combinación secreta.
	 */

	public static void main(String[] args) {
		
		int longitud = getNumber("Longitud de la combinación secreta: ");
		int combSecreta[] = new int [longitud];
		int combJugador[] = new int [longitud];
		
		generaCombinacion (combSecreta);
		System.out.println(Arrays.toString(combSecreta));
		System.out.println("Escriba una combinación");
		leeTabla (combJugador);
		
		while (!Arrays.equals(combSecreta, combJugador)) {
			muestraPista (combSecreta, combJugador);
			System.out.println("Escriba una combinación: ");
			leeTabla(combJugador);
		}
		
		System.out.println("¡La cámara está abierta!");
	}

	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static void generaCombinacion (int t[]) {
		final int MAX = 5;
		for (int i = 0; i < t.length; i++) {
			t[i] = (int)(Math.random()*MAX+1);
		}
	}
	
	static void leeTabla (int t[]) {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
	
	static void muestraPista (int secret[], int jug[]) {
		System.out.println("Pistas:");
		for (int i = 0; i < jug.length; i++) {
			System.out.println(jug[i]);
			if (secret[i] > jug[i]) {
				System.out.println(" MAYOR");
			} else if (secret[i] < jug[i]) {
				System.out.println(" MENOR");
			} else {
				System.out.println(" IGUAL");
			}
		}
	}
}
