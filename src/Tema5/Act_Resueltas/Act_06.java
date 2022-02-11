package Tema5.Act_Resueltas;

import java.util.Arrays;

public class Act_06 {

	/* Definir una función que tome como parámentros dos tablas, la primera con los 6 números de una apuesta
	 * de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora.
	 * La función devolverá el número de aciertos.
	 */

	public static void main(String[] args) {
		
		int apuestaPrimitiva[] = {3,10,12,8,5,23};
		int combinacionGanadora [] = {3,10,15,23,31,48};
		
		System.out.println("Has tenido " + primitiva(apuestaPrimitiva,combinacionGanadora) + " aciertos");

	}
	
	static int primitiva (int apuestaPrimitiva[], int combinacionGanadora[]) {
		int aciertos = 0;
		for (int a : apuestaPrimitiva) {
			if (Arrays.binarySearch(combinacionGanadora, a) >= 0) {
				aciertos++;
			}
		}
		return aciertos;
	}
}
