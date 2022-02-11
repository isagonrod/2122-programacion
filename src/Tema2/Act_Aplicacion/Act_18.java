package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int i, num1, num2, result, correctResult = 0, operacion;
		
		num1 = (int) (Math.random()*99 + 1);
		num2 = (int) (Math.random()*99 + 1);		
		operacion = (int) (Math.random()*3);
		
		switch (operacion) {
			case 0 -> {System.out.println(num1 + "+" + num2); correctResult = num1 + num2;}
			case 1 -> {System.out.println(num1 + "-" + num2); correctResult = num1 - num2;}
			case 2 -> {System.out.println(num1 + "x" + num2); correctResult = num1 * num2;}
			default -> {System.out.println("ERROR");}
		}
		
		System.out.println("Introduce el resultado: ");
		result = teclado.nextInt();
		
		if (result == correctResult) {
			System.out.println("�CORRECTO!");
		} else {
			System.out.println("�INCORRECTO!");
		}

	}

}