package Tema1.Anexo;

import java.util.Scanner;

public class Act_6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("El valor intercambiado del primer numero es de " + num1 + ", y el del segundo es " + num2);
		
	}

}
