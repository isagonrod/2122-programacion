
package Tema5.Act_Aplicacion;

import java.util.Arrays;

public class Act_17 {

	/* Implementa la función: int[] suma (int t[], int numElementos), que crea y devuelve una tabla con las sumas
	 * de los numElementos elementos consecutivos de t.
	 */

	public static void main(String[] args) {
		
		int table[] = new int [6];
		int valorMaximo = 10;
		int numElementos = 3;
		
		rellenar(table, valorMaximo);
		
		System.out.println("Tabla original: " + Arrays.toString(table));
		System.out.println("Tabla nueva: " + Arrays.toString(suma(table, numElementos)));
	}

	static void rellenar (int vector[], int valorMaximo) {
		int aux;
		for (int i = 0; i < vector.length; i++) {
			aux = (int)(Math.random() * valorMaximo + 1);
			vector[i] = aux;
		}
	}
	
	/* A i le decimos que solo puede correr hasta i+grupo (menos uno).
	 * La j está para hacer la suma de los elemenos de la posición i de la nueva tabla.
	 */
	
	static int [] suma (int t[], int numElementos) {
		int i, j, calculo, result[] = new int [0];
		for (i = 0; i + numElementos - 1 < t.length; i++) {
			calculo = 0;
			result = Arrays.copyOf(result, result.length + 1);
			for (j = 0; j < numElementos; j++) {
				calculo += t[i+j];
			}
			result[i] = calculo;
		}
		return result;
	}
}
