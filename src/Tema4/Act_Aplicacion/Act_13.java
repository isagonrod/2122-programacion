package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_13 {

	// Crea la funcion muestraPares (int n) que muestre por consola los primeros n numeros pares

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		muestraPares (num);
	}

	static int muestraPares (int n) {
		int i;
		for (i = 1; i <= n*2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		return i;
	}
}
