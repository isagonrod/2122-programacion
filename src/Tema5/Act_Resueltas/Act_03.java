package Tema5.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {

	/* Escribir una aplicación que solicite al usuario cuántos números desea introducir.
	 * A continuación, introducir por teclado esa cantidad de números enteros, y por último,
	 * mostrar el orden inverso al introducido.
	 */

	public static void main(String[] args) {
		
		int cantidadNumeros = getNumber("Dime cuántos números quieres introducir: ");
		int table[] = new int [cantidadNumeros];
		
		for (int i = 0; i < table.length; i++) {
			table[i] = getNumber("Introduce número: ");
		}
		
		System.out.print("Los números en orden inverso son: ");
		for (int i = table.length - 1; i >= 0; i--) {
			System.out.print(table[i] + " ");
		}
	
	}
	
	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}

}
