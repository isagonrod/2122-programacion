package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num = 1;
		
		while (num != 0) {
			System.out.println("Dame un numero: ");
			num = sc.nextInt();
			System.out.println("¿Es par? " + (num % 2 == 0));
			System.out.println("¿Es positivo? " + (num >= 0));
			System.out.println("Su cuadrado es: " + Math.pow(num, 2));
		}

	}

}
