package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_03_20211015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i=0;
		
		do {
			System.out.println("Dame un numero mayor de 7: ");
			num = sc.nextInt();
		} while (num < 7);

		while (i < num-7) {
			i += 7; // Es lo mismo que escribir i = i + 7;
			System.out.println(i);
		}
	}
}
