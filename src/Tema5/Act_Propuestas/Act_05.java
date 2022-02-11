package Tema5.Act_Propuestas;

import java.util.Arrays;

public class Act_05 {

	/* Escribe en una función el comportamiento de la inserción ordenada. */

	public static void main(String[] args) {
		 
		int table[] = {1,2,3,4,6,7,8};
		int nuevo = 5;
		
		System.out.println("Tabla original: " + Arrays.toString(table));
		System.out.println("Tabla ampliada: " + Arrays.toString(insercionOrdenada (table, nuevo)));
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
