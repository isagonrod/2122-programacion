package Tema3.Anexo;

import java.util.Scanner;

public class Act_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i;
		
		System.out.println("Dame un numero entre 1 y 9: ");
		num = sc.nextInt();
		
		for (i = 0; i <=10 ; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
}
