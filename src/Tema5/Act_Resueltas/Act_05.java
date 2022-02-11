package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_05 {

	/* Escribir la función int[] rellenaPares (int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada,
	 * que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
	 */

	public static void main(String[] args) {
		
		int longitud = getNumber("Introduce la longitud de la tabla: ");
		int fin = getNumber("Introduce donde quieres que termine el rango de números aleatorios: ");
		int table[];
		
		table = rellenaPares (longitud, fin);

		System.out.println(Arrays.toString(table));
	}
	
	static int[] rellenaPares (int longitud, int fin) {
		int table[] = new int [longitud];
		int i = 0;
		while (i < longitud) {
			int valor = (int) (Math.random()* fin + 2);
			if (valor % 2 == 0) {
				table[i] = valor;
				i++;
			}
		}
		Arrays.sort(table);
		return table;
	}
	
	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}

}
