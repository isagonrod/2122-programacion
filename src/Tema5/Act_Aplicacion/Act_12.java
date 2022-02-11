package Tema5.Act_Aplicacion;

import java.util.Arrays;

public class Act_12 {

	/* Escribe la función void desordenar (int t[]), que cambia de forma aleatoria los elementos contenidos en la tabla t.
	 * Si la tabla estuviera ordenada, dejaría de estarlo. 
	 */

	public static void main(String[] args) {
		
		int table[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(table));
		
		desordenar(table);
	}
	
	static void desordenar (int table[]) {
		for (int i = 0; i < table.length; i++) {
			int posicion = (int)(Math.random()* 9 + 1);
			int aux = table[posicion];
			table[posicion] = table[i];
			table[i] = aux;
		}
		System.out.println(Arrays.toString(table));
	}

}
