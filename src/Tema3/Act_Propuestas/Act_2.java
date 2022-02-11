package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int num, i;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i = 0; i < num; i++) {
			System.out.println("Eco...");
		}
	}
}
