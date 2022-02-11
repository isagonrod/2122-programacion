package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_17 {

	// Cambiar digito dentro de un numero

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int posicion, valorNuevo, i, cantidadDigitos = 0;
		long num, comprobador = 0, result = 0;

		System.out.println("Dame un numero: ");
		num = sc.nextLong();
		System.out.println("Dame la posicion a cambiar: ");
		posicion = sc.nextInt();
		System.out.println("Dame el valor nuevo: ");
		valorNuevo = sc.nextInt();

		comprobador = num;								// El comprobador es el numero auxiliar para ir haciendo las comprobaciones
		do { 											// Para saber cuantos digitos tiene el numero
			if (comprobador != 0) {
				cantidadDigitos++;
			}
			comprobador = comprobador / 10; 			// Se guardan los numeros divididos entre 10
		} while (comprobador > 0);

		comprobador = num;
		for (i = cantidadDigitos; i >= 1; i--) {		// Recorremos todos los digitos del numero
			if (i == posicion) { 						// Se comprueba si el numero de la posicion actual es la solicitada
				result += valorNuevo * Math.pow(10, cantidadDigitos - i);
			}
			else {
				result += comprobador % 10 * Math.pow(10, cantidadDigitos - i);
			}
			comprobador = comprobador / 10;
		}
		
		System.out.print("El nuevo numero es: " + result);
	}
}
