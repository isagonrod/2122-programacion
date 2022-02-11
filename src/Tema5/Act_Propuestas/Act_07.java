package Tema5.Act_Propuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_07 {

	/* El "número de la suerte" de una persona puede calcularse a partir de sus números favoritos.
	 * De entre estos, se seleccionan dos diferentes al azar, que se eliminarán de la lista,
	 * pero en su lugar se añade la media aritmética de los dos eliminados a la lista de números favoritos.
	 * El proceso se repite hasta que solo quede un número, que resultará el número de la suerte para esa persona.
	 * Para calcular bien el número de la suerte es imprescindible que la lista de números se encuentre siempre ordenada.
	 * 
	 * Escribe una aplicación que solicite al usuario sus números favoritos y calcula su número de la suerte.
	 */

	public static void main(String[] args) {
		
		int num = 0;
		int numSuerte[] = new int [0];
		
		System.out.println("Introduce todos tus números favoritos. Cuando ya no tengas más, introduce -1");
		
		do {
			num = getNumber("Introduce número: ");
			if (num != -1) {
				numSuerte = Arrays.copyOf(numSuerte, numSuerte.length+1);
				numSuerte[numSuerte.length-1] = num;
			}
		} while (num != -1);
		
		Arrays.sort(numSuerte);
		System.out.println("Estos son tus números de la suerte: " + Arrays.toString(numSuerte));
		
		while (numSuerte.length > 1) {
			int indiceAzar = (int)(Math.random()*numSuerte.length);
			int elemento1 = numSuerte[indiceAzar];
			
			numSuerte = borrar(numSuerte, indiceAzar);
			
			indiceAzar = (int)(Math.random()*numSuerte.length);
			int elemento2 = numSuerte[indiceAzar];
			numSuerte = borrar(numSuerte, indiceAzar);
			
			int media = (elemento1 + elemento2) / 2;
			
			numSuerte = insercionOrdenada(numSuerte, media);
			
			System.out.println(Arrays.toString(numSuerte));
		}
		
		System.out.println("Su número de la suerte es: " + numSuerte[0]);
	}

	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int [] borrar (int t[], int indice) {
		System.arraycopy(t, indice+1, t, indice, t.length - indice -1);
		t = Arrays.copyOf(t, t.length-1);
		return t;
	}
	
	static int [] insercionOrdenada (int table[], int nuevo) {
		int indiceInsercion = Arrays.binarySearch(table, nuevo);
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion -1;
		}
		int newTable[] = new int [table.length +1];
		
		System.arraycopy(table, 0, newTable, 0, indiceInsercion);	/* copia lo de delante y lo de detrás del hueco nuevo */
		System.arraycopy(table, indiceInsercion, newTable, indiceInsercion + 1, table.length - indiceInsercion);
		
		newTable[indiceInsercion] = nuevo;
		table = newTable;
		
		return newTable;
	}
}
