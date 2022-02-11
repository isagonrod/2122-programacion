package Tema5.Act_Aplicacion;

import java.util.Arrays;

public class Act_13 {

	/* Modifica la actividad de aplicación 5.12. para que la función no modifique la tabla que se pasa como parámetro,
	 * y en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los valores de los elementos.
	 */

	public static void main(String[] args) {
		
		int table[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(table));
		
		table = desordenar(table);
		System.out.println(Arrays.toString(table));
	}
	
	static int [] desordenar (int table[]) {
		int newTable[] = Arrays.copyOf(table, table.length);
		for (int i = 0; i < newTable.length; i++) {
			int posicion = (int)(Math.random()* 9 + 1);
			int aux = newTable[posicion];
			newTable[posicion] = newTable[i];
			newTable[i] = aux;
		}
		return newTable;
	}
}
