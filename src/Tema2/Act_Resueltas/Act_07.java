package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else {
			if (num1 > num3 && num3 > num2) {
				System.out.println(num1 + ", " + num3 + ", " + num2);
			} else {
				if (num2 > num1 && num1 > num3) {
					System.out.println(num2 + ", " + num1 + ", " + num3);
				} else {
					if (num2 > num3 && num3 > num1) {
						System.out.println(num2 + ", " + num3 + ", " + num1);
					} else {
						if (num3 > num1 && num1 > 2) {
							System.out.println(num3 + ", " + num1 + ", " + num2);
						} else {
							System.out.println(num3 + ", " + num2 + ", " + num1);
							
						}
					}
				}
			}
		}
		
	}

}
