package Tema5.Act_Propuestas;

import java.util.Scanner;

public class Act_04 {

	/* Escribe una función: int buscar (int t[], int clave), que busca de forma secuencial en la tabla t[] el valor clave.
	 * En caso de encontrarlo, devuelve en qué posición lo encuentra: y en caso contrario, devolverá -1.
	 */

	public static void main(String[] args) {
		
		int table[] = new int [5];
		int clave, valor;
		
		clave = getNumber("Introduce el valor que quieres encontrar: ");
		valor = (int) (Math.random()* 100 + 1);
		
		System.out.println("El número " + clave + " está en la posición " + buscarElemento(table, clave, valor));

	}
	
	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();		
	}

	static int buscarElemento (int table[], int clave, int valor) {
		boolean encontrado = false;
		int i;
		for (i = 0; i < table.length && !encontrado; i++) {
			if (clave == valor) {
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
