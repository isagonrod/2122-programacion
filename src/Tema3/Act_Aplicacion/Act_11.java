package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_11 {
	
	// Pasar de decimal a binario

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int decimal, division;
		
		System.out.println("Dame un numero entero: ");
		decimal = sc.nextInt();
		
		division = decimal;
		
		do {
			System.out.print(division%2);
			division = division / 2;
			if (division <= 1) {
				System.out.print(division);
			}
		} while (division > 1);

	}

}
