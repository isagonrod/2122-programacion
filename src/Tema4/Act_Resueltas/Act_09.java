package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_09 {

	// Repetir Act_04 con una versión que calcule el máximo de tres números
	
	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		
		n1 = getNumber("Introduce un numero: ");
		n2 = getNumber("Introduce otro número: ");
		n3 = getNumber("Introduce otro número más: ");
		
		System.out.println("El mayor de los tres es: " + maximo(n1, n2, n3));
	}
	
	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int maximo (int a, int b, int c) {
		int max;
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}
		return (max);
	}
}
