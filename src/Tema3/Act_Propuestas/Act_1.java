package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int edadMax = 0, edadMin = 100, num = 0;
		
		while (num != -1) {
			System.out.println("Edad: ");
			num = sc.nextInt();
			
			if (num < edadMin && num != -1) {
				edadMin = num;
			}
			if (num > edadMax) {
				edadMax = num;
			}
		}
		
		System.out.println("Edad maxima: " + edadMax);
		System.out.println("Edad minima: " + edadMin);

	}

}
