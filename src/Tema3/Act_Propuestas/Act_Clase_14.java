package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_14 {
	
	// Buscar posicion digito

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, digito, i, cantidadDigitos = 0, comprobador = 0;

		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		System.out.println("Dame un digito: ");
		digito = sc.nextInt();

		comprobador = num;				// El comprobador es el numero auxiliar para ir haciendo las comprobaciones
		do { 							// Para saber cuantos digitos tiene el numero
			if (comprobador != 0) {
				cantidadDigitos++;
			}
			comprobador = comprobador / 10; // Se guardan los numeros divididos entre 10
		} while (comprobador > 0);

		comprobador = num;
		for (i = cantidadDigitos; i >= 1; i--) { //Se comprueba si el numero de la posicion actual es el digito o no
			if (digito == comprobador % 10) {
				System.out.println("La posicion del digito " + digito + " en el numero " + num + " es la " + i);
			}
			comprobador = comprobador / 10;
		}
	}
}

/* Bucle que da la vuelta al numero:
 * 
 * while (numero > 0) {
 * 	volteado = (volteado * 10) + (numero % 10);
 * 	numero /= 10;
 * 	longitud++;
 * }
 * 
 */
