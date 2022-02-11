package Tema5.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {

	/* Diseñar una función: int maximo (int t[]), que devuelva el máximo valor contenido en la tabla t. */

	public static void main(String[] args) {
		
		int longitud = getNumber("Introduce la longitud de la tabla: ");
		int table[] = new int [longitud];
		
		for (int i = 0; i < table.length; i++) {
			table[i] = (int) (Math.random() * 100 + 1);
		}
		
		int maximo;
		System.out.println("El valor máximo de la tabla es: " + maximo(table));

	}
	
	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int maximo (int table[]) {
		int max = table[0];
		for (int i: table) {
			max = i;
		}
		return max;
	}

}
