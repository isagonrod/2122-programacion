package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_05 {

	/* Crear una funcion que, mediante un booleano, indique si el caracter que se pasa como parametro de entrada 
	 * corresponde con una vocal 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char caracter;
		
		System.out.println("Introduce un caracter: ");
		caracter = sc.next().charAt(0);
		System.out.println("La " + caracter + " es una vocal: " + esVocal(caracter));
	}
	
	static boolean esVocal (char caract) {
		boolean result;
		if (caract == 'a' || caract == 'A' || caract == 'e' || caract == 'E' 
				|| caract == 'i' || caract == 'I' || caract == 'o'
				|| caract == 'O' || caract == 'u' || caract == 'U') {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
