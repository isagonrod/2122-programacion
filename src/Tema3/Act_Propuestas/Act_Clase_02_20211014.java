package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_02_20211014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numPos, cont = 1, suma = 0;
		
		do {
			System.out.println("Introduce un numero positivo: ");
			numPos = sc.nextInt();
		} while (numPos <= 0);
						
		while (cont <= numPos) {
			suma += cont;
			cont++;
		}

		System.out.println("Suma = " + suma);
	}

}
