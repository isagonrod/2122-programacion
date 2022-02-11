package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_02 {

	// Pedir dos numeros enteros y mostrar todos los numeros que hay entre ellos

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Introduce un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		n2 = sc.nextInt();
		
		System.out.println();
		orden (n1, n2);
	}
	
	static void orden (int n1, int n2) {
		int mayor = n1 > n2 ? n1 : n2;
		int menor = n1 < n2 ? n1 : n2;
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
