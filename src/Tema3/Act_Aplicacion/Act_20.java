package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_20 {
	
	// Contar dinero

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, suma=0;
		
		do {
			System.out.println("Introduce cantidad de dinero: ");
			num = sc.nextInt();
			suma += num;
		} while (num != 0);
		System.out.println("Total = " + suma);
	}
}
