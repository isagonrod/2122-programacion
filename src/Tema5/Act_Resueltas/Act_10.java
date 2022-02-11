package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_10 {

	/* Escribir la función: int[] eliminarMayores (int t[], int valor); que crea y devuelve una copia de la tabla t
	 * donde se han eliminado todos los elementos que son mayores que valor.
	 */

	public static void main(String[] args) {
		
		int table[] = new int [10];
		rellenar(table, table.length);
		
		System.out.println("Tabla original: " + Arrays.toString(table));
		int valor = getNumber("Introduce el valor de referencia: ");
		
		table = sinMayores(table, valor);
		
		System.out.println("Tabla sin mayores que " + valor + ": " + Arrays.toString(table));

	}

	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static void rellenar (int vector[], int nElementos) {
		for (int i = 0; i < vector.length; i++) {
			nElementos = (int)(Math.random() * 100 + 1);
			vector[i] = nElementos;
		}
	}
	
	static int[] sinMayores (int t[], int valor) {
		int newTable[] = Arrays.copyOf(t, t.length);
		int i = 0;
		while (i < newTable.length) {
			if (newTable[i] > valor) {
				newTable[i] = newTable[newTable.length-1];
				newTable = Arrays.copyOf(newTable, newTable.length-1);
			} else {
				i++;
			}
		}
		return newTable;
	}
}
