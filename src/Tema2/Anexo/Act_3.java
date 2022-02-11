package Tema2.Anexo;

import java.util.Scanner;

public class Act_3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El numero mayor es: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("El numero mayor es: " + num3);
		} else {
			System.out.println("Ninguno es mayor");
		}

	}

}
