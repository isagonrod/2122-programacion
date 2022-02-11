package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		
		do {
		System.out.println("Dame un numero positivo: ");
		num = sc.nextInt();
		} while (num <= 0);
		
		while (num > 0) {
			System.out.println(num%10);
			num = num / 10;
		}
	}
}
