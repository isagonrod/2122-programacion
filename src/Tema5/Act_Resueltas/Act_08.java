package Tema5.Act_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_08 {

	/* Leer y almacenar n números enteros en una tabla, a partir de la que se construirán otras dos tablas con los elementos con 
	 * valores pares e impares de la primera, respectivamente. Las tablas pares e impares deben mostrarse ordenadas.
	 */

	public static void main(String[] args) {
		
		int n = getNumber("Introduce la longitud de la tabla: ");
		int table[] = new int [n];
			
		for (int i = 0; i < table.length; i++) {
			int valor = (int)(Math.random()*100);
			table[i] = valor;
		}
		
		Arrays.sort(table);
		System.out.println("Tabla original: " + Arrays.toString(table));
		
		int pares[] = new int [0];
		int impares[] = new int [0];
		
		for (int num: table) {
			if (num % 2 == 0) {
				pares = Arrays.copyOf(pares, pares.length+1);
				pares[pares.length-1] = num;
			} else {
				impares = Arrays.copyOf(impares, impares.length+1);
				impares[impares.length-1] = num;
			}
		}
		System.out.println("Pares: " + Arrays.toString(pares));
		System.out.println("Impares: " + Arrays.toString(impares));
	}

	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
}
