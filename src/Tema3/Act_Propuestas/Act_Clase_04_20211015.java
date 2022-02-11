package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_04_20211015 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, result=0, i=0;
		
		do {
			System.out.println("Dime un numero entre el 1 y el 10: ");
			num = sc.nextInt();
		} while (num < 1 || num > 10);
		
		while (i <= 10) {
			result = num * i;
			System.out.println(num + " x " + i + " = " + result);
			i++;
		}		
	}
}
