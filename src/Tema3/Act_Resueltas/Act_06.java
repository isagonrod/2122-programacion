package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i;

		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
