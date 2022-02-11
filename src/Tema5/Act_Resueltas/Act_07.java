package Tema5.Act_Resueltas;

import java.util.Arrays;

public class Act_07 {

	/* Implementar la función: int [] sinRepetidos (int t[]), que construye y devuelve una tabla de la longitud apropiada, con los elementos de t,
	 * donde se han eliminado los datos repetidos.
	 */

	public static void main(String[] args) {
		
		int table[] = {1,2,3,3,5,6,6,69};
		System.out.println(Arrays.toString(sinRepetidos(table)));
	}
	
	static int [] sinRepetidos (int t[]) {
		int temporal[] = new int [0];
		for (int elemento : t) {
			if (buscar (temporal, elemento) == -1) {
				temporal = Arrays.copyOf(temporal, temporal.length +1);
				temporal[temporal.length-1] = elemento;
			}
		}
		return temporal;
	}
	
	static int buscar (int table[], int valor) {
		boolean encontrado = false;
		int i;
		for (i = 0; i < table.length && !encontrado; i++) {
			if (table[i] == valor) {
				encontrado = true;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
}
