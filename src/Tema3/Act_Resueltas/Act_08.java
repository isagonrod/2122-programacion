package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, suma = 0, i;
		double media;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Dame un numero: ");
			num = sc.nextInt();
			suma += num;
		}
		media = suma / 10.0;
		System.out.println("La media es: " + media);
	}

}
