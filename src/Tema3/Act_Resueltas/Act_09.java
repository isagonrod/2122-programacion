package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i, result=0;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i = 0; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " x " + i + " = " + result);
		}

	}

}
