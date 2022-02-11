package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_17 {

	/* ENUNCIADO:
	 * Escribe una función que decida si dos números enteros positivos son amigos.
	 * Dos números a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a es igual
	 * a b, y viceversa.
	 */
	
	/*	Dos funciones: sonAmigos(int a, int b) & sumaDivisores (int num)
	 * 	1.- if - else
	 * 	2.- for - if
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Introduce un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		n2 = sc.nextInt();
		
		if (sonAmigos(n1, n2)) {
			System.out.println("Los números son amigos");
		}
		else {
			System.out.println("Los números no son amigos");
		}
	}

	static boolean sonAmigos (int a, int b) {
		int sumaDiv1 = sumaDivisores(a);
		int sumaDiv2 = sumaDivisores(b);

		return sumaDiv1 == b && sumaDiv2 == a;
	}
	
	static int sumaDivisores (int num) {
		int i;
		int suma=0;
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				suma+=i;
			}
		}
		return suma;
	}
}
