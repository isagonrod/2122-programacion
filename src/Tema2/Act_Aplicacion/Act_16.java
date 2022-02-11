package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num, valorAbsoluto;
		
		System.out.println("Introduce un numero (positivo o negativo): ");
		num = teclado.nextInt();
		
		valorAbsoluto = num >= 0 ? num : Math.abs(num);
		System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);
		
	}

}
