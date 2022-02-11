package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int i, num, result, correctResult = 0;
		
		for (i = 0; i < 2; i++) {
			num = (int) (Math.random()*99 + 1);
			System.out.println(num);
			correctResult = num + correctResult;
		}
		
		System.out.println("Suma los numeros anteriores");
		System.out.println("Resultado: ");
		result = teclado.nextInt();
		
		if (result == correctResult) {
			System.out.println("�CORRECTO!");
		} else {
			System.out.println("�INCORRECTO!");
		}

	}

}
