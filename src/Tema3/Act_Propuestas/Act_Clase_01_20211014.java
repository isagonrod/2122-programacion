package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_01_20211014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, cont;
				
		do {
			System.out.println("Introduce un numero par: ");
			num = sc.nextInt();
		} while (num%2 != 0);
		
		cont = 0;
		
		while (cont <= num) {
			System.out.println(cont);
			cont += 2;
		}
		

	}

}
