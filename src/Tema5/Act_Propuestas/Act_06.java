package Tema5.Act_Propuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Act_06 {

	/* Crea una función que realice el borrado de un elemento de una tabla ordenada. */

	public static void main(String[] args) {
		
		int table[] = new int [5];
		rellenar(table, table.length);
		Arrays.sort(table);
		
		System.out.println("Tabla original: " + Arrays.toString(table));
		int valor = getNumber("Introduce valor a eliminar: ");
		
		table = aBorrar(table, valor);
		System.out.println("Tabla nueva: " + Arrays.toString(table));
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
	
	static int [] aBorrar (int table[], int valor) {
		int indiceBorrado = Arrays.binarySearch(table, valor);
		if (indiceBorrado >= 0) {
			System.arraycopy(table, indiceBorrado + 1, table, indiceBorrado, table.length - indiceBorrado - 1);
			table = Arrays.copyOf(table, table.length - 1);
		}
		return table;
	}
}
