package Tema1.Anexo;

import java.util.Scanner;

public class Act_8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		double num1, num2, result;
		int operacion;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextDouble();
		
		System.out.println("Introduce 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir: ");
		operacion = teclado.nextInt();
		
		System.out.println("Segundo numero: ");
		num2 = teclado.nextDouble();
		
		result = operacion == 1 ? num1 + num2 : (operacion == 2 ? num1 - num2 : (operacion == 3 ? num1 * num2 : num1 / num2));
		System.out.println("El resultado es: " + result);

	}

}
