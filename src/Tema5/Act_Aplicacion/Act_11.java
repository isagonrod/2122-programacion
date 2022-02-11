package Tema5.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_11 {

	/* Realiza la función: int[] buscarTodos (int t[], int clave), que crea y devuelve una tabla con todos los índices de 
	 * los elementos donde se encuentra la clave de búsqueda. 
	 * En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
	 */

	public static void main(String[] args) {
		
		int table[] = {1,2,3,1,2,3,1,2,3,4};
		int clave = getNumber("Introduce el valor que quieres encontrar: ");
		
		System.out.println(Arrays.toString(buscarTodos(table, clave)));
	}

	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int[] buscarTodos (int table[], int clave) {
		int i, j = 0;
		int resultado[] = new int[table.length];
		Arrays.fill(resultado, -1);
		for (i = 0; i < table.length; i++) {
			if (clave == table[i]) {
				resultado[j] = i;
				j++;
			}
		}
		return resultado;
	}
	
}
