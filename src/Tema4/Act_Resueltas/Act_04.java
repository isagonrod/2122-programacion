package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {

	// Diseñar una función que recibe como parametros dos numeros enteros y devuelve el maximo de ambos.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Introduce un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		n2 = sc.nextInt();
		
		System.out.println("El mayor de los dos es: " + maximo(n1, n2));
	}
	
	static int maximo (int a, int b) {
		int max;
		if (a < b) {
			max = b;
		} else {
			max = a;
		}
		return (max);
	}
	
}
